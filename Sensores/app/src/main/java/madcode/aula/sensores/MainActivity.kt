package madcode.aula.sensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SensorEventListener {

    private lateinit var mSensorManager: SensorManager
    private var mGravity: Sensor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listAllSenros()

    }

    private fun listAllSenros() {
        //Get a reference for the sensors available
        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        //Listing all sensors
        val deviceSensors: List<Sensor> = mSensorManager.getSensorList(Sensor.TYPE_ALL)
        //Show all sensors in logcat
        Log.d("main", deviceSensors.toString())

        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            Log.d("main", "Accel Active")
        } else {
            Log.d("main", "Not Active")
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {


    }

    override fun onResume() {
        super.onResume()
        mGravity?.also { light ->
            mSensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        mSensorManager.unregisterListener(this)
    }


}
