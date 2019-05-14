package me.reim.multimodulesample.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(application: Application) {

    private val context: Context = application.applicationContext

    @Provides
    @Singleton
    fun provideContext(): Context = context
}
