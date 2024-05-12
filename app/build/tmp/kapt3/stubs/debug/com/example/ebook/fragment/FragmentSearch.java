package com.example.ebook.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\u001a\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0015H\u0002J\b\u00100\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/ebook/fragment/FragmentSearch;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/ebook/databinding/FragmentSearchBinding;", "bookSearchLimit", "", "bookSearchMoreLimit", "genreFilter", "Lcom/example/ebook/model/Genre;", "mainViewModel", "Lcom/example/ebook/viewmodels/MainViewModel;", "modalFilterBottomSheet", "Lcom/example/ebook/fragment/ModalBottomSheet;", "modalSortBottomSheet", "Lcom/example/ebook/fragment/ModalSortBottomSheet;", "searchViewAdapter", "Lcom/example/ebook/adapter/SearchBookViewAdapter;", "searchViewModel", "Lcom/example/ebook/viewmodels/SearchViewModel;", "bookClick", "", "book", "Lcom/example/ebook/model/Book;", "bookClickHandle", "findBookList", "name", "", "genreID", "(Ljava/lang/String;Ljava/lang/Integer;)V", "findMoreBookList", "observe", "observeBookList", "observeGenreList", "observeLoadMoreBookList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setUpComponent", "showFilterBottomSheet", "showSortBottomSheet", "app_debug"})
public final class FragmentSearch extends androidx.fragment.app.Fragment {
    private com.example.ebook.databinding.FragmentSearchBinding binding;
    private com.example.ebook.viewmodels.SearchViewModel searchViewModel;
    private com.example.ebook.viewmodels.MainViewModel mainViewModel;
    private com.example.ebook.fragment.ModalBottomSheet modalFilterBottomSheet;
    private com.example.ebook.fragment.ModalSortBottomSheet modalSortBottomSheet;
    private com.example.ebook.adapter.SearchBookViewAdapter searchViewAdapter;
    private com.example.ebook.model.Genre genreFilter;
    private int bookSearchLimit = 12;
    private int bookSearchMoreLimit = 5;
    
    public FragmentSearch() {
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
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final void observeGenreList() {
    }
    
    private final void showFilterBottomSheet() {
    }
    
    private final void showSortBottomSheet() {
    }
    
    private final void setUpComponent() {
    }
    
    private final void observe() {
    }
    
    private final void observeBookList() {
    }
    
    private final void bookClickHandle(com.example.ebook.model.Book book) {
    }
    
    private final void bookClick(com.example.ebook.model.Book book) {
    }
    
    private final void observeLoadMoreBookList() {
    }
    
    private final void findBookList(java.lang.String name, java.lang.Integer genreID) {
    }
    
    private final void findMoreBookList(java.lang.String name, java.lang.Integer genreID) {
    }
}