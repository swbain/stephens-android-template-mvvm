package com.stephenbain.androidtemplate.home

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModule {
    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment
}
