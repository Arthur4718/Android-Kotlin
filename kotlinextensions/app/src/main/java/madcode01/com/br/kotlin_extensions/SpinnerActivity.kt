package madcode01.com.br.kotlin_extensions

import android.app.Activity
import android.view.View
import android.widget.AdapterView

//Example from https://developer.android.com/guide/topics/ui/controls/spinner#kotlin

class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}