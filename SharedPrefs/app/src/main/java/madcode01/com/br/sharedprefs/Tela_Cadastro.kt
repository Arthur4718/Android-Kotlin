package madcode01.com.br.sharedprefs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela__cadastro.*

class Tela_Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__cadastro)

        btnConcluirForm1.setOnClickListener {

            enviarDados()
        }

    }
    private fun enviarDados(){

        if(!validarNome()){
            return
        }
        if(!validarEmail()){
            return
        }
        if(!validarIdade()){
            return
        }

        
    }

    private fun validarNome(): Boolean {
        //Checar se os dados são validos!
        if(edtNomeCompleto.text.isEmpty()){
            inputLaytouNome.error = "Preencha o nome por favor"
            return false
        }
        else{
            inputLaytouNome.error = null
        }

        return true
    }

    private fun validarEmail(): Boolean{

        if(edtEmail.text.isEmpty()){
            inputLayoutEmail.error = "Preencha o e-mail por favor"
            return false
        }
        else{
            inputLayoutEmail.error = null
        }
        return true
    }
    private fun validarIdade() : Boolean{
        if(edtIdade.text.isEmpty()){
            inputLayoutIdade.error = "Preencha a idade por favor"
            return false
        }
        else{
            inputLayoutIdade.error = null
        }
        return true
    }

}
