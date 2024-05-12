package com.example.ebook.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0014H\u0002J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0014H\u0002J\b\u00104\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/example/ebook/fragment/FragmentAudio;", "Landroidx/fragment/app/Fragment;", "()V", "activity", "Lcom/example/ebook/views/MainActivity;", "animatorSet", "Landroid/animation/AnimatorSet;", "binding", "Lcom/example/ebook/databinding/FragmentAudioBinding;", "handler", "Landroid/os/Handler;", "mainViewModel", "Lcom/example/ebook/viewmodels/MainViewModel;", "musicService", "Lcom/example/ebook/services/MusicService;", "rotation", "", "songViewModel", "Lcom/example/ebook/viewmodels/AudioViewModel;", "btnDownClick", "", "btnFFClick", "time", "", "btnPlayClick", "btnRewindClick", "formatDuration", "", "durationInMillis", "", "loadLyrics", "lyric", "observe", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "parseTimeToMillis", "pauseAnimation", "resetAnimation", "setUpBinding", "setUpMusicService", "setUpProgressBar", "startAnimation", "stopSeekBar", "updateCurrentTime", "updateSeekBar", "app_debug"})
public final class FragmentAudio extends androidx.fragment.app.Fragment {
    private com.example.ebook.databinding.FragmentAudioBinding binding;
    private android.os.Handler handler;
    private android.animation.AnimatorSet animatorSet;
    private float rotation = 0.0F;
    private com.example.ebook.viewmodels.AudioViewModel songViewModel;
    private com.example.ebook.viewmodels.MainViewModel mainViewModel;
    private com.example.ebook.views.MainActivity activity;
    private com.example.ebook.services.MusicService musicService;
    
    public FragmentAudio() {
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
    
    private final void setUpMusicService() {
    }
    
    private final void observe() {
    }
    
    private final void setUpBinding() {
    }
    
    private final void loadLyrics(java.lang.String lyric) {
    }
    
    private final long parseTimeToMillis(java.lang.String time) {
        return 0L;
    }
    
    private final void startAnimation() {
    }
    
    private final void pauseAnimation() {
    }
    
    private final void resetAnimation() {
    }
    
    private final void updateSeekBar() {
    }
    
    private final void stopSeekBar() {
    }
    
    private final void btnPlayClick() {
    }
    
    private final void btnRewindClick(int time) {
    }
    
    private final void btnFFClick(int time) {
    }
    
    private final void updateCurrentTime() {
    }
    
    private final java.lang.String formatDuration(long durationInMillis) {
        return null;
    }
    
    private final void setUpProgressBar() {
    }
    
    private final void btnDownClick() {
    }
}