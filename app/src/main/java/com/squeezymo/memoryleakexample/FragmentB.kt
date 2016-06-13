package com.squeezymo.memoryleakexample

import android.os.Bundle
import android.util.Log
import android.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.UI

class FragmentB: AbstractFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        setHasOptionsMenu(true)

        return UI {
            verticalLayout {
                editText {
                    hint = "EditText with text watcher"
                    textChangedListener {
                        onTextChanged { text, start, before, count ->
                            Log.d("AnkoTest", "Text changed: " + text.toString())
                            toast(text.toString())
                        }
                    }
                }
            }
        }.view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.fragment_b_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_confirm -> {
                activity.supportFragmentManager.popBackStack()
            }
        }

        return true
    }

}
