package com.example.ebook.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\tH\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/ebook/network/api/AccountAPIService;", "", "createAccount", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "account", "Lcom/example/ebook/model/Account;", "findByEmail", "email", "", "findByID", "id", "", "signIn", "password", "updateAccount", "app_debug"})
public abstract interface AccountAPIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/account/{id}")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByID(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/account/get-email/{email}")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByEmail(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "email")
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v1/account/signIn")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> signIn(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.PUT(value = "/api/v1/account")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> updateAccount(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Account account);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/v1/account")
    public abstract io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> createAccount(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.ebook.model.Account account);
}