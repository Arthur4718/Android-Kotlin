package madcode01.com.br.intents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrirCâmera.setOnClickListener {
            //Chama a função que contem os passos pra lidar com a c
            abrirCamera()
        }


        btnAbrirContatos.setOnClickListener {
            //Estes métodos estão comentados pois não utilizaremos eles neste momento.
            //selecionarContato()
        }

        btnAbrirNovaTela.setOnClickListener{
            //abrirNovaTela()
        }

    }

    val REQUEST_IMAGE_CAPTURE = 2

     fun abrirCamera() {

        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {

            Toast.makeText(applicationContext, "Photo Taken", Toast.LENGTH_SHORT).show()
        }


    }
}









