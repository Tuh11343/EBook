// Generated by view binder compiler. Do not edit!
package com.example.ebook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ebook.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BookviewWithcardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView bookImg;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final TextView genreName;

  private BookviewWithcardBinding(@NonNull RelativeLayout rootView, @NonNull ImageView bookImg,
      @NonNull MaterialCardView cardView, @NonNull TextView genreName) {
    this.rootView = rootView;
    this.bookImg = bookImg;
    this.cardView = cardView;
    this.genreName = genreName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BookviewWithcardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BookviewWithcardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bookview_withcard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BookviewWithcardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookImg;
      ImageView bookImg = ViewBindings.findChildViewById(rootView, id);
      if (bookImg == null) {
        break missingId;
      }

      id = R.id.cardView;
      MaterialCardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.genreName;
      TextView genreName = ViewBindings.findChildViewById(rootView, id);
      if (genreName == null) {
        break missingId;
      }

      return new BookviewWithcardBinding((RelativeLayout) rootView, bookImg, cardView, genreName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
