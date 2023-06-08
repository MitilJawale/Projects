// Generated by Dagger (https://dagger.dev).
package com.noteapp;

import com.noteapp.authentication.IFirebaseAuthenticationManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForgotPasswordFragment_MembersInjector implements MembersInjector<ForgotPasswordFragment> {
  private final Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider;

  public ForgotPasswordFragment_MembersInjector(
      Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider) {
    this.firebaseAuthenticationManagerProvider = firebaseAuthenticationManagerProvider;
  }

  public static MembersInjector<ForgotPasswordFragment> create(
      Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider) {
    return new ForgotPasswordFragment_MembersInjector(firebaseAuthenticationManagerProvider);
  }

  @Override
  public void injectMembers(ForgotPasswordFragment instance) {
    injectFirebaseAuthenticationManager(instance, firebaseAuthenticationManagerProvider.get());
  }

  @InjectedFieldSignature("com.noteapp.ForgotPasswordFragment.firebaseAuthenticationManager")
  public static void injectFirebaseAuthenticationManager(ForgotPasswordFragment instance,
      IFirebaseAuthenticationManager firebaseAuthenticationManager) {
    instance.firebaseAuthenticationManager = firebaseAuthenticationManager;
  }
}
