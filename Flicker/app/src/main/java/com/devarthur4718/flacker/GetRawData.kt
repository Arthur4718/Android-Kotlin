package com.devarthur4718.flacker

import android.os.AsyncTask
import android.util.Log
import java.io.IOException
import java.lang.Exception
import java.net.MalformedURLException
import java.net.URL

//* Created by Arthur Gomes at 29/03/19 20:53 - contact me at devarthur4718@gmail.com.br


//Holds all the possible states for the download
enum class DownloadStatus{
    OK,
    IDLE,
    NOT_INITIALIZED,
    FAILED_OR_EMPTY,
    PERMISSIONS_ERROR,
    ERROR
}
class GetRawData: AsyncTask<String, Void, String>() {


    private val TAG = "GetRawData"
    private var downloadStatus = DownloadStatus.IDLE


    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
    }

    override fun doInBackground(vararg params: String?): String {

        if(params[0] == null){
            downloadStatus = DownloadStatus.NOT_INITIALIZED
            return "No URL specified"
        }

        try {
            downloadStatus = DownloadStatus.OK
            return URL(params[0]).readText()

        } catch (e : Exception){
            val errorMessage = when (e){
                is MalformedURLException ->{

                    downloadStatus = DownloadStatus.NOT_INITIALIZED
                    "doInBackGround: Invalid Url ${e.message}"
                }
                is IOException -> {
                    downloadStatus = DownloadStatus.FAILED_OR_EMPTY
                    "doInBackGround: Invalid Url ${e.message}"

                }
                is SecurityException -> {
                    downloadStatus = DownloadStatus.PERMISSIONS_ERROR
                    "doInBackGround: Invalid Url ${e.message}"

                }
                else -> {
                    downloadStatus = DownloadStatus.ERROR
                    "Unknow error : ${e.message}"

                }
            }
            Log.e(TAG, errorMessage)

            return errorMessage
        }
    }


}