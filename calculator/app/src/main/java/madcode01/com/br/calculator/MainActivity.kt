package madcode01.com.br.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

private const val STATE_PENDING_OPERATION = "PendingOperation"
private const val STATE_OPERAND1 = "Operand1"
private const val STATE_OPERAND1_STORED = "Operand1_Stored"

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
        buttonDot.setOnClickListener (buttonListener)

        val operationListener  = View.OnClickListener { v ->
            val op = (v as Button).text.toString()

            try{
                val value = newNumber.text.toString()
                performOperation(value, op)

            }catch (e : NumberFormatException){
                newNumber.setText("")
            }
            pendingOperation = op
            displayOperation.text = pendingOperation
        }

        buttonEquals.setOnClickListener(operationListener)
        buttonDiv.setOnClickListener(operationListener)
        buttonMulti.setOnClickListener(operationListener)
        buttonMinus.setOnClickListener(operationListener)
        buttonPlus.setOnClickListener(operationListener)

    }

    private fun performOperation(value : String, operation : String){
        if(operand1 == null){
            operand1 = value.toDouble()
        }else{
            operand2 = value.toDouble()

            if(pendingOperation == "="){
                pendingOperation = operation
            }

            when(pendingOperation){
                "=" -> operand1 = operand2
                "/" -> if(operand2 == 0.0 ){
                    operand1 = Double.NaN // handle attempt do divide by zero
                }else {
                    operand1 = operand1!! / operand2
                }
                "*" -> operand1 = operand1!! * operand2
                "-" -> operand1 = operand1!! * operand2
                "+" -> operand1 = operand1!! * operand2

            }
        }
        result.setText(operand1.toString())
        newNumber.setText("")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        if(operand1 != null){
            outState?.putDouble(STATE_OPERAND1, operand1!!)

        }
        outState?.putString(STATE_PENDING_OPERATION, pendingOperation)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        operand1 = if(savedInstanceState!!.getBoolean(STATE_OPERAND1_STORED, false)){
            savedInstanceState!!.getDouble(STATE_OPERAND1)
        } else{
            null
        }


        pendingOperation = savedInstanceState.getString(STATE_PENDING_OPERATION)
        displayOperation.text = pendingOperation
    }
}
