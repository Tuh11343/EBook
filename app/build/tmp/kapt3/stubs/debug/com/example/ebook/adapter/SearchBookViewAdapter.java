package com.example.ebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00172\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0006\u0010#\u001a\u00020\u0017R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/example/ebook/adapter/SearchBookViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bookList", "", "Lcom/example/ebook/model/Book;", "listener", "Lcom/example/ebook/listener/SearchBookListener;", "(Ljava/util/List;Lcom/example/ebook/listener/SearchBookListener;)V", "getBookList", "()Ljava/util/List;", "setBookList", "(Ljava/util/List;)V", "isLoadingAdd", "", "()Z", "setLoadingAdd", "(Z)V", "getListener", "()Lcom/example/ebook/listener/SearchBookListener;", "setListener", "(Lcom/example/ebook/listener/SearchBookListener;)V", "addFooterLoading", "", "addMoreBook", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeFooterLoading", "Companion", "LoadingViewHolder", "MyViewHolder", "app_debug"})
public final class SearchBookViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.ebook.model.Book> bookList;
    @org.jetbrains.annotations.NotNull
    private com.example.ebook.listener.SearchBookListener listener;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ebook.adapter.SearchBookViewAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_BOOK = 0;
    private static final int VIEW_TYPE_LOADING = 1;
    private boolean isLoadingAdd = false;
    
    public SearchBookViewAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Book> bookList, @org.jetbrains.annotations.NotNull
    com.example.ebook.listener.SearchBookListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.ebook.model.Book> getBookList() {
        return null;
    }
    
    public final void setBookList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Book> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.ebook.listener.SearchBookListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull
    com.example.ebook.listener.SearchBookListener p0) {
    }
    
    public final boolean isLoadingAdd() {
        return false;
    }
    
    public final void setLoadingAdd(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void addMoreBook(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Book> bookList) {
    }
    
    public final void addFooterLoading() {
    }
    
    public final void removeFooterLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/adapter/SearchBookViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ebook/databinding/SearchBookViewBinding;", "(Lcom/example/ebook/adapter/SearchBookViewAdapter;Lcom/example/ebook/databinding/SearchBookViewBinding;)V", "getBinding", "()Lcom/example/ebook/databinding/SearchBookViewBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ebook.databinding.SearchBookViewBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ebook.databinding.SearchBookViewBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.databinding.SearchBookViewBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/adapter/SearchBookViewAdapter$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ebook/databinding/LoadingBinding;", "(Lcom/example/ebook/adapter/SearchBookViewAdapter;Lcom/example/ebook/databinding/LoadingBinding;)V", "getBinding", "()Lcom/example/ebook/databinding/LoadingBinding;", "app_debug"})
    public final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ebook.databinding.LoadingBinding binding = null;
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ebook.databinding.LoadingBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.databinding.LoadingBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ebook/adapter/SearchBookViewAdapter$Companion;", "", "()V", "VIEW_TYPE_BOOK", "", "VIEW_TYPE_LOADING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}