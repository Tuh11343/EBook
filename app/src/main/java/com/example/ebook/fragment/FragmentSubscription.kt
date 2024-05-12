package com.example.ebook.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ebook.databinding.FragmentSubscriptionBinding
import com.example.ebook.model.Book
import com.example.ebook.model.Subscription
import com.example.ebook.model.SubscriptionHistory
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.MainViewModel
import com.example.ebook.viewmodels.SubscriptionViewModel
import com.stripe.android.PaymentConfiguration
import com.stripe.android.paymentsheet.PaymentSheet
import com.stripe.android.paymentsheet.PaymentSheetResult
import java.io.IOException
import java.util.Calendar


class FragmentSubscription(
) : Fragment() {

    private lateinit var binding: FragmentSubscriptionBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var subscriptionViewModel: SubscriptionViewModel
    private var configuration: PaymentSheet.CustomerConfiguration? = null
    private lateinit var paymentIntentClientSecret: String
    private lateinit var paymentSheet: PaymentSheet


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        subscriptionViewModel =
            ViewModelProvider(requireActivity())[SubscriptionViewModel::class.java]
        binding = FragmentSubscriptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        paymentSheet = PaymentSheet(this, this::onPaymentSheetResult)
    }

    override fun onStart() {
        super.onStart()

        binding.btnBack.setOnClickListener{
            mainViewModel.updateBottomBarTab(3)
        }

        if (AppInstance.currentAccount==null|| AppInstance.currentAccount!!.id==null) {
            Toast.makeText(requireContext(),"Bạn chưa đăng nhập",Toast.LENGTH_SHORT).show()
        } else {
            subscriptionViewModel.findAccountSubscription(AppInstance.currentAccount!!.id!!)
        }

        observe()
    }

    private fun observe() {
        /*observeAccount()*/
        observeAccountSubscription()
        observePaymentRequest()

    }

    /*private fun observeAccount() {
        subscriptionViewModel.accountFound.observe(viewLifecycleOwner) { account ->
            subscriptionViewModel.findAccountSubscription(account.id!!)
        }
    }*/

    private fun observeAccountSubscription(){
        subscriptionViewModel.accountSubscription.observe(viewLifecycleOwner){ subscription->
            if(subscription.book_type== Book.BookType.NORMAL){

                binding.normalCheckBox.isChecked=true
                binding.normalCheckBox.text="Đang sử dụng"

                binding.premiumLayout.setOnClickListener {
                    paymentRequest(AppInstance.currentAccount!!.id!!,20000f)
                }

            }else{
                binding.normalLayout.setOnClickListener {
                    Toast.makeText(
                        requireContext(),
                        "Bạn đang sử dụng premium",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                binding.normalCheckBox.isChecked=false
                binding.normalCheckBox.text="Chọn"

                binding.premiumCheckBox.isChecked=true
                binding.premiumCheckBox.text="Đang sử dụng"
            }
        }
    }

    private fun observePaymentRequest() {
        subscriptionViewModel.paymentResponse.observe(viewLifecycleOwner) { response ->
            try {
                var jsonObject = response.asJsonObject
                configuration = PaymentSheet.CustomerConfiguration(
                    jsonObject!!.get("customer").asString,
                    jsonObject!!.get("ephemeralKey").asString
                )
                paymentIntentClientSecret = jsonObject.get("paymentIntent").asString
                PaymentConfiguration.init(
                    requireContext(),
                    jsonObject.get("publishableKey").asString
                )

                if (paymentIntentClientSecret != null)
                    paymentSheet.presentWithPaymentIntent(
                        paymentIntentClientSecret,
                        PaymentSheet.Configuration("Tuh Test")
                    )

            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    private fun onPaymentSheetResult(paymentSheetResult: PaymentSheetResult) {
        when (paymentSheetResult) {
            PaymentSheetResult.Canceled -> {
                Toast.makeText(
                    requireContext(),
                    "Quá trình thanh toán đã tạm hoãn",
                    Toast.LENGTH_SHORT
                ).show()
            }

            PaymentSheetResult.Completed -> {

                //Update account subscription
                val subscriptionHistory= SubscriptionHistory()
                subscriptionHistory.id=subscriptionViewModel.accountSubscription.value!!.subscription_history_id
                subscriptionHistory.price=200f
                subscriptionHistory.start= Calendar.getInstance().time
                val calendar = Calendar.getInstance()
                calendar.add(Calendar.MONTH, 1)
                subscriptionHistory.end = calendar.time
                subscriptionHistory.name= "Premium"

                val subscription= Subscription()
                subscription.id=subscriptionViewModel.accountSubscription.value!!.id
                subscription.subscription_history_id=subscriptionHistory.id!!
                subscription.type="Premium"
                subscription.limit_book_mark=-1
                subscription.price_per_month=200f
                subscription.duration=1
                subscription.book_type=Book.BookType.PREMIUM

                subscriptionViewModel.updateSubscriptionHistory(subscriptionHistory)
                subscriptionViewModel.updateSubscription(subscription)

                //Update UI
                binding.premiumCheckBox.isChecked = true
                binding.premiumCheckBox.text = "Đang sử dụng"
                binding.normalCheckBox.isChecked = false

                Toast.makeText(requireContext(), "Thanh toán thành công", Toast.LENGTH_SHORT).show()
                AppInstance.currentSubscription=subscription

            }

            else -> {
                Toast.makeText(requireContext(), "Thanh toán thất bại", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun paymentRequest(accountID:Int,total:Float) {
        subscriptionViewModel.paymentRequest(accountID,total)
    }


}


