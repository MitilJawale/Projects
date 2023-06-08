// Generated by Dagger (https://dagger.dev).
package com.noteapp;

import com.noteapp.authentication.IFirebaseAuthenticationManager;
import com.noteapp.services.IAddressManager;
import com.noteapp.storage.IFirebaseStorageManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignUpFragment_MembersInjector implements MembersInjector<SignUpFragment> {
  private final Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider;

  private final Provider<IFirebaseStorageManager> firebaseStorageManagerProvider;

  private final Provider<IAddressManager> addressManagerProvider;

  public SignUpFragment_MembersInjector(
      Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider,
      Provider<IFirebaseStorageManager> firebaseStorageManagerProvider,
      Provider<IAddressManager> addressManagerProvider) {
    this.firebaseAuthenticationManagerProvider = firebaseAuthenticationManagerProvider;
    this.firebaseStorageManagerProvider = firebaseStorageManagerProvider;
    this.addressManagerProvider = addressManagerProvider;
  }

  public static MembersInjector<SignUpFragment> create(
      Provider<IFirebaseAuthenticationManager> firebaseAuthenticationManagerProvider,
      Provider<IFirebaseStorageManager> firebaseStorageManagerProvider,
      Provider<IAddressManager> addressManagerProvider) {
    return new SignUpFragment_MembersInjector(firebaseAuthenticationManagerProvider, firebaseStorageManagerProvider, addressManagerProvider);
  }

  @Override
  public void injectMembers(SignUpFragment instance) {
    injectFirebaseAuthenticationManager(instance, firebaseAuthenticationManagerProvider.get());
    injectFirebaseStorageManager(instance, firebaseStorageManagerProvider.get());
    injectAddressManager(instance, addressManagerProvider.get());
  }

  @InjectedFieldSignature("com.noteapp.SignUpFragment.firebaseAuthenticationManager")
  public static void injectFirebaseAuthenticationManager(SignUpFragment instance,
      IFirebaseAuthenticationManager firebaseAuthenticationManager) {
    instance.firebaseAuthenticationManager = firebaseAuthenticationManager;
  }

  @InjectedFieldSignature("com.noteapp.SignUpFragment.firebaseStorageManager")
  public static void injectFirebaseStorageManager(SignUpFragment instance,
      IFirebaseStorageManager firebaseStorageManager) {
    instance.firebaseStorageManager = firebaseStorageManager;
  }

  @InjectedFieldSignature("com.noteapp.SignUpFragment.addressManager")
  public static void injectAddressManager(SignUpFragment instance, IAddressManager addressManager) {
    instance.addressManager = addressManager;
  }
}
