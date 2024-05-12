// Generated by view binder compiler. Do not edit!
package com.example.ebook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ebook.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAuthorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView authorDescription;

  @NonNull
  public final CircleImageView authorImg;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final TextView bookAmount;

  @NonNull
  public final RecyclerView bookList;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Spinner filterSpinner;

  @NonNull
  public final RelativeLayout firstLayout;

  private FragmentAuthorBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView authorDescription, @NonNull CircleImageView authorImg,
      @NonNull TextView authorName, @NonNull TextView bookAmount, @NonNull RecyclerView bookList,
      @NonNull ImageView btnBack, @NonNull Spinner filterSpinner,
      @NonNull RelativeLayout firstLayout) {
    this.rootView = rootView;
    this.authorDescription = authorDescription;
    this.authorImg = authorImg;
    this.authorName = authorName;
    this.bookAmount = bookAmount;
    this.bookList = bookList;
    this.btnBack = btnBack;
    this.filterSpinner = filterSpinner;
    this.firstLayout = firstLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAuthorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAuthorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_author, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAuthorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authorDescription;
      TextView authorDescription = ViewBindings.findChildViewById(rootView, id);
      if (authorDescription == null) {
        break missingId;
      }

      id = R.id.authorImg;
      CircleImageView authorImg = ViewBindings.findChildViewById(rootView, id);
      if (authorImg == null) {
        break missingId;
      }

      id = R.id.authorName;
      TextView authorName = ViewBindings.findChildViewById(rootView, id);
      if (authorName == null) {
        break missingId;
      }

      id = R.id.bookAmount;
      TextView bookAmount = ViewBindings.findChildViewById(rootView, id);
      if (bookAmount == null) {
        break missingId;
      }

      id = R.id.bookList;
      RecyclerView bookList = ViewBindings.findChildViewById(rootView, id);
      if (bookList == null) {
        break missingId;
      }

      id = R.id.btnBack;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.filter_spinner;
      Spinner filterSpinner = ViewBindings.findChildViewById(rootView, id);
      if (filterSpinner == null) {
        break missingId;
      }

      id = R.id.firstLayout;
      RelativeLayout firstLayout = ViewBindings.findChildViewById(rootView, id);
      if (firstLayout == null) {
        break missingId;
      }

      return new FragmentAuthorBinding((RelativeLayout) rootView, authorDescription, authorImg,
          authorName, bookAmount, bookList, btnBack, filterSpinner, firstLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}