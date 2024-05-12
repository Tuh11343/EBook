package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/ebook/network/api/BookAuthorAPIService;", "", "findAll", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "app_debug"})
public abstract interface BookAuthorAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/bookAuthor")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findAll(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset);
}