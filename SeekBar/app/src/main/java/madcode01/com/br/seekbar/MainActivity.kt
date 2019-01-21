package madcode01.com.br.seekbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val LOGTAG : String = "Seekbar"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Fazendo a ligação entre o código e o nosso layout.
        val seekbarPeso : SeekBar = findViewById<SeekBar>(R.id.seekBarPeso)
        val seekbarAltura : SeekBar = findViewById<SeekBar>(R.id.seekBarAltura)
        val tvAltura : TextView = findViewById<TextView>(R.id.tvShowAltura)
        val tvPeso : TextView = findViewById<TextView>(R.id.tvShowPeso)
        val btnReset : Button = findViewById<Button>(R.id.btnReset)

        //Aplicando o valor inicial nos textviews
        tvAltura.setText("Altura: 1.00", TextView.BufferType.NORMAL)
        tvPeso.setText("Peso: 40.0", TextView.BufferType.NORMAL)

        //Quando o usuário mover as seekbars, tomaremos a ação de escrever os valores nos textvies.
        seekbarPeso.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var pesoConvertido : Double = progress / 100.0
                tvPeso.setText("Peso: $pesoConvertido")

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Log.d(LOGTAG, "Start Tracking..")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Log.d(LOGTAG, "Stop Tracking..")

            }
        })
        seekbarAltura.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var alturaConvertida : Double = progress / 10.0
                tvAltura.setText("Altura: $alturaConvertida")

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Log.d(LOGTAG, "Start Tracking..")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Log.d(LOGTAG, "Stop Tracking..")

            }
        })

        btnReset.setOnClickListener{
            Log.d(LOGTAG, "Reseting values...")
            //Voltando aos valores iniciais...
            seekbarAltura.setProgress(1000, false)
            seekbarPeso.setProgress(400, false)
        }


    }
}


