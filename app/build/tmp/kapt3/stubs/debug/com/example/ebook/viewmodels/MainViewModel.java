package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001_B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\rJ\u000e\u0010K\u001a\u0002012\u0006\u0010J\u001a\u00020\rJ\u000e\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020\rJ\b\u0010N\u001a\u000201H\u0014J\u0006\u00100\u001a\u000201J\u000e\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020\u0007J\u000e\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020\rJ\u000e\u0010S\u001a\u0002012\u0006\u0010P\u001a\u00020\u0007J\u000e\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020 J\u000e\u0010V\u001a\u0002012\u0006\u0010U\u001a\u00020 J\u0010\u0010W\u001a\u0002012\b\u0010U\u001a\u0004\u0018\u00010 J\u0010\u0010X\u001a\u0002012\b\u0010Y\u001a\u0004\u0018\u000105J\u0010\u0010Z\u001a\u0002012\b\u0010[\u001a\u0004\u0018\u000109J\u000e\u0010\\\u001a\u0002012\u0006\u0010P\u001a\u00020\u0007J\u000e\u0010C\u001a\u0002012\u0006\u0010]\u001a\u00020\u0018J\u000e\u0010F\u001a\u0002012\u0006\u0010^\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR \u0010*\u001a\b\u0012\u0004\u0012\u00020 0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR \u00100\u001a\b\u0012\u0004\u0012\u0002010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR\u000e\u0010?\u001a\u00020@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010C\u001a\b\u0012\u0004\u0012\u0002010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR \u0010F\u001a\b\u0012\u0004\u0012\u0002010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\t\"\u0004\bH\u0010\u000b\u00a8\u0006`"}, d2 = {"Lcom/example/ebook/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountRepository", "Lcom/example/ebook/repository/AccountRepository;", "appBarVisibility", "Landroidx/lifecycle/MutableLiveData;", "", "getAppBarVisibility", "()Landroidx/lifecycle/MutableLiveData;", "setAppBarVisibility", "(Landroidx/lifecycle/MutableLiveData;)V", "bottomBarTab", "", "getBottomBarTab", "setBottomBarTab", "bottomBarVisibility", "getBottomBarVisibility", "setBottomBarVisibility", "currentAccount", "Lcom/example/ebook/model/Account;", "getCurrentAccount", "setCurrentAccount", "currentAccountSubscription", "Lcom/example/ebook/model/Subscription;", "getCurrentAccountSubscription", "setCurrentAccountSubscription", "currentAccountSubscriptionHistory", "Lcom/example/ebook/model/SubscriptionHistory;", "getCurrentAccountSubscriptionHistory", "setCurrentAccountSubscriptionHistory", "currentState", "Lcom/example/ebook/viewmodels/MainViewModel$Companion$CurrentState;", "kotlin.jvm.PlatformType", "getCurrentState", "setCurrentState", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "lastState", "getLastState", "setLastState", "lastState2", "getLastState2", "setLastState2", "resetAudio", "", "getResetAudio", "setResetAudio", "selectedAuthor", "Lcom/example/ebook/model/Author;", "getSelectedAuthor", "setSelectedAuthor", "selectedBook", "Lcom/example/ebook/model/Book;", "getSelectedBook", "setSelectedBook", "songControlVisibility", "getSongControlVisibility", "setSongControlVisibility", "subscriptionHistoryRepository", "Lcom/example/ebook/repository/SubscriptionHistoryRepository;", "subscriptionRepository", "Lcom/example/ebook/repository/SubscriptionRepository;", "updateSubscription", "getUpdateSubscription", "setUpdateSubscription", "updateSubscriptionHistory", "getUpdateSubscriptionHistory", "setUpdateSubscriptionHistory", "findAccountByID", "accountID", "findAccountSubscription", "findAccountSubscriptionHistory", "subscriptionID", "onCleared", "updateAppBarVisibility", "boolean", "updateBottomBarTab", "index", "updateBottomBarVisibility", "updateCurrentState", "state", "updateLastState", "updateLastState2", "updateSelectedAuthor", "author", "updateSelectedBook", "book", "updateSongControlVisibility", "subscription", "subscriptionHistory", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private com.example.ebook.repository.AccountRepository accountRepository;
    private com.example.ebook.repository.SubscriptionRepository subscriptionRepository;
    private com.example.ebook.repository.SubscriptionHistoryRepository subscriptionHistoryRepository;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Book> selectedBook;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> selectedAuthor;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> lastState;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> lastState2;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> currentState;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> appBarVisibility;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> songControlVisibility;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> bottomBarVisibility;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> currentAccount;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> currentAccountSubscription;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> currentAccountSubscriptionHistory;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> resetAudio;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> bottomBarTab;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> updateSubscription;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> updateSubscriptionHistory;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.viewmodels.MainViewModel.Companion Companion = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Book> getSelectedBook() {
        return null;
    }
    
    public final void setSelectedBook(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Book> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> getSelectedAuthor() {
        return null;
    }
    
    public final void setSelectedAuthor(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> getLastState() {
        return null;
    }
    
    public final void setLastState(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> getLastState2() {
        return null;
    }
    
    public final void setLastState2(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> getCurrentState() {
        return null;
    }
    
    public final void setCurrentState(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAppBarVisibility() {
        return null;
    }
    
    public final void setAppBarVisibility(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSongControlVisibility() {
        return null;
    }
    
    public final void setSongControlVisibility(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBottomBarVisibility() {
        return null;
    }
    
    public final void setBottomBarVisibility(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> getCurrentAccount() {
        return null;
    }
    
    public final void setCurrentAccount(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Account> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> getCurrentAccountSubscription() {
        return null;
    }
    
    public final void setCurrentAccountSubscription(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Subscription> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> getCurrentAccountSubscriptionHistory() {
        return null;
    }
    
    public final void setCurrentAccountSubscriptionHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.SubscriptionHistory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getResetAudio() {
        return null;
    }
    
    public final void setResetAudio(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getBottomBarTab() {
        return null;
    }
    
    public final void setBottomBarTab(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getUpdateSubscription() {
        return null;
    }
    
    public final void setUpdateSubscription(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getUpdateSubscriptionHistory() {
        return null;
    }
    
    public final void setUpdateSubscriptionHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    public final void updateSubscription(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Subscription subscription) {
    }
    
    public final void updateSubscriptionHistory(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.SubscriptionHistory subscriptionHistory) {
    }
    
    public final void findAccountSubscription(int accountID) {
    }
    
    public final void findAccountSubscriptionHistory(int subscriptionID) {
    }
    
    public final void findAccountByID(int accountID) {
    }
    
    public final void updateSelectedBook(@org.jetbrains.annotations.Nullable
    com.example.ebook.model.Book book) {
    }
    
    public final void updateSelectedAuthor(@org.jetbrains.annotations.Nullable
    com.example.ebook.model.Author author) {
    }
    
    public final void updateCurrentState(@org.jetbrains.annotations.NotNull
    com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState state) {
    }
    
    public final void updateLastState(@org.jetbrains.annotations.NotNull
    com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState state) {
    }
    
    public final void updateLastState2(@org.jetbrains.annotations.Nullable
    com.example.ebook.viewmodels.MainViewModel.Companion.CurrentState state) {
    }
    
    public final void updateAppBarVisibility(boolean p0_32355860) {
    }
    
    public final void updateSongControlVisibility(boolean p0_32355860) {
    }
    
    public final void updateBottomBarVisibility(boolean p0_32355860) {
    }
    
    public final void updateBottomBarTab(int index) {
    }
    
    public final void resetAudio() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ebook/viewmodels/MainViewModel$Companion;", "", "()V", "CurrentState", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/ebook/viewmodels/MainViewModel$Companion$CurrentState;", "", "(Ljava/lang/String;I)V", "Home", "DetailBook", "ReadBook", "Search", "SignIn", "User", "SignUp", "Author", "Subscription", "Favorite", "app_debug"})
        public static enum CurrentState {
            /*public static final*/ Home /* = new Home() */,
            /*public static final*/ DetailBook /* = new DetailBook() */,
            /*public static final*/ ReadBook /* = new ReadBook() */,
            /*public static final*/ Search /* = new Search() */,
            /*public static final*/ SignIn /* = new SignIn() */,
            /*public static final*/ User /* = new User() */,
            /*public static final*/ SignUp /* = new SignUp() */,
            /*public static final*/ Author /* = new Author() */,
            /*public static final*/ Subscription /* = new Subscription() */,
            /*public static final*/ Favorite /* = new Favorite() */;
            
            CurrentState() {
            }
        }
    }
}