package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/ebook/network/api/AuthorAPIService;", "", "findAll", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findByBookID", "id", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findOneByBookID", "app_debug"})
public abstract interface AuthorAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/author")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findAll(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/author/bookID")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByBookID(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/author/bookAuthorOne")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findOneByBookID(@retrofit2.http.Query(value = "id")
    int id);
}