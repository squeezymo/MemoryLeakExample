package com.squeezymo.memoryleakexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment(R.id.primary_container, FragmentA())
    }

    fun openFragmentB() {
        showFragment(R.id.primary_container, FragmentB())
    }

}

fun AppCompatActivity.showFragment(@LayoutRes containerViewId: Int, fragment: Fragment): Fragment {
    supportFragmentManager.beginTransaction().replace(containerViewId, fragment).addToBackStack(null).commit()
    return fragment
}
