package madcode01.com.br.example2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//Buscando todos os ids contindos no documento, inclusive layout
import kotlinx.android.synthetic.main.activity_main.*

const  val USERNAME_TAG : String = "USER_TAG"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Verifica se senha ou nome estão vazios.
        btnLogin.setOnClickListener{
            if(edtUserName.text.isNotEmpty() && edtUserPassword.text.isNotEmpty()){
                //Efetuar Login - primeiro exemplo
                //val intent = Intent(applicationContext, activity_usuario::class.java)
                //startActivity(intent)

                val intent = Intent(applicationContext, activity_usuario::class.java).apply {
                    putExtra(USERNAME_TAG, edtUserName.text.toString())

                }
                startActivity(intent)
            }
            else{
                //Avisar o usuário que o login falhou
                Toast.makeText(applicationContext, "O login falhou", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
