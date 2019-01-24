package madcode01.com.br.aula02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Jeito antigo
        //val myButton : Button = findViewById<Button>(R.id.btnLogar)
        btnLogar.setOnClickListener {

        }


    }
}
