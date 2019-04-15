package livroandroid.com.br.activity
import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

//* Created by Arthur Gomes at 14/04/19 23:39 - contact me at devarthur4718@gmail.com.br
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(){

    //Retorna o contexto para qualquer activiti filha da Base Activity
    protected val context: Context get() = this

    //Métodos que serão herdados pelas activities devem ser declarados aqui.
}