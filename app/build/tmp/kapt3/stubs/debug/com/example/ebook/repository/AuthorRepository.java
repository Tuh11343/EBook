package com.example.ebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/ebook/repository/AuthorRepository;", "", "()V", "apiService", "Lcom/example/ebook/network/api/AuthorAPIService;", "findByBookID", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/gson/JsonElement;", "id", "", "limit", "offset", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "findOneByBookID", "getAllAuthor", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "app_debug"})
public final class AuthorRepository {
    private final com.example.ebook.network.api.AuthorAPIService apiService = null;
    
    public AuthorRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> getAllAuthor(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findByBookID(int id, @org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<com.google.gson.JsonElement> findOneByBookID(int id) {
        return null;
    }
}