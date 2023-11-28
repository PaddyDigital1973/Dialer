// Generated by view binder compiler. Do not edit!
package com.goodwy.dialer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.goodwy.commons.views.MyEditText;
import com.goodwy.commons.views.MyTextView;
import com.goodwy.dialer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCallBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView callAccept;

  @NonNull
  public final MyTextView callAcceptLabel;

  @NonNull
  public final ImageView callAdd;

  @NonNull
  public final ImageView callAddContact;

  @NonNull
  public final LinearLayout callAddContactHolder;

  @NonNull
  public final MyTextView callAddContactLabel;

  @NonNull
  public final LinearLayout callAddHolder;

  @NonNull
  public final MyTextView callAddLabel;

  @NonNull
  public final ImageView callDecline;

  @NonNull
  public final MyTextView callDeclineLabel;

  @NonNull
  public final ImageView callDialpad;

  @NonNull
  public final LinearLayout callDialpadHolder;

  @NonNull
  public final MyTextView callDialpadLabel;

  @NonNull
  public final ImageView callDownArrow;

  @NonNull
  public final ImageView callDraggable;

  @NonNull
  public final FrameLayout callDraggableBackground;

  @NonNull
  public final ImageView callDraggableBackgroundIcon;

  @NonNull
  public final ImageView callDraggableVertical;

  @NonNull
  public final ImageView callEnd;

  @NonNull
  public final ConstraintLayout callHolder;

  @NonNull
  public final ImageView callLeftArrow;

  @NonNull
  public final ImageView callManage;

  @NonNull
  public final MyTextView callManageLabel;

  @NonNull
  public final ImageView callMerge;

  @NonNull
  public final LinearLayout callMergeHolder;

  @NonNull
  public final MyTextView callMergeLabel;

  @NonNull
  public final ImageView callMessage;

  @NonNull
  public final MyTextView callMessageLabel;

  @NonNull
  public final ImageView callRemind;

  @NonNull
  public final MyTextView callRemindLabel;

  @NonNull
  public final ImageView callRightArrow;

  @NonNull
  public final TextView callSimId;

  @NonNull
  public final ImageView callSimImage;

  @NonNull
  public final RelativeLayout callStatusHolder;

  @NonNull
  public final MyTextView callStatusLabel;

  @NonNull
  public final ImageView callSwap;

  @NonNull
  public final LinearLayout callSwapHolder;

  @NonNull
  public final MyTextView callSwapLabel;

  @NonNull
  public final ImageView callToggleHold;

  @NonNull
  public final MyTextView callToggleLabel;

  @NonNull
  public final ImageView callToggleMicrophone;

  @NonNull
  public final MyTextView callToggleMicrophoneLabel;

  @NonNull
  public final ImageView callToggleSpeaker;

  @NonNull
  public final MyTextView callToggleSpeakerLabel;

  @NonNull
  public final ImageView callUpArrow;

  @NonNull
  public final ImageView callerAvatar;

  @NonNull
  public final MyTextView callerDescription;

  @NonNull
  public final MyTextView callerNameLabel;

  @NonNull
  public final MyTextView callerNumber;

  @NonNull
  public final Group controlsSingleCall;

  @NonNull
  public final Group controlsTwoCalls;

  @NonNull
  public final MyTextView dialpadClose;

  @NonNull
  public final DialpadCallBinding dialpadInclude;

  @NonNull
  public final MyEditText dialpadInput;

  @NonNull
  public final RelativeLayout dialpadInputHolder;

  @NonNull
  public final RelativeLayout dialpadWrapper;

  @NonNull
  public final TextView holdStatusLabel;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout incomingCallHolder;

  @NonNull
  public final MyTextView onHoldCallerName;

  @NonNull
  public final MyTextView onHoldLabel;

  @NonNull
  public final ConstraintLayout onHoldStatusHolder;

  @NonNull
  public final ConstraintLayout ongoingCallHolder;

  private ActivityCallBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView callAccept,
      @NonNull MyTextView callAcceptLabel, @NonNull ImageView callAdd,
      @NonNull ImageView callAddContact, @NonNull LinearLayout callAddContactHolder,
      @NonNull MyTextView callAddContactLabel, @NonNull LinearLayout callAddHolder,
      @NonNull MyTextView callAddLabel, @NonNull ImageView callDecline,
      @NonNull MyTextView callDeclineLabel, @NonNull ImageView callDialpad,
      @NonNull LinearLayout callDialpadHolder, @NonNull MyTextView callDialpadLabel,
      @NonNull ImageView callDownArrow, @NonNull ImageView callDraggable,
      @NonNull FrameLayout callDraggableBackground, @NonNull ImageView callDraggableBackgroundIcon,
      @NonNull ImageView callDraggableVertical, @NonNull ImageView callEnd,
      @NonNull ConstraintLayout callHolder, @NonNull ImageView callLeftArrow,
      @NonNull ImageView callManage, @NonNull MyTextView callManageLabel,
      @NonNull ImageView callMerge, @NonNull LinearLayout callMergeHolder,
      @NonNull MyTextView callMergeLabel, @NonNull ImageView callMessage,
      @NonNull MyTextView callMessageLabel, @NonNull ImageView callRemind,
      @NonNull MyTextView callRemindLabel, @NonNull ImageView callRightArrow,
      @NonNull TextView callSimId, @NonNull ImageView callSimImage,
      @NonNull RelativeLayout callStatusHolder, @NonNull MyTextView callStatusLabel,
      @NonNull ImageView callSwap, @NonNull LinearLayout callSwapHolder,
      @NonNull MyTextView callSwapLabel, @NonNull ImageView callToggleHold,
      @NonNull MyTextView callToggleLabel, @NonNull ImageView callToggleMicrophone,
      @NonNull MyTextView callToggleMicrophoneLabel, @NonNull ImageView callToggleSpeaker,
      @NonNull MyTextView callToggleSpeakerLabel, @NonNull ImageView callUpArrow,
      @NonNull ImageView callerAvatar, @NonNull MyTextView callerDescription,
      @NonNull MyTextView callerNameLabel, @NonNull MyTextView callerNumber,
      @NonNull Group controlsSingleCall, @NonNull Group controlsTwoCalls,
      @NonNull MyTextView dialpadClose, @NonNull DialpadCallBinding dialpadInclude,
      @NonNull MyEditText dialpadInput, @NonNull RelativeLayout dialpadInputHolder,
      @NonNull RelativeLayout dialpadWrapper, @NonNull TextView holdStatusLabel,
      @NonNull ImageView imageView, @NonNull ConstraintLayout incomingCallHolder,
      @NonNull MyTextView onHoldCallerName, @NonNull MyTextView onHoldLabel,
      @NonNull ConstraintLayout onHoldStatusHolder, @NonNull ConstraintLayout ongoingCallHolder) {
    this.rootView = rootView;
    this.callAccept = callAccept;
    this.callAcceptLabel = callAcceptLabel;
    this.callAdd = callAdd;
    this.callAddContact = callAddContact;
    this.callAddContactHolder = callAddContactHolder;
    this.callAddContactLabel = callAddContactLabel;
    this.callAddHolder = callAddHolder;
    this.callAddLabel = callAddLabel;
    this.callDecline = callDecline;
    this.callDeclineLabel = callDeclineLabel;
    this.callDialpad = callDialpad;
    this.callDialpadHolder = callDialpadHolder;
    this.callDialpadLabel = callDialpadLabel;
    this.callDownArrow = callDownArrow;
    this.callDraggable = callDraggable;
    this.callDraggableBackground = callDraggableBackground;
    this.callDraggableBackgroundIcon = callDraggableBackgroundIcon;
    this.callDraggableVertical = callDraggableVertical;
    this.callEnd = callEnd;
    this.callHolder = callHolder;
    this.callLeftArrow = callLeftArrow;
    this.callManage = callManage;
    this.callManageLabel = callManageLabel;
    this.callMerge = callMerge;
    this.callMergeHolder = callMergeHolder;
    this.callMergeLabel = callMergeLabel;
    this.callMessage = callMessage;
    this.callMessageLabel = callMessageLabel;
    this.callRemind = callRemind;
    this.callRemindLabel = callRemindLabel;
    this.callRightArrow = callRightArrow;
    this.callSimId = callSimId;
    this.callSimImage = callSimImage;
    this.callStatusHolder = callStatusHolder;
    this.callStatusLabel = callStatusLabel;
    this.callSwap = callSwap;
    this.callSwapHolder = callSwapHolder;
    this.callSwapLabel = callSwapLabel;
    this.callToggleHold = callToggleHold;
    this.callToggleLabel = callToggleLabel;
    this.callToggleMicrophone = callToggleMicrophone;
    this.callToggleMicrophoneLabel = callToggleMicrophoneLabel;
    this.callToggleSpeaker = callToggleSpeaker;
    this.callToggleSpeakerLabel = callToggleSpeakerLabel;
    this.callUpArrow = callUpArrow;
    this.callerAvatar = callerAvatar;
    this.callerDescription = callerDescription;
    this.callerNameLabel = callerNameLabel;
    this.callerNumber = callerNumber;
    this.controlsSingleCall = controlsSingleCall;
    this.controlsTwoCalls = controlsTwoCalls;
    this.dialpadClose = dialpadClose;
    this.dialpadInclude = dialpadInclude;
    this.dialpadInput = dialpadInput;
    this.dialpadInputHolder = dialpadInputHolder;
    this.dialpadWrapper = dialpadWrapper;
    this.holdStatusLabel = holdStatusLabel;
    this.imageView = imageView;
    this.incomingCallHolder = incomingCallHolder;
    this.onHoldCallerName = onHoldCallerName;
    this.onHoldLabel = onHoldLabel;
    this.onHoldStatusHolder = onHoldStatusHolder;
    this.ongoingCallHolder = ongoingCallHolder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_call, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.call_accept;
      ImageView callAccept = ViewBindings.findChildViewById(rootView, id);
      if (callAccept == null) {
        break missingId;
      }

      id = R.id.call_accept_label;
      MyTextView callAcceptLabel = ViewBindings.findChildViewById(rootView, id);
      if (callAcceptLabel == null) {
        break missingId;
      }

      id = R.id.call_add;
      ImageView callAdd = ViewBindings.findChildViewById(rootView, id);
      if (callAdd == null) {
        break missingId;
      }

      id = R.id.call_add_contact;
      ImageView callAddContact = ViewBindings.findChildViewById(rootView, id);
      if (callAddContact == null) {
        break missingId;
      }

      id = R.id.call_add_contact_holder;
      LinearLayout callAddContactHolder = ViewBindings.findChildViewById(rootView, id);
      if (callAddContactHolder == null) {
        break missingId;
      }

      id = R.id.call_add_contact_label;
      MyTextView callAddContactLabel = ViewBindings.findChildViewById(rootView, id);
      if (callAddContactLabel == null) {
        break missingId;
      }

      id = R.id.callAddHolder;
      LinearLayout callAddHolder = ViewBindings.findChildViewById(rootView, id);
      if (callAddHolder == null) {
        break missingId;
      }

      id = R.id.call_add_label;
      MyTextView callAddLabel = ViewBindings.findChildViewById(rootView, id);
      if (callAddLabel == null) {
        break missingId;
      }

      id = R.id.call_decline;
      ImageView callDecline = ViewBindings.findChildViewById(rootView, id);
      if (callDecline == null) {
        break missingId;
      }

      id = R.id.call_decline_label;
      MyTextView callDeclineLabel = ViewBindings.findChildViewById(rootView, id);
      if (callDeclineLabel == null) {
        break missingId;
      }

      id = R.id.call_dialpad;
      ImageView callDialpad = ViewBindings.findChildViewById(rootView, id);
      if (callDialpad == null) {
        break missingId;
      }

      id = R.id.callDialpadHolder;
      LinearLayout callDialpadHolder = ViewBindings.findChildViewById(rootView, id);
      if (callDialpadHolder == null) {
        break missingId;
      }

      id = R.id.call_dialpad_label;
      MyTextView callDialpadLabel = ViewBindings.findChildViewById(rootView, id);
      if (callDialpadLabel == null) {
        break missingId;
      }

      id = R.id.call_down_arrow;
      ImageView callDownArrow = ViewBindings.findChildViewById(rootView, id);
      if (callDownArrow == null) {
        break missingId;
      }

      id = R.id.call_draggable;
      ImageView callDraggable = ViewBindings.findChildViewById(rootView, id);
      if (callDraggable == null) {
        break missingId;
      }

      id = R.id.call_draggable_background;
      FrameLayout callDraggableBackground = ViewBindings.findChildViewById(rootView, id);
      if (callDraggableBackground == null) {
        break missingId;
      }

      id = R.id.call_draggable_background_icon;
      ImageView callDraggableBackgroundIcon = ViewBindings.findChildViewById(rootView, id);
      if (callDraggableBackgroundIcon == null) {
        break missingId;
      }

      id = R.id.call_draggable_vertical;
      ImageView callDraggableVertical = ViewBindings.findChildViewById(rootView, id);
      if (callDraggableVertical == null) {
        break missingId;
      }

      id = R.id.call_end;
      ImageView callEnd = ViewBindings.findChildViewById(rootView, id);
      if (callEnd == null) {
        break missingId;
      }

      ConstraintLayout callHolder = (ConstraintLayout) rootView;

      id = R.id.call_left_arrow;
      ImageView callLeftArrow = ViewBindings.findChildViewById(rootView, id);
      if (callLeftArrow == null) {
        break missingId;
      }

      id = R.id.call_manage;
      ImageView callManage = ViewBindings.findChildViewById(rootView, id);
      if (callManage == null) {
        break missingId;
      }

      id = R.id.call_manage_label;
      MyTextView callManageLabel = ViewBindings.findChildViewById(rootView, id);
      if (callManageLabel == null) {
        break missingId;
      }

      id = R.id.call_merge;
      ImageView callMerge = ViewBindings.findChildViewById(rootView, id);
      if (callMerge == null) {
        break missingId;
      }

      id = R.id.call_merge_holder;
      LinearLayout callMergeHolder = ViewBindings.findChildViewById(rootView, id);
      if (callMergeHolder == null) {
        break missingId;
      }

      id = R.id.call_merge_label;
      MyTextView callMergeLabel = ViewBindings.findChildViewById(rootView, id);
      if (callMergeLabel == null) {
        break missingId;
      }

      id = R.id.call_message;
      ImageView callMessage = ViewBindings.findChildViewById(rootView, id);
      if (callMessage == null) {
        break missingId;
      }

      id = R.id.call_message_label;
      MyTextView callMessageLabel = ViewBindings.findChildViewById(rootView, id);
      if (callMessageLabel == null) {
        break missingId;
      }

      id = R.id.call_remind;
      ImageView callRemind = ViewBindings.findChildViewById(rootView, id);
      if (callRemind == null) {
        break missingId;
      }

      id = R.id.call_remind_label;
      MyTextView callRemindLabel = ViewBindings.findChildViewById(rootView, id);
      if (callRemindLabel == null) {
        break missingId;
      }

      id = R.id.call_right_arrow;
      ImageView callRightArrow = ViewBindings.findChildViewById(rootView, id);
      if (callRightArrow == null) {
        break missingId;
      }

      id = R.id.call_sim_id;
      TextView callSimId = ViewBindings.findChildViewById(rootView, id);
      if (callSimId == null) {
        break missingId;
      }

      id = R.id.call_sim_image;
      ImageView callSimImage = ViewBindings.findChildViewById(rootView, id);
      if (callSimImage == null) {
        break missingId;
      }

      id = R.id.call_status_holder;
      RelativeLayout callStatusHolder = ViewBindings.findChildViewById(rootView, id);
      if (callStatusHolder == null) {
        break missingId;
      }

      id = R.id.call_status_label;
      MyTextView callStatusLabel = ViewBindings.findChildViewById(rootView, id);
      if (callStatusLabel == null) {
        break missingId;
      }

      id = R.id.call_swap;
      ImageView callSwap = ViewBindings.findChildViewById(rootView, id);
      if (callSwap == null) {
        break missingId;
      }

      id = R.id.call_swap_holder;
      LinearLayout callSwapHolder = ViewBindings.findChildViewById(rootView, id);
      if (callSwapHolder == null) {
        break missingId;
      }

      id = R.id.call_swap_label;
      MyTextView callSwapLabel = ViewBindings.findChildViewById(rootView, id);
      if (callSwapLabel == null) {
        break missingId;
      }

      id = R.id.call_toggle_hold;
      ImageView callToggleHold = ViewBindings.findChildViewById(rootView, id);
      if (callToggleHold == null) {
        break missingId;
      }

      id = R.id.call_toggle_label;
      MyTextView callToggleLabel = ViewBindings.findChildViewById(rootView, id);
      if (callToggleLabel == null) {
        break missingId;
      }

      id = R.id.callToggleMicrophone;
      ImageView callToggleMicrophone = ViewBindings.findChildViewById(rootView, id);
      if (callToggleMicrophone == null) {
        break missingId;
      }

      id = R.id.call_toggle_microphone_label;
      MyTextView callToggleMicrophoneLabel = ViewBindings.findChildViewById(rootView, id);
      if (callToggleMicrophoneLabel == null) {
        break missingId;
      }

      id = R.id.callToggleSpeaker;
      ImageView callToggleSpeaker = ViewBindings.findChildViewById(rootView, id);
      if (callToggleSpeaker == null) {
        break missingId;
      }

      id = R.id.callToggleSpeakerLabel;
      MyTextView callToggleSpeakerLabel = ViewBindings.findChildViewById(rootView, id);
      if (callToggleSpeakerLabel == null) {
        break missingId;
      }

      id = R.id.call_up_arrow;
      ImageView callUpArrow = ViewBindings.findChildViewById(rootView, id);
      if (callUpArrow == null) {
        break missingId;
      }

      id = R.id.caller_avatar;
      ImageView callerAvatar = ViewBindings.findChildViewById(rootView, id);
      if (callerAvatar == null) {
        break missingId;
      }

      id = R.id.caller_description;
      MyTextView callerDescription = ViewBindings.findChildViewById(rootView, id);
      if (callerDescription == null) {
        break missingId;
      }

      id = R.id.callerNameLabel;
      MyTextView callerNameLabel = ViewBindings.findChildViewById(rootView, id);
      if (callerNameLabel == null) {
        break missingId;
      }

      id = R.id.caller_number;
      MyTextView callerNumber = ViewBindings.findChildViewById(rootView, id);
      if (callerNumber == null) {
        break missingId;
      }

      id = R.id.controls_single_call;
      Group controlsSingleCall = ViewBindings.findChildViewById(rootView, id);
      if (controlsSingleCall == null) {
        break missingId;
      }

      id = R.id.controls_two_calls;
      Group controlsTwoCalls = ViewBindings.findChildViewById(rootView, id);
      if (controlsTwoCalls == null) {
        break missingId;
      }

      id = R.id.dialpadClose;
      MyTextView dialpadClose = ViewBindings.findChildViewById(rootView, id);
      if (dialpadClose == null) {
        break missingId;
      }

      id = R.id.dialpad_include;
      View dialpadInclude = ViewBindings.findChildViewById(rootView, id);
      if (dialpadInclude == null) {
        break missingId;
      }
      DialpadCallBinding binding_dialpadInclude = DialpadCallBinding.bind(dialpadInclude);

      id = R.id.dialpad_input;
      MyEditText dialpadInput = ViewBindings.findChildViewById(rootView, id);
      if (dialpadInput == null) {
        break missingId;
      }

      id = R.id.dialpad_input_holder;
      RelativeLayout dialpadInputHolder = ViewBindings.findChildViewById(rootView, id);
      if (dialpadInputHolder == null) {
        break missingId;
      }

      id = R.id.dialpad_wrapper;
      RelativeLayout dialpadWrapper = ViewBindings.findChildViewById(rootView, id);
      if (dialpadWrapper == null) {
        break missingId;
      }

      id = R.id.hold_status_label;
      TextView holdStatusLabel = ViewBindings.findChildViewById(rootView, id);
      if (holdStatusLabel == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.incoming_call_holder;
      ConstraintLayout incomingCallHolder = ViewBindings.findChildViewById(rootView, id);
      if (incomingCallHolder == null) {
        break missingId;
      }

      id = R.id.on_hold_caller_name;
      MyTextView onHoldCallerName = ViewBindings.findChildViewById(rootView, id);
      if (onHoldCallerName == null) {
        break missingId;
      }

      id = R.id.on_hold_label;
      MyTextView onHoldLabel = ViewBindings.findChildViewById(rootView, id);
      if (onHoldLabel == null) {
        break missingId;
      }

      id = R.id.on_hold_status_holder;
      ConstraintLayout onHoldStatusHolder = ViewBindings.findChildViewById(rootView, id);
      if (onHoldStatusHolder == null) {
        break missingId;
      }

      id = R.id.ongoing_call_holder;
      ConstraintLayout ongoingCallHolder = ViewBindings.findChildViewById(rootView, id);
      if (ongoingCallHolder == null) {
        break missingId;
      }

      return new ActivityCallBinding((ConstraintLayout) rootView, callAccept, callAcceptLabel,
          callAdd, callAddContact, callAddContactHolder, callAddContactLabel, callAddHolder,
          callAddLabel, callDecline, callDeclineLabel, callDialpad, callDialpadHolder,
          callDialpadLabel, callDownArrow, callDraggable, callDraggableBackground,
          callDraggableBackgroundIcon, callDraggableVertical, callEnd, callHolder, callLeftArrow,
          callManage, callManageLabel, callMerge, callMergeHolder, callMergeLabel, callMessage,
          callMessageLabel, callRemind, callRemindLabel, callRightArrow, callSimId, callSimImage,
          callStatusHolder, callStatusLabel, callSwap, callSwapHolder, callSwapLabel,
          callToggleHold, callToggleLabel, callToggleMicrophone, callToggleMicrophoneLabel,
          callToggleSpeaker, callToggleSpeakerLabel, callUpArrow, callerAvatar, callerDescription,
          callerNameLabel, callerNumber, controlsSingleCall, controlsTwoCalls, dialpadClose,
          binding_dialpadInclude, dialpadInput, dialpadInputHolder, dialpadWrapper, holdStatusLabel,
          imageView, incomingCallHolder, onHoldCallerName, onHoldLabel, onHoldStatusHolder,
          ongoingCallHolder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
