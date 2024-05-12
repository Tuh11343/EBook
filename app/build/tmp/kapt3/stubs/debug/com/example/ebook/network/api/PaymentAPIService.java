package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/ebook/network/api/PaymentAPIService;", "", "paymentRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "accountID", "", "total", "", "app_debug"})
public abstract interface PaymentAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/payment")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> paymentRequest(@retrofit2.http.Query(value = "accountID")
    int accountID, @retrofit2.http.Query(value = "total")
    float total);
}