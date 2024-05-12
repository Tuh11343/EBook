package com.example.ebook.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/ebook/model/Favorite;", "", "()V", "id", "", "user_id", "book_id", "(Ljava/lang/Integer;II)V", "getBook_id", "()I", "setBook_id", "(I)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUser_id", "setUser_id", "Companion", "app_debug"})
public final class Favorite {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    private int user_id;
    private int book_id;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.model.Favorite.Companion Companion = null;
    private static final com.google.gson.Gson gson = null;
    
    public Favorite(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int user_id, int book_id) {
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
    
    public final int getBook_id() {
        return 0;
    }
    
    public final void setBook_id(int p0) {
    }
    
    public Favorite() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ebook/model/Favorite$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getAction", "", "jsonElement", "Lcom/google/gson/JsonElement;", "getFavorite", "Lcom/example/ebook/model/Favorite;", "getFavoriteList", "", "getLength", "", "getStatus", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.ebook.model.Favorite> getFavoriteList(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.model.Favorite getFavorite(@org.jetbrains.annotations.NotNull
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
        
        public final boolean getAction(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return false;
        }
    }
}