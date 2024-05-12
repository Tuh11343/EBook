package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/ebook/viewmodels/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "bookList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/ebook/model/Book;", "getBookList", "()Landroidx/lifecycle/MutableLiveData;", "setBookList", "(Landroidx/lifecycle/MutableLiveData;)V", "bookRepository", "Lcom/example/ebook/repository/BookRepository;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "findBookList", "", "id", "", "onCleared", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.BookRepository bookRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> bookList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    
    public FavoriteViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> getBookList() {
        return null;
    }
    
    public final void setBookList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void findBookList(int id) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}