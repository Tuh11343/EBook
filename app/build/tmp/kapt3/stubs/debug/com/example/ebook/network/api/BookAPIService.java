package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\'J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\'J5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u000bJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u0011J?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\bJ+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\bJ+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/ebook/network/api/BookAPIService;", "", "findAll", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByAuthorID", "id", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByFavorite", "findByGenreID", "findByName", "name", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByNameAndGenre", "genreID", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByTopRating", "findNormalBook", "findPremiumBook", "app_debug"})
public abstract interface BookAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findAll(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/genre")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByGenreID(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/author")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByAuthorID(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/author")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByAuthorID(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/normal")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findNormalBook(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/premium")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findPremiumBook(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/favorite")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByFavorite(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/nameAndGenre")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByNameAndGenre(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @retrofit2.http.Query(value = "genre_id")
    int genreID, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/name")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/book/topRating")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByTopRating(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
}