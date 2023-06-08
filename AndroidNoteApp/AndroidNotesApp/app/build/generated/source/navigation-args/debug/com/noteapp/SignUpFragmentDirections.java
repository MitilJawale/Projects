package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections signUpToSignIn() {
    return new ActionOnlyNavDirections(R.id.sign_up_to_sign_in);
  }
}
