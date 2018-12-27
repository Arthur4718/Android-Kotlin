package br.com.example.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var userInput : EditText? = null
    private var button : Button? = null
    private var textView : TextView? = null
    private var numTimesClicked : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textview)

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                numTimesClicked += 1
                textView?.append("\n The button got tapped $numTimesClicked time")
            }
        })
    }
}
