package com.example.ebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\nH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/ebook/adapter/SortBottomSheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ebook/adapter/SortBottomSheetAdapter$MyViewHolder;", "sortTypeList", "", "Lcom/example/ebook/adapter/SortBottomSheetAdapter$SortType;", "listener", "Lcom/example/ebook/listener/SortListener;", "(Ljava/util/List;Lcom/example/ebook/listener/SortListener;)V", "checkedPosition", "", "getListener", "()Lcom/example/ebook/listener/SortListener;", "setListener", "(Lcom/example/ebook/listener/SortListener;)V", "getSortTypeList", "()Ljava/util/List;", "setSortTypeList", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "SortType", "app_debug"})
public final class SortBottomSheetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ebook.adapter.SortBottomSheetAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.ebook.adapter.SortBottomSheetAdapter.SortType> sortTypeList;
    @org.jetbrains.annotations.NotNull
    private com.example.ebook.listener.SortListener listener;
    private int checkedPosition = -1;
    
    public SortBottomSheetAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.adapter.SortBottomSheetAdapter.SortType> sortTypeList, @org.jetbrains.annotations.NotNull
    com.example.ebook.listener.SortListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.ebook.adapter.SortBottomSheetAdapter.SortType> getSortTypeList() {
        return null;
    }
    
    public final void setSortTypeList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.adapter.SortBottomSheetAdapter.SortType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.ebook.listener.SortListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull
    com.example.ebook.listener.SortListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.ebook.adapter.SortBottomSheetAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.ebook.adapter.SortBottomSheetAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ebook/adapter/SortBottomSheetAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ebook/databinding/SortBottomSheetItemBinding;", "(Lcom/example/ebook/adapter/SortBottomSheetAdapter;Lcom/example/ebook/databinding/SortBottomSheetItemBinding;)V", "getBinding", "()Lcom/example/ebook/databinding/SortBottomSheetItemBinding;", "bind", "", "sort", "Lcom/example/ebook/adapter/SortBottomSheetAdapter$SortType;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ebook.databinding.SortBottomSheetItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ebook.databinding.SortBottomSheetItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.databinding.SortBottomSheetItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.ebook.adapter.SortBottomSheetAdapter.SortType sort) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/adapter/SortBottomSheetAdapter$SortType;", "", "(Ljava/lang/String;I)V", "Name", "YearPublished", "Rating", "ID", "app_debug"})
    public static enum SortType {
        /*public static final*/ Name /* = new Name() */,
        /*public static final*/ YearPublished /* = new YearPublished() */,
        /*public static final*/ Rating /* = new Rating() */,
        /*public static final*/ ID /* = new ID() */;
        
        SortType() {
        }
    }
}