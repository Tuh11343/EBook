package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\'\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/ebook/network/api/SubscriptionAPIService;", "", "create", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "subscription", "Lcom/example/ebook/model/Subscription;", "findByAccountID", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "update", "app_debug"})
public abstract interface SubscriptionAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/subscription/accountID")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByAccountID(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "id")
    java.lang.Integer id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/subscription")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> create(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Subscription subscription);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.PUT(value = "/api/v1/subscription")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> update(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Subscription subscription);
}