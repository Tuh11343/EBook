package com.example.ebook.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/ebook/model/Genre;", "", "()V", "id", "", "name", "", "image", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "getName", "setName", "toString", "Companion", "app_debug"})
public final class Genre {
    private int id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String image;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.model.Genre.Companion Companion = null;
    private static final com.google.gson.Gson gson = null;
    
    public Genre(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String image) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public Genre() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ebook/model/Genre$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGenre", "Lcom/example/ebook/model/Genre;", "jsonElement", "Lcom/google/gson/JsonElement;", "getGenreList", "", "getLength", "", "getStatus", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.ebook.model.Genre> getGenreList(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.model.Genre getGenre(@org.jetbrains.annotations.NotNull
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