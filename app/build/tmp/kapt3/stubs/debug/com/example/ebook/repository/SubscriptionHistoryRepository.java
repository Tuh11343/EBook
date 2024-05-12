package com.example.ebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ebook/repository/SubscriptionHistoryRepository;", "", "()V", "apiService", "Lcom/example/ebook/network/api/SubscriptionHistoryAPIService;", "create", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "subscriptionHistory", "Lcom/example/ebook/model/SubscriptionHistory;", "findByID", "id", "", "findBySubscriptionID", "update", "app_debug"})
public final class SubscriptionHistoryRepository {
    private final com.example.ebook.network.api.SubscriptionHistoryAPIService apiService = null;
    
    public SubscriptionHistoryRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> create(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.SubscriptionHistory subscriptionHistory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> update(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.SubscriptionHistory subscriptionHistory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByID(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findBySubscriptionID(int id) {
        return null;
    }
}