package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class NotesDetailsFragmentDirections {
  private NotesDetailsFragmentDirections() {
  }

  @NonNull
  public static NavDirections noteDetailsToHome() {
    return new ActionOnlyNavDirections(R.id.note_details_to_home);
  }

  @NonNull
  public static NavDirections noteDetailsToEditNote() {
    return new ActionOnlyNavDirections(R.id.note_details_to_edit_note);
  }
}
