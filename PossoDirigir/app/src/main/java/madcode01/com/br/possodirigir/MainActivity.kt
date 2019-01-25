package madcode01.com.br.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnIniciar.setOnClickListener {

            if(edtName.text.isNotEmpty()){
                val intentTela2 = Intent(this, Tela2::class.java)
                intentTela2.putExtra("UserName", edtName.text.toString())
                startActivity(intentTela2)

            }else{
                Toast.makeText(applicationContext, "Preencha os campo corretamente", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
