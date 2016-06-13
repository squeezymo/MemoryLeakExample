package com.squeezymo.memoryleakexample

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher

class AnkoTestApplication: Application() {

    lateinit var refWatcher: RefWatcher

    override fun onCreate() {
        refWatcher = LeakCanary.install(this)
    }

}

