package com.noteapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OtpSignInFragmentDirections {
  private OtpSignInFragmentDirections() {
  }

  @NonNull
  public static NavDirections otpSignInToHome() {
    return new ActionOnlyNavDirections(R.id.otp_sign_in_to_home);
  }
}
