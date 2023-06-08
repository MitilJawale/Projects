// Generated by Dagger (https://dagger.dev).
package com.noteapp.database.di;

import android.database.sqlite.SQLiteDatabase;
import com.noteapp.database.DatabaseHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteDBModule_Bind$app_debugFactory implements Factory<SQLiteDatabase> {
  private final Provider<DatabaseHelper> helperProvider;

  public NoteDBModule_Bind$app_debugFactory(Provider<DatabaseHelper> helperProvider) {
    this.helperProvider = helperProvider;
  }

  @Override
  public SQLiteDatabase get() {
    return bind$app_debug(helperProvider.get());
  }

  public static NoteDBModule_Bind$app_debugFactory create(Provider<DatabaseHelper> helperProvider) {
    return new NoteDBModule_Bind$app_debugFactory(helperProvider);
  }

  public static SQLiteDatabase bind$app_debug(DatabaseHelper helper) {
    return Preconditions.checkNotNullFromProvides(NoteDBModule.INSTANCE.bind$app_debug(helper));
  }
}