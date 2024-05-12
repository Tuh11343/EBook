package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/ebook/viewmodels/UserLoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setErrorLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "user", "Lcom/example/ebook/model/User;", "getUser", "setUser", "userRepository", "Lcom/example/ebook/repository/UserRepository;", "findUserByAccountID", "", "id", "", "onCleared", "app_debug"})
public final class UserLoginViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.UserRepository userRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> user;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    
    public UserLoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void findUserByAccountID(int id) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}