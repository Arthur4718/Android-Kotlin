package madcode01.com.br.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Late init - Its a kotlin resource to tell android that this element will be init later
    private lateinit var result: EditText
    private lateinit var newNumber: EditText
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE) { findViewById<TextView>(R.id.operation) }

    //Variables to hold the operations
    private var operand1 : Double? = null
    private var operand2 : Double = 0.0
    private var pendingOperation : String  = "="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        newNumber = findViewById(R.id.newNumber)

        //Data Input Buttons
        //val button0 : Button  = findViewById<Button>(R.id.button0) old way, but it works

        //Listener for the buttons - pass the current text of the button to an operation
        val buttonListener = View.OnClickListener { v ->
            val b = v as Button // casting B as a widget tha has a TEXT property
            //reading the caption on the button and appeding it to the calculation
            newNumber.append(b.text)

        }
        //Setting up the listeners for the buttons
        //We could have used an array to set up the buttons
        button0.setOnClickListener (buttonListener)
        button1.setOnClickListener (buttonListener)
        button2.setOnClickListener (buttonListener)
        button3.setOnClickListener (buttonListener)
        button4.setOnClickListener (buttonListener)
        button5.setOnClickListener (buttonListener)
        button6.setOnClickListener (buttonListener)
        button7.setOnClickListener (buttonListener)
        button8.setOnClickListener (buttonListener)
        button9.setOnClickListener (buttonListener)

    }
}
