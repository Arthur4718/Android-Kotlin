package madcode01.com.br.buttonexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var timesClicked : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById<Button>(R.id.btnShowMessage)
        val button2 : Button = findViewById<Button>(R.id.btnShowtimesClicked)
        //Isto é um comentário

        /*Isto é um bloco de comentário

        safsdfsafsdflaksdhfoiashdfoiahsf
         */

        //Modelo mais simples de listener de botão
        button.setOnClickListener{
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            timesClicked += 1
            button2?.setText("Button Clicked: $timesClicked times ")

        }

        //Desafio identificar qual botão foi clicado


    }
}
