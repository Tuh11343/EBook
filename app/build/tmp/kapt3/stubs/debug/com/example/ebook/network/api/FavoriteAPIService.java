package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\tH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ebook/network/api/FavoriteAPIService;", "", "createFavorite", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "favorite", "Lcom/example/ebook/model/Favorite;", "deleteFavorite", "id", "", "favoriteClick", "user_id", "book_id", "findByUserID", "updateFavorite", "app_debug"})
public abstract interface FavoriteAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/favorite/userID")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByUserID(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.PUT(value = "/api/v1/favorite")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> updateFavorite(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Favorite favorite);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/favorite")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> createFavorite(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Favorite favorite);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/favorite/favoriteClick")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> favoriteClick(@retrofit2.http.Query(value = "user_id")
    int user_id, @retrofit2.http.Query(value = "book_id")
    int book_id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.DELETE(value = "/api/v1/favorite")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> deleteFavorite(@retrofit2.http.Query(value = "id")
    int id);
}