package madcode01.com.br.kotlin_extensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = arrayOf("Brazil","Venezuela","Suriname","Guiana","Uruguai")
        spnCountry.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countryList)


        spnCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText( applicationContext ,"Nothing was selected", Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText( applicationContext ,"Item Selected!", Toast.LENGTH_SHORT).show()
            }

        }


    }


}
