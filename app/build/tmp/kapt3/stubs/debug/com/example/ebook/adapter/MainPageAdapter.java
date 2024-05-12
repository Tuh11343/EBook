package com.example.ebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/ebook/adapter/MainPageAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "mainViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/viewpager2/widget/ViewPager2;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "toFragmentAuthor", "toFragmentDetailBook", "toFragmentFavorite", "toFragmentSearch", "toFragmentSignIn", "toFragmentSignUp", "toFragmentSubscription", "toFragmentUser", "toFragmentUserLogin", "toHomeFragment", "toReadBookFragment", "app_debug"})
public final class MainPageAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private androidx.viewpager2.widget.ViewPager2 mainViewPager;
    
    public MainPageAdapter(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    androidx.viewpager2.widget.ViewPager2 mainViewPager) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    public final int toHomeFragment() {
        return 0;
    }
    
    public final int toReadBookFragment() {
        return 0;
    }
    
    public final int toFragmentDetailBook() {
        return 0;
    }
    
    public final int toFragmentSearch() {
        return 0;
    }
    
    public final int toFragmentUser() {
        return 0;
    }
    
    public final int toFragmentSubscription() {
        return 0;
    }
    
    public final int toFragmentAuthor() {
        return 0;
    }
    
    public final int toFragmentFavorite() {
        return 0;
    }
    
    public final int toFragmentUserLogin() {
        return 0;
    }
    
    public final int toFragmentSignIn() {
        return 0;
    }
    
    public final int toFragmentSignUp() {
        return 0;
    }
}