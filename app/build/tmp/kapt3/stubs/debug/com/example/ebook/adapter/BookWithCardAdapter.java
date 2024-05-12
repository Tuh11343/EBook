package com.example.ebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/ebook/adapter/BookWithCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ebook/adapter/BookWithCardAdapter$BookViewHolder;", "bookList", "", "Lcom/example/ebook/model/Book;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookViewHolder", "app_debug"})
public final class BookWithCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ebook.adapter.BookWithCardAdapter.BookViewHolder> {
    private java.util.List<com.example.ebook.model.Book> bookList;
    
    public BookWithCardAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Book> bookList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.ebook.adapter.BookWithCardAdapter.BookViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.ebook.adapter.BookWithCardAdapter.BookViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/adapter/BookWithCardAdapter$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ebook/databinding/BookviewWithcardBinding;", "(Lcom/example/ebook/adapter/BookWithCardAdapter;Lcom/example/ebook/databinding/BookviewWithcardBinding;)V", "getBinding", "()Lcom/example/ebook/databinding/BookviewWithcardBinding;", "app_debug"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ebook.databinding.BookviewWithcardBinding binding = null;
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ebook.databinding.BookviewWithcardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.databinding.BookviewWithcardBinding getBinding() {
            return null;
        }
    }
}