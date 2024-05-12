package com.example.ebook.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006)"}, d2 = {"Lcom/example/ebook/model/Subscription;", "", "()V", "id", "", "subscription_history_id", "duration", "book_type", "Lcom/example/ebook/model/Book$BookType;", "type", "", "price_per_month", "", "limit_book_mark", "(Ljava/lang/Integer;IILcom/example/ebook/model/Book$BookType;Ljava/lang/String;FI)V", "getBook_type", "()Lcom/example/ebook/model/Book$BookType;", "setBook_type", "(Lcom/example/ebook/model/Book$BookType;)V", "getDuration", "()I", "setDuration", "(I)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLimit_book_mark", "setLimit_book_mark", "getPrice_per_month", "()F", "setPrice_per_month", "(F)V", "getSubscription_history_id", "setSubscription_history_id", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Companion", "app_debug"})
public final class Subscription {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    private int subscription_history_id;
    private int duration;
    @org.jetbrains.annotations.NotNull
    private com.example.ebook.model.Book.BookType book_type;
    @org.jetbrains.annotations.NotNull
    private java.lang.String type;
    private float price_per_month;
    private int limit_book_mark;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.model.Subscription.Companion Companion = null;
    private static final com.google.gson.Gson gson = null;
    
    public Subscription(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int subscription_history_id, int duration, @org.jetbrains.annotations.NotNull
    com.example.ebook.model.Book.BookType book_type, @org.jetbrains.annotations.NotNull
    java.lang.String type, float price_per_month, int limit_book_mark) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public final int getSubscription_history_id() {
        return 0;
    }
    
    public final void setSubscription_history_id(int p0) {
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final void setDuration(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.ebook.model.Book.BookType getBook_type() {
        return null;
    }
    
    public final void setBook_type(@org.jetbrains.annotations.NotNull
    com.example.ebook.model.Book.BookType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final float getPrice_per_month() {
        return 0.0F;
    }
    
    public final void setPrice_per_month(float p0) {
    }
    
    public final int getLimit_book_mark() {
        return 0;
    }
    
    public final void setLimit_book_mark(int p0) {
    }
    
    public Subscription() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ebook/model/Subscription$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getLength", "", "jsonElement", "Lcom/google/gson/JsonElement;", "getStatus", "", "getSubscription", "Lcom/example/ebook/model/Subscription;", "getSubscriptionList", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.ebook.model.Subscription> getSubscriptionList(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.model.Subscription getSubscription(@org.jetbrains.annotations.NotNull
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