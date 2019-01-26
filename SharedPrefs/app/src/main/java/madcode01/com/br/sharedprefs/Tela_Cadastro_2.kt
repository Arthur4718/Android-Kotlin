package madcode01.com.br.sharedprefs

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela__cadastro_2.*


class Tela_Cadastro_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__cadastro_2)

        btnConcluirForm2.setOnClickListener {
            salvarDados()

        }
    }

    private fun salvarDados(){

        if(!validarTelefone()){
            return
        }
        if(!validarCEP()){
            return
        }
        if(!validarBairro()){
            return
        }

        //Abrir a tela seguinte

        val shareprefs = getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)
        val editor = shareprefs.edit()

        editor.putString("telefone", edtTelefone.text.toString())
        editor.putString("CEP", edtCep.text.toString())
        editor.putString("bairro", edtCep.text.toString())
        editor.putBoolean("usuarioLogado", true)
        editor.commit()


        val intentTelaUsuario = Intent(this, Tela_UsuarioLogado::class.java)
        startActivity(intentTelaUsuario)
    }

    private fun validarTelefone(): Boolean {
        
        if(edtTelefone.text.isEmpty()){
            inputLayoutTelefone.error = "Por favor preencha o telefone"
            return false

        }
        else{
            inputLayoutTelefone.error = null
        }
        return true
    }

    private fun validarCEP(): Boolean {

        if(edtCep.text.isEmpty()){
            inputCep.error = "Por favor preencha o CEP"
            return false

        }
        else{
            inputCep.error = null
        }
        return true

    }

    private fun validarBairro(): Boolean {

        if(edtBairro.text.isEmpty()){
            inputBairro.error = "Por favor preencha o Bairro"
            return false

        }
        else{
            inputBairro.error = null
        }
        return true
    }

}
