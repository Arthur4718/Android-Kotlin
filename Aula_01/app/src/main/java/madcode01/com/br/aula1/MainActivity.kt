package madcode01.com.br.aula1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.btnSaudar)
        val myEditText : EditText = findViewById<EditText>(R.id.edtTexto)

        myEditText.text.clear()


        myButton.setOnClickListener {
            val textoDigitado : String = myEditText.text.toString()
            Toast.makeText(applicationContext, textoDigitado, Toast.LENGTH_SHORT).show()
            myEditText.text.clear()


        }


    }
}
