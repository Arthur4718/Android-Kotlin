package madcode01.com.br.example2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class activity_usuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        //recuperar a msg da intent
        val username = intent.getStringExtra(USERNAME_TAG)


    }
}
