package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010&J\u001f\u0010\'\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010(J1\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010&J\b\u0010)\u001a\u00020!H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006*"}, d2 = {"Lcom/example/ebook/viewmodels/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "bookList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/ebook/model/Book;", "getBookList", "()Landroidx/lifecycle/MutableLiveData;", "setBookList", "(Landroidx/lifecycle/MutableLiveData;)V", "bookRepository", "Lcom/example/ebook/repository/BookRepository;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "filterGenreList", "Lcom/example/ebook/model/Genre;", "getFilterGenreList", "setFilterGenreList", "genreRepository", "Lcom/example/ebook/repository/GenreRepository;", "length", "", "getLength", "setLength", "loadMoreBookList", "getLoadMoreBookList", "setLoadMoreBookList", "loadBookList", "", "name", "genreID", "limit", "offset", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "loadFilterGenres", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "onCleared", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.GenreRepository genreRepository;
    private com.example.ebook.repository.BookRepository bookRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> filterGenreList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> bookList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> length;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> loadMoreBookList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    
    public SearchViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> getFilterGenreList() {
        return null;
    }
    
    public final void setFilterGenreList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> getBookList() {
        return null;
    }
    
    public final void setBookList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLength() {
        return null;
    }
    
    public final void setLength(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> getLoadMoreBookList() {
        return null;
    }
    
    public final void setLoadMoreBookList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void loadFilterGenres(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    public final void loadBookList(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.Integer genreID, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    public final void loadMoreBookList(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.Integer genreID, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}