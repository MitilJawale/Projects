package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SignInFragmentDirections {
  private SignInFragmentDirections() {
  }

  @NonNull
  public static NavDirections signInToSignUp() {
    return new ActionOnlyNavDirections(R.id.sign_in_to_sign_up);
  }

  @NonNull
  public static NavDirections signInToHome() {
    return new ActionOnlyNavDirections(R.id.sign_in_to_home);
  }

  @NonNull
  public static NavDirections signInToForgotPassword() {
    return new ActionOnlyNavDirections(R.id.sign_in_to_forgot_password);
  }

  @NonNull
  public static NavDirections signInToOtpSignIn() {
    return new ActionOnlyNavDirections(R.id.sign_in_to_otp_sign_in);
  }
}
