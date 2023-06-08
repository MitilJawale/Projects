package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections splashToSignIn() {
    return new ActionOnlyNavDirections(R.id.splash_to_sign_in);
  }
}
