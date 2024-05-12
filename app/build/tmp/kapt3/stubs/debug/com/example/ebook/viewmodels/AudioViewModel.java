package com.example.ebook.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bJ\b\u0010$\u001a\u00020\"H\u0014J\u000e\u0010%\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\rJ\u0014\u0010(\u001a\u00020\"2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u000e\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0014\u0010\u000bR&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/example/ebook/viewmodels/AudioViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "authorRepository", "Lcom/example/ebook/repository/AuthorRepository;", "bookAuthor", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/ebook/model/Author;", "getBookAuthor", "()Landroidx/lifecycle/MutableLiveData;", "setBookAuthor", "(Landroidx/lifecycle/MutableLiveData;)V", "currentLyric", "", "getCurrentLyric", "setCurrentLyric", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isReadBook", "", "setReadBook", "lyricList", "", "Lcom/example/ebook/model/Lyric;", "getLyricList", "setLyricList", "start", "", "getStart", "setStart", "totalLyrics", "getTotalLyrics", "setTotalLyrics", "findBookAuthor", "", "id", "onCleared", "updateIsReadBook", "updateLyric", "lyric", "updateLyricList", "updateStart", "updateTotalLyrics", "app_debug"})
public final class AudioViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private com.example.ebook.repository.AuthorRepository authorRepository;
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
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> bookAuthor;
    
    public AudioViewModel() {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> getBookAuthor() {
        return null;
    }
    
    public final void setBookAuthor(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.ebook.model.Author> p0) {
    }
    
    public final void findBookAuthor(int id) {
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
    
    @java.lang.Override
    protected void onCleared() {
    }
}