package madcode01.com.br.sharedprefs

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela__usuario_logado.*

class Tela_UsuarioLogado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__usuario_logado)

        //Get preferences
        val sharedPrefs = getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)
        val nomeUsuario = sharedPrefs.getString("username","NO NAME")
        tvUsuarioLogado.text = "Usuario: $nomeUsuario"


        btnDeslogar.setOnClickListener {

        }
    }
}
