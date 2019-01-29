package madcode01.com.br.sharedprefs

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

   // val sharedPrefs = getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnLogar.setOnClickListener {
//            val sharedPrefs = getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)
//            val nomeUsuario = sharedPrefs.getString("username","no-name")
//            val emailUsuario = sharedPrefs.getString("user-email","no-email ")

            if(edtUserName.text.toString() == "admin" && edtEmail.text.toString() == "admin@admin"){
                val intentTelaLogin = Intent(applicationContext, Tela_UsuarioLogado::class.java)

                startActivity(intentTelaLogin)

            }
        }

        btnCadastrar.setOnClickListener {


            val intentTelaCadastro = Intent(applicationContext, Tela_Cadastro::class.java)
            startActivity(intentTelaCadastro)
        }
    }
}
