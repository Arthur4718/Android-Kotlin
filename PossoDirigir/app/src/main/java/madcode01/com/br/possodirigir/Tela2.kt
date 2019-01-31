package madcode01.com.br.possodirigir

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val username = intent.getStringExtra("username")

        tvBemvindo.text = "Bem vindo, $username"
        //Criar uma lista de informações
        val listaIdade = arrayListOf<Int>()


        val IdadeMinima : Int = 14
        val IdadeMaxima : Int = 65

        //Preencher a lista
        for(i in IdadeMinima..IdadeMaxima){
            listaIdade.add(i)
        }
        //Aplicar a lista ao spinner
        spnIdade.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaIdade)

        btnVerificar.setOnClickListener {


            val itemSelecionado = spnIdade.selectedItem.toString().toInt()

            val idadeLegal = 18

            if(itemSelecionado >= idadeLegal){

                tvResultado.text = "Pode sim!"

            }else{
                tvResultado.text = "Pode não!"
            }
        }



    }
}
