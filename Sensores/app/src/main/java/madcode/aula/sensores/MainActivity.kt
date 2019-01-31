package madcode.aula.sensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorManager
import android.hardware.SensorEventListener
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , SensorEventListener{

    var accelGravity = arrayOf(0.0f,0.0f,0.0f)
    var accelLin = arrayOf(0.0f,0.0f,0.0f)

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        
        when (event?.sensor?.type) {
            Sensor.TYPE_ACCELEROMETER -> {
                val alpha = 0.8f

                accelGravity[0] = alpha * accelGravity[0] + (1 - alpha) * event.values[0]
                accelGravity[1] = alpha * accelGravity[1] + (1 - alpha) * event.values[1]
                accelGravity[2] = alpha * accelGravity[2] + (1 - alpha) * event.values[2]
                accelLin[0] = event.values[0] - accelGravity[0]
                accelLin[1] = event.values[1] - accelGravity[1]
                accelLin[2] = event.values[2] - accelGravity[2]
                tvValorX.text = accelLin[0].toString()
                tvValorY.text = accelLin[1].toString()
                tvValorZ.text = accelLin[2].toString()
            }
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager



        sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)?.let {
            var accelerometer = it
        }

        sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY)?.let {
            var  gravity = it
        }

        sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)?.let {
            var gyroscope = it
        }

        sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION)?.let {
            var linearAcceleration = it
        }

        sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)?.let {
            var rotationVector = it
        }




    }





}
