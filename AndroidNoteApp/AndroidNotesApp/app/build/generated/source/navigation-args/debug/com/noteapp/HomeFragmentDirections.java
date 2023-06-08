package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections homeToNoteDetails() {
    return new ActionOnlyNavDirections(R.id.home_to_note_details);
  }

  @NonNull
  public static NavDirections homeToEditNote() {
    return new ActionOnlyNavDirections(R.id.home_to_edit_note);
  }
}
