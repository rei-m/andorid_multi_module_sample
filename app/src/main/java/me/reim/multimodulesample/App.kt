package me.reim.multimodulesample

import android.app.Application
import me.reim.multimodulesample.core.di.CoreComponent
import me.reim.multimodulesample.core.di.CoreComponentProvider
import me.reim.multimodulesample.core.di.CoreModule
import me.reim.multimodulesample.core.di.DaggerCoreComponent

class App : Application(), CoreComponentProvider {

    private val coreComponent by lazy {
        DaggerCoreComponent.builder().coreModule(CoreModule()).build()
    }

    override fun provideCoreComponent(): CoreComponent {
        return coreComponent
    }
}
