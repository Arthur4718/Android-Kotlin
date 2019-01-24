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

        //setting up the array of text for the spinner
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.Moedas,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            // Specify the layout to use when the list of choices appears
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            // Apply the adapter to the spinner
//            spinnerCountry.adapter = adapter
//        }

        //An simple way of doing with an hardcoded array
        val myCurrencies = arrayOf("BRL", "USD", "NAN")

        spinnerCurrency.adapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, myCurrencies)


        spinnerCurrency.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "Item Selected", Toast.LENGTH_SHORT).show()

            }
        }


        val myCountries = arrayOf("Brazil", "Venezuela", "Uruguai")

        spinnerCountry.adapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, myCountries)

        spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "Item Selected", Toast.LENGTH_SHORT).show()

            }
        }




    }
}
