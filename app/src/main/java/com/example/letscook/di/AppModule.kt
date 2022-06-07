/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.di

import android.content.Context
import com.example.letscook.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Define di with lifecycle go along with the application.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    /**
     * Provide the application context.
     */
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext context: Context): BaseApplication =
        context as BaseApplication

    @Singleton
    @Provides
    fun provideRandomString(): String = "Quang Chien Pham testing di"

}
