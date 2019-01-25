package madcode01.com.br.sharedprefs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCadastrar.setOnClickListener {
            //TODO checar se o usuário já não fez login anteriormente

            val intentTelaCadastro = Intent(applicationContext, Tela_Cadastro::class.java)
            startActivity(intentTelaCadastro)
        }
    }
}
