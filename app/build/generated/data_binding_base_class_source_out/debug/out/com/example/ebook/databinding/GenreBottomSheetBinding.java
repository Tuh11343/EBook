// Generated by view binder compiler. Do not edit!
package com.example.ebook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ebook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GenreBottomSheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final TextView genreName;

  private GenreBottomSheetBinding(@NonNull LinearLayout rootView, @NonNull CheckBox checkBox,
      @NonNull TextView genreName) {
    this.rootView = rootView;
    this.checkBox = checkBox;
    this.genreName = genreName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GenreBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GenreBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.genre_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GenreBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkBox;
      CheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.genreName;
      TextView genreName = ViewBindings.findChildViewById(rootView, id);
      if (genreName == null) {
        break missingId;
      }

      return new GenreBottomSheetBinding((LinearLayout) rootView, checkBox, genreName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}