package madcode01.com.br.possodirigir

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val username = intent.getStringExtra("UserName")
        tvBemvindo.text = "Bem vindo, $username"

        val listaIdade = arrayListOf<Int>()

        for(i in 0..20){
            listaIdade.add(i)
        }

        spnIdade.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaIdade)

        spnIdade.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("Tela2", "Nothing Selected")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val item = spnIdade.selectedItem
                Log.d("Tela2", "Item Selected: $item")
            }
        }

        btnVerificar.setOnClickListener {
            val item = spnIdade.selectedItem.toString().toInt()

            if(item > 18){
                tvResultado.text = "Pode!"

            }else{
                tvResultado.text = "Pode não!"
            }

        }


    }
}
