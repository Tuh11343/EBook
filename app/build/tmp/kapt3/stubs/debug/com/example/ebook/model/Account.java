package com.example.ebook.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e\u00a8\u0006\""}, d2 = {"Lcom/example/ebook/model/Account;", "", "()V", "id", "", "user_id", "subscription_id", "email", "", "password", "is_verified", "", "(Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "set_verified", "(Z)V", "getPassword", "setPassword", "getSubscription_id", "()I", "setSubscription_id", "(I)V", "getUser_id", "setUser_id", "Companion", "app_debug"})
public final class Account {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    private int user_id;
    private int subscription_id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull
    private java.lang.String password;
    private boolean is_verified;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.model.Account.Companion Companion = null;
    private static final com.google.gson.Gson gson = null;
    
    public Account(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int user_id, int subscription_id, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean is_verified) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    public final void setUser_id(int p0) {
    }
    
    public final int getSubscription_id() {
        return 0;
    }
    
    public final void setSubscription_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean is_verified() {
        return false;
    }
    
    public final void set_verified(boolean p0) {
    }
    
    public Account() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ebook/model/Account$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getAccount", "Lcom/example/ebook/model/Account;", "jsonElement", "Lcom/google/gson/JsonElement;", "getAccountList", "", "getLength", "", "getStatus", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.ebook.model.Account> getAccountList(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.ebook.model.Account getAccount(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
        
        public final int getLength(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatus(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
    }
}