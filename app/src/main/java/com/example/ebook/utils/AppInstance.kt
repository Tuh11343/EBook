package com.example.ebook.utils

import com.example.ebook.model.Account
import com.example.ebook.model.Subscription
import com.example.ebook.model.User


class AppInstance {

    companion object{
        var REWIND_REQUEST_CODE=0
        var FF_REQUEST_CODE=1
        var PLAY_PAUSE_REQUEST_CODE=2
        var CLOSE_REQUEST_CODE=3
        var ACCOUNT_ID_KEY=99
        var IS_GOOGLE_ACCOUNT=88
        var currentAccount: Account?=null
        var currentUser: User?=null
        var currentSubscription: Subscription?=null
        var isGoogleAccount:Boolean=false
    }

}