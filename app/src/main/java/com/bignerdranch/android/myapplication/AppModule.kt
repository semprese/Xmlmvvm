package com.bignerdranch.android.myapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
//время работы компонента,
// столько же сколько класс\активность\фраг
//на кажд отдельный модуль
object AppModule {

    @Singleton
    @Provides//с помощью этой функции мы предост зависимость
    @Named("String1")
    fun provideTestString1() = "This is a string1 we will inject"

    @Singleton
    @Provides//с помощью этой функции мы предост зависимость
    fun provideTestString2() = "This is a string2 we will inject as well"
}