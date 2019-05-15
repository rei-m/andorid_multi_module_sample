package me.reim.multimodulesample.core.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class
    ]
)
interface CoreComponent {
    @Component.Builder
    interface Builder {
        fun coreModule(cm: CoreModule): Builder
        fun build(): CoreComponent
    }
}