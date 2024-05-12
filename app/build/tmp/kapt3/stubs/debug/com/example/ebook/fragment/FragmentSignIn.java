package com.example.ebook.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J8\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001bH\u0002J(\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020#H\u0002J(\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001dH\u0002J\u0010\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u001bH\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020\u0016H\u0002J\b\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020\u0016H\u0002J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\b\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0016H\u0002J&\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u001a\u0010E\u001a\u00020\u00162\u0006\u0010F\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0018\u0010G\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010H\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lcom/example/ebook/fragment/FragmentSignIn;", "Landroidx/fragment/app/Fragment;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/example/ebook/databinding/FragmentSignInBinding;", "dialog", "Landroid/app/AlertDialog;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "mainViewModel", "Lcom/example/ebook/viewmodels/MainViewModel;", "sharedPreferences", "Landroid/content/SharedPreferences;", "signInLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "signInViewModel", "Lcom/example/ebook/viewmodels/SignInViewModel;", "createAccount", "", "userID", "", "subsscription_id", "email", "", "is_verified", "", "password", "createSubscription", "subscriptionHistoryID", "duration", "pricePerMonth", "", "bookType", "Lcom/example/ebook/model/Book$BookType;", "limitBookMark", "type", "createSubscriptionHistory", "start", "Ljava/util/Date;", "end", "name", "price", "createUser", "address", "phoneNumber", "googleAccount", "firebaseAuthWithGoogle", "idToken", "goBack", "googleSignIn", "observe", "observeAccountSubscription", "observeCreatedAccount", "observeCreatedSubscription", "observeCreatedSubscriptionHistory", "observeCreatedUser", "observeSignInAccount", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "signIn", "validate", "app_debug"})
public final class FragmentSignIn extends androidx.fragment.app.Fragment {
    private com.example.ebook.databinding.FragmentSignInBinding binding;
    private com.example.ebook.viewmodels.MainViewModel mainViewModel;
    private com.example.ebook.viewmodels.SignInViewModel signInViewModel;
    private android.content.SharedPreferences sharedPreferences;
    private com.google.firebase.auth.FirebaseAuth auth;
    private android.app.AlertDialog dialog;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> signInLauncher = null;
    
    public FragmentSignIn() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void signIn(java.lang.String email, java.lang.String password) {
    }
    
    private final void observe() {
    }
    
    private final boolean validate() {
        return false;
    }
    
    private final void googleSignIn() {
    }
    
    private final void firebaseAuthWithGoogle(java.lang.String idToken) {
    }
    
    private final void createAccount(int userID, int subsscription_id, java.lang.String email, boolean is_verified, java.lang.String password) {
    }
    
    private final void createUser(java.lang.String address, java.lang.String phoneNumber, java.lang.String name, boolean googleAccount) {
    }
    
    private final void createSubscription(int subscriptionHistoryID, int duration, float pricePerMonth, com.example.ebook.model.Book.BookType bookType, int limitBookMark, java.lang.String type) {
    }
    
    private final void createSubscriptionHistory(java.util.Date start, java.util.Date end, java.lang.String name, float price) {
    }
    
    private final void observeCreatedUser() {
    }
    
    private final void observeCreatedAccount() {
    }
    
    private final void observeCreatedSubscriptionHistory() {
    }
    
    private final void observeCreatedSubscription() {
    }
    
    private final void observeSignInAccount() {
    }
    
    private final void observeAccountSubscription() {
    }
    
    private final void goBack() {
    }
}