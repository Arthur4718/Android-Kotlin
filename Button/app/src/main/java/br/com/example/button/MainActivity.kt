package br.com.example.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


private const val TAG : String = "MainActivity"
private const val TEXT_SAVED : String = ""

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "On create called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput : EditText = findViewById<EditText>(R.id.editText)
        val button : Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textview)
        textView?.text = ""
        userInput.setText("")
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "On click called")
                textView?.append(userInput.text)
                textView?.append("\n")
                //userInput.text.clear()
                userInput.setText("")

            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "On Start called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG, "On Restore Instance State called")
        super.onRestoreInstanceState(savedInstanceState)
        //restoring the text from the bundle
        val savedString = savedInstanceState?.getString(TEXT_SAVED, "")
        textView?.text = savedString

    }

    override fun onResume() {
        Log.d(TAG, "On Resume called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "On Pause called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG, "On Save Instance State called")
        super.onSaveInstanceState(outState)
        //saving the text with bundle
        // ? is here because the object its nullble
         outState?.putString(TEXT_SAVED, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "On Stop called")
        super.onStop()
    }


}
