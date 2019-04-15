package livroandroid.com.br
import android.app.Application
import android.util.Log
import java.lang.IllegalStateException

//* Created by Arthur Gomes at 14/04/19 23:57 - contact me at devarthur4718@gmail.com.br
class CarrosApplication : Application() {
    private val TAG = "mApplication"
    //Metodo chamado com o sitema carrega o app.

    override fun onCreate() {
        super.onCreate()
        appInstance = this

    }



    companion object {
        //Singleton da classe application
        private var appInstance: CarrosApplication? = null
        fun getInstance(): CarrosApplication{

            if(appInstance == null){
                throw  IllegalStateException("configure a application no manifesto")
            }
            return appInstance!!
        }


    }

    //Chamado quando o app é encerrado.
    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "Application terminated")
    }


}