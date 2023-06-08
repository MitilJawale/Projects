// Generated by Dagger (https://dagger.dev).
package com.noteapp.sharedPreferences;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrainingStorageModule_Bind$app_debugFactory implements Factory<ISharedPreferenceManager> {
  private final Provider<SharedPreferenceManager> implProvider;

  public TrainingStorageModule_Bind$app_debugFactory(
      Provider<SharedPreferenceManager> implProvider) {
    this.implProvider = implProvider;
  }

  @Override
  public ISharedPreferenceManager get() {
    return bind$app_debug(implProvider.get());
  }

  public static TrainingStorageModule_Bind$app_debugFactory create(
      Provider<SharedPreferenceManager> implProvider) {
    return new TrainingStorageModule_Bind$app_debugFactory(implProvider);
  }

  public static ISharedPreferenceManager bind$app_debug(SharedPreferenceManager impl) {
    return Preconditions.checkNotNullFromProvides(TrainingStorageModule.INSTANCE.bind$app_debug(impl));
  }
}
