package com.squeezymo.memoryleakexample

import android.support.v4.app.Fragment
import android.util.Log

abstract class AbstractFragment: Fragment() {

    override fun onDestroy() {
        super.onDestroy()

        Log.d("AnkoTest", "Watching: " + javaClass.simpleName)
        (activity.application as AnkoTestApplication).refWatcher.watch(this)
    }

}
