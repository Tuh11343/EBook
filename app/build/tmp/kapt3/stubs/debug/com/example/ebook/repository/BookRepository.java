package com.example.ebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0014J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/ebook/repository/BookRepository;", "", "()V", "apiService", "Lcom/example/ebook/network/api/BookAPIService;", "findAll", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByAuthorID", "id", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByFavorite", "findByGenreID", "findByName", "name", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByNameAndGenre", "genreID", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByTopRating", "findNormalBook", "findPremiumBook", "app_debug"})
public final class BookRepository {
    private final com.example.ebook.network.api.BookAPIService apiService = null;
    
    public BookRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findAll(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findNormalBook(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findPremiumBook(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByGenreID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByAuthorID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByAuthorID(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByFavorite(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByNameAndGenre(@org.jetbrains.annotations.NotNull
    java.lang.String name, int genreID, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByName(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByTopRating(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
}