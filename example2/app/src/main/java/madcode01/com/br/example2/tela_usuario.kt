package madcode01.com.br.example2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_usuario.*


class tela_usuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_usuario)

        //Definindo uma variável para receber o conteúdo da intent
        val username = intent.getStringExtra(USERNAME_TAG)
        //Exibindo o conteúdo num textview
        tvExibirNome.text = "Bem vindo: $username"

    }
}
