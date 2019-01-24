package madcode01.com.br.example2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//Com esta biblioteca, carregamos todos os IDS da actvity main nesta página
import kotlinx.android.synthetic.main.activity_main.*

//Tag para identificar o conteúdo do nome do usuário enviando por intent
const val USERNAME_TAG : String = "usertag" // Valor constante e global - Pode ser acessado por qualquer activity, mas nenhuma activity pode alterar seu conteúdo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Define o layout a ser utilizado

        //A linha 20 define que o btnLogin possui um evento de click

        btnLogin.setOnClickListener {
            if(edtUserName.text.isNotEmpty() && edtUserPassword.text.isNotEmpty() ){
                //Comentários podem e DEVEM sempre iniciar com duas barras
                //Toast.makeText(applicationContext, "Efetuando Login", Toast.LENGTH_SHORT).show()

                //Construindo a ação para invocar a próxima tela.
                //val intent = Intent(applicationContext , tela_usuario::class.java )

                //Com o método putExtra, podemos enviar informações através de uma intent
                val intent = Intent(applicationContext, tela_usuario::class.java).apply {

                    putExtra(USERNAME_TAG, edtUserName.text.toString())

                }


                startActivity(intent)

            }else{
                Toast.makeText(applicationContext, "Falha de  Login", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
