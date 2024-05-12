package com.example.ebook.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/ebook/utils/AppInstance;", "", "()V", "Companion", "app_debug"})
public final class AppInstance {
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.utils.AppInstance.Companion Companion = null;
    private static int REWIND_REQUEST_CODE = 0;
    private static int FF_REQUEST_CODE = 1;
    private static int PLAY_PAUSE_REQUEST_CODE = 2;
    private static int CLOSE_REQUEST_CODE = 3;
    private static int ACCOUNT_ID_KEY = 99;
    private static int IS_GOOGLE_ACCOUNT = 88;
    @org.jetbrains.annotations.Nullable
    private static com.example.ebook.model.Account currentAccount;
    @org.jetbrains.annotations.Nullable
    private static com.example.ebook.model.User currentUser;
    @org.jetbrains.annotations.Nullable
    private static com.example.ebook.model.Subscription currentSubscription;
    @org.jetbrains.annotations.Nullable
    private static java.lang.String bookName;
    @org.jetbrains.annotations.Nullable
    private static java.lang.String bookAuthorName;
    @org.jetbrains.annotations.Nullable
    private static java.lang.String bookImg;
    
    public AppInstance() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u00106\u001a\u000207R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u00068"}, d2 = {"Lcom/example/ebook/utils/AppInstance$Companion;", "", "()V", "ACCOUNT_ID_KEY", "", "getACCOUNT_ID_KEY", "()I", "setACCOUNT_ID_KEY", "(I)V", "CLOSE_REQUEST_CODE", "getCLOSE_REQUEST_CODE", "setCLOSE_REQUEST_CODE", "FF_REQUEST_CODE", "getFF_REQUEST_CODE", "setFF_REQUEST_CODE", "IS_GOOGLE_ACCOUNT", "getIS_GOOGLE_ACCOUNT", "setIS_GOOGLE_ACCOUNT", "PLAY_PAUSE_REQUEST_CODE", "getPLAY_PAUSE_REQUEST_CODE", "setPLAY_PAUSE_REQUEST_CODE", "REWIND_REQUEST_CODE", "getREWIND_REQUEST_CODE", "setREWIND_REQUEST_CODE", "bookAuthorName", "", "getBookAuthorName", "()Ljava/lang/String;", "setBookAuthorName", "(Ljava/lang/String;)V", "bookImg", "getBookImg", "setBookImg", "bookName", "getBookName", "setBookName", "currentAccount", "Lcom/example/ebook/model/Account;", "getCurrentAccount", "()Lcom/example/ebook/model/Account;", "setCurrentAccount", "(Lcom/example/ebook/model/Account;)V", "currentSubscription", "Lcom/example/ebook/model/Subscription;", "getCurrentSubscription", "()Lcom/example/ebook/model/Subscription;", "setCurrentSubscription", "(Lcom/example/ebook/model/Subscription;)V", "currentUser", "Lcom/example/ebook/model/User;", "getCurrentUser", "()Lcom/example/ebook/model/User;", "setCurrentUser", "(Lcom/example/ebook/model/User;)V", "resetAccount", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getREWIND_REQUEST_CODE() {
            return 0;
        }
        
        public final void setREWIND_REQUEST_CODE(int p0) {
        }
        
        public final int getFF_REQUEST_CODE() {
            return 0;
        }
        
        public final void setFF_REQUEST_CODE(int p0) {
        }
        
        public final int getPLAY_PAUSE_REQUEST_CODE() {
            return 0;
        }
        
        public final void setPLAY_PAUSE_REQUEST_CODE(int p0) {
        }
        
        public final int getCLOSE_REQUEST_CODE() {
            return 0;
        }
        
        public final void setCLOSE_REQUEST_CODE(int p0) {
        }
        
        public final int getACCOUNT_ID_KEY() {
            return 0;
        }
        
        public final void setACCOUNT_ID_KEY(int p0) {
        }
        
        public final int getIS_GOOGLE_ACCOUNT() {
            return 0;
        }
        
        public final void setIS_GOOGLE_ACCOUNT(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.ebook.model.Account getCurrentAccount() {
            return null;
        }
        
        public final void setCurrentAccount(@org.jetbrains.annotations.Nullable
        com.example.ebook.model.Account p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.ebook.model.User getCurrentUser() {
            return null;
        }
        
        public final void setCurrentUser(@org.jetbrains.annotations.Nullable
        com.example.ebook.model.User p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.ebook.model.Subscription getCurrentSubscription() {
            return null;
        }
        
        public final void setCurrentSubscription(@org.jetbrains.annotations.Nullable
        com.example.ebook.model.Subscription p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBookName() {
            return null;
        }
        
        public final void setBookName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBookAuthorName() {
            return null;
        }
        
        public final void setBookAuthorName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBookImg() {
            return null;
        }
        
        public final void setBookImg(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public final void resetAccount() {
        }
    }
}