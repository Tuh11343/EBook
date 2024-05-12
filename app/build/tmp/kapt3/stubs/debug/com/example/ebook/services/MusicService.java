package com.example.ebook.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 N2\u00020\u0001:\u0003MNOB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020\tJ \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020\tH\u0002J\u000e\u00103\u001a\u00020\t2\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0002J\b\u00109\u001a\u000207H\u0002J\u0010\u0010:\u001a\u0002052\u0006\u00100\u001a\u000201H\u0002J\b\u0010;\u001a\u000207H\u0002J\u000e\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020.J\u0012\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\tH\u0016J \u0010C\u001a\u0002052\u0006\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u0002052\u0006\u0010E\u001a\u000205H\u0016J\u0006\u0010F\u001a\u00020\tJ\u000e\u0010G\u001a\u00020\t2\u0006\u00104\u001a\u000205J\u000e\u0010H\u001a\u00020\t2\u0006\u00104\u001a\u000205J\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020K2\u0006\u00100\u001a\u000201H\u0002J\u0010\u0010L\u001a\u00020\t2\u0006\u00100\u001a\u000201H\u0002R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\r\u00a8\u0006P"}, d2 = {"Lcom/example/ebook/services/MusicService;", "Landroid/app/Service;", "()V", "binder", "Lcom/example/ebook/services/MusicService$LocalBinder;", "bitmap", "Landroid/graphics/Bitmap;", "btnCloseClick", "Landroidx/lifecycle/MutableLiveData;", "", "getBtnCloseClick", "()Landroidx/lifecycle/MutableLiveData;", "setBtnCloseClick", "(Landroidx/lifecycle/MutableLiveData;)V", "btnFastForwardClick", "getBtnFastForwardClick", "setBtnFastForwardClick", "btnPlayClick", "getBtnPlayClick", "setBtnPlayClick", "btnRewindClick", "getBtnRewindClick", "setBtnRewindClick", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isNotificationCreated", "", "()Z", "setNotificationCreated", "(Z)V", "loadIsDone", "getLoadIsDone", "setLoadIsDone", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "seekBarSlide", "getSeekBarSlide", "setSeekBarSlide", "cancelNotification", "createNotification", "Landroid/app/Notification;", "songName", "", "songAuthor", "action", "Lcom/example/ebook/services/MusicService$Actions;", "createNotificationChannel", "fastForward", "time", "", "getCloseAction", "Landroidx/core/app/NotificationCompat$Action;", "getFFAction", "getPlayAction", "getPlayBackState", "getRewindAction", "load", "url", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onDestroy", "onStartCommand", "flags", "startId", "play", "rewind", "seekTo", "setUpSeekBar", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "updateNotification", "Actions", "Companion", "LocalBinder", "app_debug"})
public final class MusicService extends android.app.Service {
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer mediaPlayer;
    private final com.example.ebook.services.MusicService.LocalBinder binder = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private boolean isNotificationCreated = false;
    private android.graphics.Bitmap bitmap;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadIsDone;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> btnPlayClick;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> btnRewindClick;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> btnFastForwardClick;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> btnCloseClick;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> seekBarSlide;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.services.MusicService.Companion Companion = null;
    private static final java.lang.String CHANNEL_ID = "MusicServiceChannel";
    private static final int NOTIFICATION_ID = 101;
    
    public MusicService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.Nullable
    android.media.MediaPlayer p0) {
    }
    
    public final boolean isNotificationCreated() {
        return false;
    }
    
    public final void setNotificationCreated(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadIsDone() {
        return null;
    }
    
    public final void setLoadIsDone(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getBtnPlayClick() {
        return null;
    }
    
    public final void setBtnPlayClick(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getBtnRewindClick() {
        return null;
    }
    
    public final void setBtnRewindClick(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getBtnFastForwardClick() {
        return null;
    }
    
    public final void setBtnFastForwardClick(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getBtnCloseClick() {
        return null;
    }
    
    public final void setBtnCloseClick(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getSeekBarSlide() {
        return null;
    }
    
    public final void setSeekBarSlide(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification createNotification(java.lang.String songName, java.lang.String songAuthor, com.example.ebook.services.MusicService.Actions action) {
        return null;
    }
    
    private final void setUpSeekBar(android.support.v4.media.session.MediaSessionCompat mediaSession, com.example.ebook.services.MusicService.Actions action) {
    }
    
    private final int getPlayBackState(com.example.ebook.services.MusicService.Actions action) {
        return 0;
    }
    
    public final void cancelNotification() {
    }
    
    public final void play() {
    }
    
    private final androidx.core.app.NotificationCompat.Action getPlayAction() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action getRewindAction() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action getFFAction() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action getCloseAction() {
        return null;
    }
    
    public final void load(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void seekTo(int time) {
    }
    
    public final void rewind(int time) {
    }
    
    public final void fastForward(int time) {
    }
    
    private final void updateNotification(com.example.ebook.services.MusicService.Actions action) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/ebook/services/MusicService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/example/ebook/services/MusicService;)V", "getService", "Lcom/example/ebook/services/MusicService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.services.MusicService getService() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/ebook/services/MusicService$Actions;", "", "(Ljava/lang/String;I)V", "Start", "Stop", "Load", "Rewind", "FastForward", "Close", "SeekTo", "app_debug"})
    public static enum Actions {
        /*public static final*/ Start /* = new Start() */,
        /*public static final*/ Stop /* = new Stop() */,
        /*public static final*/ Load /* = new Load() */,
        /*public static final*/ Rewind /* = new Rewind() */,
        /*public static final*/ FastForward /* = new FastForward() */,
        /*public static final*/ Close /* = new Close() */,
        /*public static final*/ SeekTo /* = new SeekTo() */;
        
        Actions() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/services/MusicService$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}