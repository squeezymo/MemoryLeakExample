package com.squeezymo.memoryleakexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import org.jetbrains.anko.button
import org.jetbrains.anko.onClick
import org.jetbrains.anko.support.v4.UI

class FragmentA: AbstractFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) = UI {
        button {
            text = "Open Fragment B"
            onClick { (activity as MainActivity).openFragmentB() }
        }
    }.view

}
