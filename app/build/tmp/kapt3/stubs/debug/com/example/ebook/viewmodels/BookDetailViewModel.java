package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'J\'\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\'2\b\u0010+\u001a\u0004\u0018\u00010\'2\b\u0010,\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010-J\'\u0010.\u001a\u00020%2\u0006\u0010*\u001a\u00020\'2\b\u0010+\u001a\u0004\u0018\u00010\'2\b\u0010,\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010-J\'\u0010/\u001a\u00020%2\u0006\u0010*\u001a\u00020\'2\b\u0010+\u001a\u0004\u0018\u00010\'2\b\u0010,\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010-J\b\u00100\u001a\u00020%H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/ebook/viewmodels/BookDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "authorBookList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/ebook/model/Book;", "getAuthorBookList", "()Landroidx/lifecycle/MutableLiveData;", "setAuthorBookList", "(Landroidx/lifecycle/MutableLiveData;)V", "authorList", "Lcom/example/ebook/model/Author;", "getAuthorList", "setAuthorList", "authorRepository", "Lcom/example/ebook/repository/AuthorRepository;", "bookRepository", "Lcom/example/ebook/repository/BookRepository;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorLiveData", "", "getErrorLiveData", "setErrorLiveData", "favoriteClick", "", "getFavoriteClick", "setFavoriteClick", "favoriteRepository", "Lcom/example/ebook/repository/FavoriteRepository;", "genreList", "Lcom/example/ebook/model/Genre;", "getGenreList", "setGenreList", "genreRepository", "Lcom/example/ebook/repository/GenreRepository;", "", "user_id", "", "book_id", "findAuthorsByBookID", "id", "limit", "offset", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "findBooksByAuthorID", "findGenresByBookID", "onCleared", "app_debug"})
public final class BookDetailViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.AuthorRepository authorRepository;
    private com.example.ebook.repository.GenreRepository genreRepository;
    private com.example.ebook.repository.BookRepository bookRepository;
    private com.example.ebook.repository.FavoriteRepository favoriteRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Author>> authorList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> genreList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> authorBookList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> favoriteClick;
    
    public BookDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Author>> getAuthorList() {
        return null;
    }
    
    public final void setAuthorList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Author>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> getGenreList() {
        return null;
    }
    
    public final void setGenreList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Genre>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> getAuthorBookList() {
        return null;
    }
    
    public final void setAuthorBookList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Book>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFavoriteClick() {
        return null;
    }
    
    public final void setFavoriteClick(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void findAuthorsByBookID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    public final void findGenresByBookID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    public final void findBooksByAuthorID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
    }
    
    public final void favoriteClick(int user_id, int book_id) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}