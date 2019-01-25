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
        var editor = sharedPrefs.edit()
        editor.putString("username", edtNomeCompleto.text.toString())
        editor.putString("user-email", edtEmail.text.toString())
        editor.putString("user-idade", edtIdade.text.toString())
        editor.commit()


        val intentForm2 = Intent(this, Tela_Cadastro_2::class.java)
        startActivity(intentForm2)

    }

    private fun validarNome(): Boolean {
        //Checar se os dados são validos!
        if(edtNomeCompleto.text.isEmpty()){
            inputLayoutTelefone.error = "Preencha o nome por favor"
            return false
        }
        else{
            inputLayoutTelefone.error = null
        }

        return true
    }

    private fun validarEmail(): Boolean{

        if(edtEmail.text.isEmpty()){
            inputCep.error = "Preencha o e-mail por favor"
            return false
        }
        else{
            inputCep.error = null
        }
        return true
    }
    private fun validarIdade() : Boolean{
        if(edtIdade.text.isEmpty()){
            inputBairro.error = "Preencha a idade por favor"
            return false
        }
        else{
            inputBairro.error = null
        }
        return true
    }

}
