// Generated by view binder compiler. Do not edit!
package com.example.ebook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ebook.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.webtoonscorp.android.readmore.ReadMoreTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBookBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView authorList;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final ReadMoreTextView bookDescription;

  @NonNull
  public final ImageView bookImg;

  @NonNull
  public final MaterialCardView bookImgCardView;

  @NonNull
  public final TextView bookName;

  @NonNull
  public final FloatingActionButton btnBack;

  @NonNull
  public final ImageView btnFavorite;

  @NonNull
  public final ImageView btnPlay;

  @NonNull
  public final RecyclerView genreList;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RelativeLayout playClickView;

  private FragmentDetailBookBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView authorList, @NonNull TextView authorName,
      @NonNull ReadMoreTextView bookDescription, @NonNull ImageView bookImg,
      @NonNull MaterialCardView bookImgCardView, @NonNull TextView bookName,
      @NonNull FloatingActionButton btnBack, @NonNull ImageView btnFavorite,
      @NonNull ImageView btnPlay, @NonNull RecyclerView genreList,
      @NonNull LinearLayout linearLayout, @NonNull RelativeLayout playClickView) {
    this.rootView = rootView;
    this.authorList = authorList;
    this.authorName = authorName;
    this.bookDescription = bookDescription;
    this.bookImg = bookImg;
    this.bookImgCardView = bookImgCardView;
    this.bookName = bookName;
    this.btnBack = btnBack;
    this.btnFavorite = btnFavorite;
    this.btnPlay = btnPlay;
    this.genreList = genreList;
    this.linearLayout = linearLayout;
    this.playClickView = playClickView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authorList;
      RecyclerView authorList = ViewBindings.findChildViewById(rootView, id);
      if (authorList == null) {
        break missingId;
      }

      id = R.id.authorName;
      TextView authorName = ViewBindings.findChildViewById(rootView, id);
      if (authorName == null) {
        break missingId;
      }

      id = R.id.bookDescription;
      ReadMoreTextView bookDescription = ViewBindings.findChildViewById(rootView, id);
      if (bookDescription == null) {
        break missingId;
      }

      id = R.id.bookImg;
      ImageView bookImg = ViewBindings.findChildViewById(rootView, id);
      if (bookImg == null) {
        break missingId;
      }

      id = R.id.bookImgCardView;
      MaterialCardView bookImgCardView = ViewBindings.findChildViewById(rootView, id);
      if (bookImgCardView == null) {
        break missingId;
      }

      id = R.id.bookName;
      TextView bookName = ViewBindings.findChildViewById(rootView, id);
      if (bookName == null) {
        break missingId;
      }

      id = R.id.btnBack;
      FloatingActionButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnFavorite;
      ImageView btnFavorite = ViewBindings.findChildViewById(rootView, id);
      if (btnFavorite == null) {
        break missingId;
      }

      id = R.id.btnPlay;
      ImageView btnPlay = ViewBindings.findChildViewById(rootView, id);
      if (btnPlay == null) {
        break missingId;
      }

      id = R.id.genreList;
      RecyclerView genreList = ViewBindings.findChildViewById(rootView, id);
      if (genreList == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.playClickView;
      RelativeLayout playClickView = ViewBindings.findChildViewById(rootView, id);
      if (playClickView == null) {
        break missingId;
      }

      return new FragmentDetailBookBinding((RelativeLayout) rootView, authorList, authorName,
          bookDescription, bookImg, bookImgCardView, bookName, btnBack, btnFavorite, btnPlay,
          genreList, linearLayout, playClickView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
