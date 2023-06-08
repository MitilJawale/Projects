package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class ForgotPasswordFragmentDirections {
  private ForgotPasswordFragmentDirections() {
  }

  @NonNull
  public static NavDirections forgotPasswordToSignIn() {
    return new ActionOnlyNavDirections(R.id.forgot_password_to_sign_in);
  }
}
