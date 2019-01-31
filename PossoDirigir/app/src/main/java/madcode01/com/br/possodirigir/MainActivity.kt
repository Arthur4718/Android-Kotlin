package madcode01.com.br.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnIniciar.setOnClickListener {


            if(edtName.text.isNotEmpty()){
                val intentTela2 = Intent(this, Tela2::class.java)
                intentTela2.putExtra("username", edtName.text.toString() )
                startActivity(intentTela2)

            }else{
                //Toast.makeText(applicationContext, "Preencha os campo corretamente", Toast.LENGTH_SHORT).show()
                //Construir um objeto que vai cuidar do Alerta.
                val myAlert = AlertDialog.Builder(this)
                //Titulo
                myAlert.setTitle("Aviso!")

                //Mensagem para o usuário
                myAlert.setMessage("Por favor preencha o campo.")

                myAlert.setPositiveButton("Sim"){ _ , _  ->

                }

                myAlert.setNegativeButton("Não"){ _ , _  ->

                }
                //Dialogo
                val dialog : AlertDialog = myAlert.create()

                //Mostrar alerta
                dialog.show()


            }




        }

        btnLimpar.setOnClickListener {

            val novoAlert = AlertDialog.Builder(this)
            //Titulo
            novoAlert.setTitle("Aviso!")

            //Mensagem para o usuário
            novoAlert.setMessage("Deseja limpar todos os campos?")

            novoAlert.setPositiveButton("Sim"){ _ , _  ->
                edtName.text.clear()
            }

            novoAlert.setNegativeButton("Não"){ _ , _  ->

            }
            //Dialogo
            val novoDialog : AlertDialog = novoAlert.create()

            //Mostrar alerta
            novoDialog.show()

        }




    }
}
