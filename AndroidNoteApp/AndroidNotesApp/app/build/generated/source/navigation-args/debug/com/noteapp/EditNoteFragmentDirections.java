package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class EditNoteFragmentDirections {
  private EditNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections editNoteToNoteDetails() {
    return new ActionOnlyNavDirections(R.id.edit_note_to_note_details);
  }
}
