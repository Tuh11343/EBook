package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/ebook/network/api/SubscriptionHistoryAPIService;", "", "createSubscriptionHistory", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "subscriptionHistory", "Lcom/example/ebook/model/SubscriptionHistory;", "findByID", "id", "", "findBySubscriptionID", "updateSubscriptionHistory", "app_debug"})
public abstract interface SubscriptionHistoryAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/subscriptionHistory")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByID(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/subscriptionHistory/subscriptionID")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findBySubscriptionID(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/subscriptionHistory")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> createSubscriptionHistory(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.SubscriptionHistory subscriptionHistory);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.PUT(value = "/api/v1/subscriptionHistory")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> updateSubscriptionHistory(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.SubscriptionHistory subscriptionHistory);
}