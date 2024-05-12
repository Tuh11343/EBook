package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020*J\b\u0010,\u001a\u00020%H\u0014J\u0016\u0010-\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010.\u001a\u00020/J\u000e\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\rJ\u000e\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u0011R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\t\u00a8\u00065"}, d2 = {"Lcom/example/ebook/viewmodels/SubscriptionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountFound", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/ebook/model/Account;", "getAccountFound", "()Landroidx/lifecycle/MutableLiveData;", "setAccountFound", "(Landroidx/lifecycle/MutableLiveData;)V", "accountRepository", "Lcom/example/ebook/repository/AccountRepository;", "accountSubscription", "Lcom/example/ebook/model/Subscription;", "getAccountSubscription", "setAccountSubscription", "accountSubscriptionHistory", "Lcom/example/ebook/model/SubscriptionHistory;", "getAccountSubscriptionHistory", "setAccountSubscriptionHistory", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "paymentRepository", "Lcom/example/ebook/repository/PaymentRepository;", "paymentResponse", "Lcom/google/gson/JsonElement;", "getPaymentResponse", "setPaymentResponse", "subscriptionHistoryRepository", "Lcom/example/ebook/repository/SubscriptionHistoryRepository;", "subscriptionRepository", "Lcom/example/ebook/repository/SubscriptionRepository;", "updateAccount", "", "getUpdateAccount", "setUpdateAccount", "findAccountByID", "accountID", "", "findAccountSubscription", "onCleared", "paymentRequest", "total", "", "account", "updateSubscription", "subscription", "updateSubscriptionHistory", "subscriptionHistory", "app_debug"})
public final class SubscriptionViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.SubscriptionRepository subscriptionRepository;
    private com.example.ebook.repository.SubscriptionHistoryRepository subscriptionHistoryRepository;
    private com.example.ebook.repository.PaymentRepository paymentRepository;
    private com.example.ebook.repository.AccountRepository accountRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> accountFound;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> accountSubscription;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> accountSubscriptionHistory;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.google.gson.JsonElement> paymentResponse;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> updateAccount;
    
    public SubscriptionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> getAccountFound() {
        return null;
    }
    
    public final void setAccountFound(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> getAccountSubscription() {
        return null;
    }
    
    public final void setAccountSubscription(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> getAccountSubscriptionHistory() {
        return null;
    }
    
    public final void setAccountSubscriptionHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.google.gson.JsonElement> getPaymentResponse() {
        return null;
    }
    
    public final void setPaymentResponse(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.google.gson.JsonElement> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getUpdateAccount() {
        return null;
    }
    
    public final void setUpdateAccount(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    public final void findAccountSubscription(int accountID) {
    }
    
    public final void findAccountByID(int accountID) {
    }
    
    public final void updateAccount(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Account account) {
    }
    
    public final void updateSubscriptionHistory(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.SubscriptionHistory subscriptionHistory) {
    }
    
    public final void updateSubscription(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Subscription subscription) {
    }
    
    public final void paymentRequest(int accountID, float total) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}