package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020\u0007J\u000e\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\rJ\u000e\u00106\u001a\u00020-2\u0006\u00105\u001a\u00020\rJ\u000e\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0014J\u000e\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0018J\u000e\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\u001eJ\b\u0010=\u001a\u00020-H\u0014J\u000e\u0010>\u001a\u00020-2\u0006\u00103\u001a\u00020\u0007J\u000e\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b\'\u0010\u000bR\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/example/ebook/viewmodels/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountRepository", "Lcom/example/ebook/repository/AccountRepository;", "createdAccount", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/ebook/model/Account;", "getCreatedAccount", "()Landroidx/lifecycle/MutableLiveData;", "setCreatedAccount", "(Landroidx/lifecycle/MutableLiveData;)V", "createdGoogleSubscription", "Lcom/example/ebook/model/Subscription;", "getCreatedGoogleSubscription", "setCreatedGoogleSubscription", "createdSubscription", "getCreatedSubscription", "setCreatedSubscription", "createdSubscriptionHistory", "Lcom/example/ebook/model/SubscriptionHistory;", "getCreatedSubscriptionHistory", "setCreatedSubscriptionHistory", "createdUser", "Lcom/example/ebook/model/User;", "getCreatedUser", "setCreatedUser", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "findAccount", "getFindAccount", "setFindAccount", "googleAccount", "", "getGoogleAccount", "setGoogleAccount", "subscriptionHistoryRepository", "Lcom/example/ebook/repository/SubscriptionHistoryRepository;", "subscriptionRepository", "Lcom/example/ebook/repository/SubscriptionRepository;", "updateAccountUnit", "", "getUpdateAccountUnit", "setUpdateAccountUnit", "userRepository", "Lcom/example/ebook/repository/UserRepository;", "createAccount", "account", "createGoogleSubscription", "subscription", "createSubscription", "createSubscriptionHistory", "subscriptionHistory", "createUser", "user", "findAccountByEmail", "email", "onCleared", "updateAccount", "updateGoogleAccount", "boolean", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.AccountRepository accountRepository;
    private com.example.ebook.repository.UserRepository userRepository;
    private com.example.ebook.repository.SubscriptionRepository subscriptionRepository;
    private com.example.ebook.repository.SubscriptionHistoryRepository subscriptionHistoryRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> createdAccount;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> createdUser;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> createdSubscriptionHistory;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> createdSubscription;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> createdGoogleSubscription;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> googleAccount;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> updateAccountUnit;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> findAccount;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    
    public SignUpViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> getCreatedAccount() {
        return null;
    }
    
    public final void setCreatedAccount(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> getCreatedUser() {
        return null;
    }
    
    public final void setCreatedUser(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> getCreatedSubscriptionHistory() {
        return null;
    }
    
    public final void setCreatedSubscriptionHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> getCreatedSubscription() {
        return null;
    }
    
    public final void setCreatedSubscription(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> getCreatedGoogleSubscription() {
        return null;
    }
    
    public final void setCreatedGoogleSubscription(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGoogleAccount() {
        return null;
    }
    
    public final void setGoogleAccount(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getUpdateAccountUnit() {
        return null;
    }
    
    public final void setUpdateAccountUnit(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> getFindAccount() {
        return null;
    }
    
    public final void setFindAccount(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void createAccount(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Account account) {
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.User user) {
    }
    
    public final void createSubscription(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Subscription subscription) {
    }
    
    public final void createGoogleSubscription(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Subscription subscription) {
    }
    
    public final void createSubscriptionHistory(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.SubscriptionHistory subscriptionHistory) {
    }
    
    public final void findAccountByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void updateAccount(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Account account) {
    }
    
    public final void updateGoogleAccount(boolean p0_32355860) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}