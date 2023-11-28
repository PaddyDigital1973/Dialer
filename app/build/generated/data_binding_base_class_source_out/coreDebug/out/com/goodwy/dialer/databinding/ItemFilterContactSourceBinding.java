// Generated by view binder compiler. Do not edit!
package com.goodwy.dialer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.goodwy.commons.views.MyAppCompatCheckbox;
import com.goodwy.dialer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFilterContactSourceBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MyAppCompatCheckbox filterContactSourceCheckbox;

  @NonNull
  public final RelativeLayout filterContactSourceHolder;

  private ItemFilterContactSourceBinding(@NonNull RelativeLayout rootView,
      @NonNull MyAppCompatCheckbox filterContactSourceCheckbox,
      @NonNull RelativeLayout filterContactSourceHolder) {
    this.rootView = rootView;
    this.filterContactSourceCheckbox = filterContactSourceCheckbox;
    this.filterContactSourceHolder = filterContactSourceHolder;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFilterContactSourceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFilterContactSourceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_filter_contact_source, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFilterContactSourceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filter_contact_source_checkbox;
      MyAppCompatCheckbox filterContactSourceCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (filterContactSourceCheckbox == null) {
        break missingId;
      }

      RelativeLayout filterContactSourceHolder = (RelativeLayout) rootView;

      return new ItemFilterContactSourceBinding((RelativeLayout) rootView,
          filterContactSourceCheckbox, filterContactSourceHolder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
