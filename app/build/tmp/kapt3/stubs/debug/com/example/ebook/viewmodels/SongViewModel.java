package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005J\u0014\u0010\u001d\u001a\u00020\u001a2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/example/ebook/viewmodels/SongViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentLyric", "Landroidx/lifecycle/MutableLiveData;", "", "getCurrentLyric", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentLyric", "(Landroidx/lifecycle/MutableLiveData;)V", "isReadBook", "", "setReadBook", "lyricList", "", "Lcom/example/ebook/model/Lyric;", "getLyricList", "setLyricList", "start", "", "getStart", "setStart", "totalLyrics", "getTotalLyrics", "setTotalLyrics", "updateIsReadBook", "", "updateLyric", "lyric", "updateLyricList", "updateStart", "updateTotalLyrics", "app_debug"})
public final class SongViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isReadBook;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> currentLyric;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> totalLyrics;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Lyric>> lyricList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> start;
    
    public SongViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isReadBook() {
        return null;
    }
    
    public final void setReadBook(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrentLyric() {
        return null;
    }
    
    public final void setCurrentLyric(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalLyrics() {
        return null;
    }
    
    public final void setTotalLyrics(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Lyric>> getLyricList() {
        return null;
    }
    
    public final void setLyricList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.ebook.model.Lyric>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getStart() {
        return null;
    }
    
    public final void setStart(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void updateTotalLyrics(@org.jetbrains.annotations.NotNull
    java.lang.String totalLyrics) {
    }
    
    public final void updateLyric(@org.jetbrains.annotations.NotNull
    java.lang.String lyric) {
    }
    
    public final void updateStart(int start) {
    }
    
    public final void updateLyricList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Lyric> lyricList) {
    }
    
    public final void updateIsReadBook(boolean isReadBook) {
    }
}