package com.bignerdranch.android.myapplication

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
//время работы компонента,
// столько же сколько класс\активность\фраг
//на кажд отдельный модуль
object MainModule {

    //    @Singleton//для компонента приложения
    @ActivityScoped//for activity//один экземпляр
    @Provides//с помощью этой функции мы предост зависимость
    @Named("String2")
    fun provideTestString3(
        @ApplicationContext context: Context,
        @Named("String1")testString1: String
    ) = "${context.getString(R.string.string_to_inject)}  - $testString1"


}