package prj05.com.br.prj05

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var userInput : EditText? = null
    private var button : Button? = null
    private var textView : TextView? = null
    private var timesClicked : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //link with the xml widgets
        userInput = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.text)

        button?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                timesClicked += 1
                textView?.append("\n the button has been clicked: $timesClicked times")
            }
        })

    }
}
