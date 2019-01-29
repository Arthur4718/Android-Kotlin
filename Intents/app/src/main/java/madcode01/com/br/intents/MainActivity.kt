package madcode01.com.br.intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val REQUEST_SELECT_CONTACT = 1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrirCâmera.setOnClickListener {
            abrirCamera()
        }

        btnAbrirContatos.setOnClickListener {
            selectContact()
        }

        btnAbrirNovaTela.setOnClickListener{
            abrirNovaTela()
        }

    }

    fun selectContact() {
        val intent = Intent(Intent.ACTION_PICK).apply {
            type = ContactsContract.Contacts.CONTENT_TYPE
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivityForResult(intent, REQUEST_SELECT_CONTACT)
        }
    }

    val REQUEST_IMAGE_CAPTURE = 1

     fun abrirCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }

    fun abrirNovaTela(){
        val intentNovaTela = Intent(this, Tela2::class.java)
        startActivity(intentNovaTela)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_SELECT_CONTACT && resultCode == RESULT_OK) {
            val contactUri: Uri = data!!.data
            Toast.makeText(applicationContext, "Selected: $contactUri", Toast.LENGTH_SHORT).show()
        }
    }
}









