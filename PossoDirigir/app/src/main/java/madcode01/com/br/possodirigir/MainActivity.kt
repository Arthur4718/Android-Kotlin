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
                intentTela2.putExtra("UserName", edtName.text.toString())
                startActivity(intentTela2)

            }else{
               //Usando alert builder

                //Cria uma nova instância do Alert
                val myAlert = AlertDialog.Builder(this)

                //Seta o titulo do alerta
                myAlert.setTitle("Aviso!")

                //Define a mensagem que será enviada para o usuário.
                myAlert.setMessage("Por favor preencha todos os campos")

                myAlert.setPositiveButton("Sim"){dialog, which ->

                }

                myAlert.setNegativeButton("Não"){dialog, which ->

                }

                myAlert.setNeutralButton("Cancel"){_,_ ->

                }


                val dialog: AlertDialog = myAlert.create()

                dialog.show()


            }

        }
    }



}
