package madcode01.com.br.sharedprefs

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela__cadastro.*

class Tela_Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__cadastro)


        btnConcluirForm1.setOnClickListener {

            salvarDados()
        }


    }
    private fun salvarDados(){

        if(!validarNome()){
            return
        }
        if(!validarEmail()){
            return
        }
        if(!validarIdade()){
            return
        }

        //Salvar Dados no shared prefs
        val sharedPrefs = getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)
        val editor = sharedPrefs.edit()
        editor.putString("username", edtNomeCompleto.text.toString())

        editor.apply()

        val intentForm2 = Intent(this, Tela_Cadastro_2::class.java)
        startActivity(intentForm2)

    }

    private fun validarNome(): Boolean {
        //Checar se os dados são validos!
        if(edtNomeCompleto.text.isEmpty()){
            inputLayoutNOme.error = "Preencha o nome por favor"
            return false
        }
        else{
            inputLayoutNOme.error = null
        }

        return true
    }

    private fun validarEmail(): Boolean{

        if(edtEmail.text.isEmpty()){
            inputEmail.error = "Preencha o e-mail por favor"
            return false
        }
        else{
            inputEmail.error = null
        }
        return true
    }
    private fun validarIdade() : Boolean{
        if(edtIdade.text.isEmpty()){
            inputIdade.error = "Preencha a idade por favor"
            return false
        }
        else{
            inputIdade.error = null
        }
        return true
    }

}
