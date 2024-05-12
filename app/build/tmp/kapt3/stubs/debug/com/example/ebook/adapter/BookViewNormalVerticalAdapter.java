package com.example.ebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/ebook/adapter/BookViewNormalVerticalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ebook/adapter/BookViewNormalVerticalAdapter$BookViewHolder;", "bookList", "", "Lcom/example/ebook/model/Book;", "mListener", "Lcom/example/ebook/listener/IBookListener;", "(Ljava/util/List;Lcom/example/ebook/listener/IBookListener;)V", "getBookList", "()Ljava/util/List;", "setBookList", "(Ljava/util/List;)V", "getMListener", "()Lcom/example/ebook/listener/IBookListener;", "setMListener", "(Lcom/example/ebook/listener/IBookListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookViewHolder", "app_debug"})
public final class BookViewNormalVerticalAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ebook.adapter.BookViewNormalVerticalAdapter.BookViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.ebook.model.Book> bookList;
    @org.jetbrains.annotations.NotNull
    private com.example.ebook.listener.IBookListener mListener;
    
    public BookViewNormalVerticalAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ebook.model.Book> bookList, @org.jetbrains.annotations.NotNull
    com.example.ebook.listener.IBookListener mListener) {
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
    public final com.example.ebook.listener.IBookListener getMListener() {
        return null;
    }
    
    public final void setMListener(@org.jetbrains.annotations.NotNull
    com.example.ebook.listener.IBookListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.ebook.adapter.BookViewNormalVerticalAdapter.BookViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.ebook.adapter.BookViewNormalVerticalAdapter.BookViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ebook/adapter/BookViewNormalVerticalAdapter$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ebook/databinding/BookViewNormalVerticalBinding;", "(Lcom/example/ebook/adapter/BookViewNormalVerticalAdapter;Lcom/example/ebook/databinding/BookViewNormalVerticalBinding;)V", "getBinding", "()Lcom/example/ebook/databinding/BookViewNormalVerticalBinding;", "app_debug"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ebook.databinding.BookViewNormalVerticalBinding binding = null;
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ebook.databinding.BookViewNormalVerticalBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.ebook.databinding.BookViewNormalVerticalBinding getBinding() {
            return null;
        }
    }
}