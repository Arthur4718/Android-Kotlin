package madcode01.com.br.aula3completa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar.setOnClickListener {

            val intentTelaIdade = Intent(applicationContext, TelaIdade::class.java)

            intentTelaIdade.putExtra("TAG_NOME", edtNome.text.toString())

            startActivity(intentTelaIdade)



//            val intentIdade = Intent(applicationContext, TelaIdade::class.java).apply {
//                putExtra("TAG_NOME", edtNome.text.toString())
//            }
//            startActivity(intentIdade)


        }

    }
}
