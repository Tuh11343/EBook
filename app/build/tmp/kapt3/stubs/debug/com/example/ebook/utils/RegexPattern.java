package com.example.ebook.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ebook/utils/RegexPattern;", "", "()V", "Companion", "app_debug"})
public final class RegexPattern {
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.utils.RegexPattern.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String passwordRegex = "^.{6,}$";
    
    public RegexPattern() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ebook/utils/RegexPattern$Companion;", "", "()V", "emailRegex", "", "getEmailRegex", "()Ljava/lang/String;", "passwordRegex", "getPasswordRegex", "isValidEmail", "", "email", "isValidPassword", "password", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmailRegex() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPasswordRegex() {
            return null;
        }
        
        public final boolean isValidEmail(@org.jetbrains.annotations.NotNull
        java.lang.String email) {
            return false;
        }
        
        public final boolean isValidPassword(@org.jetbrains.annotations.NotNull
        java.lang.String password) {
            return false;
        }
    }
}