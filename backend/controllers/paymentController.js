require('dotenv').config();
const catchAsync = require('../utils/catchAsync')
const stripe = require('stripe')(process.env.STRIPE_SECRET_KEY);


exports.pay=catchAsync(async (req,res)=>{
    const customer = await stripe.customers.create({
        email:'tuh@gmail.com',
        name:'tuh'
      });
      const ephemeralKey = await stripe.ephemeralKeys.create(
        {customer: customer.id},
        {apiVersion: '2023-10-16'}
      );
      const paymentIntent = await stripe.paymentIntents.create({
        amount: 1000,
        currency: 'usd',
        customer: customer.id,
        description:"Testing android course",
        // In the latest version of the API, specifying the `automatic_payment_methods` parameter
        // is optional because Stripe enables its functionality by default.
        automatic_payment_methods: {
          enabled: true,
        },
      });
    
      res.json({
        paymentIntent: paymentIntent.client_secret,
        ephemeralKey: ephemeralKey.secret,
        customer: customer.id,
        publishableKey: process.env.STRIPE_PUBLISHABLE_KEY
      });
})