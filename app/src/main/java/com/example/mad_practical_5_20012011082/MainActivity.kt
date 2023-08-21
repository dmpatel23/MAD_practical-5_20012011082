package com.example.mad_practical_5_20012011082

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browsebtn=findViewById<Button>(R.id.browse)
        val edittxt=findViewById<EditText>(R.id.editTextText)
        val callbtn=findViewById<Button>(R.id.button2)
        val edtxt=findViewById<EditText>(R.id.editTextText2)
        val calllogbtn=findViewById<Button>(R.id.button3)
        val gallerybtn=findViewById<Button>(R.id.button4)
        val camerabtn=findViewById<Button>(R.id.button5)
        val alarmbtn=findViewById<Button>(R.id.button6)

        alarmbtn.setOnClickListener {
            alarm()
        }

        camerabtn.setOnClickListener {
            camera()
        }

        gallerybtn.setOnClickListener {
            gallery()
        }

        calllogbtn.setOnClickListener {
            calllog()
        }

        callbtn.setOnClickListener {
            call(edtxt.text.toString())
        }

        browsebtn.setOnClickListener {
            openurl(edittxt.text.toString())
        }
    }

    fun openurl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }

    fun call(no:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$no")).also{
            startActivity(it)
        }
    }

    fun calllog(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {
            startActivity(it)
        }
    }
    fun gallery(){
        Intent(Intent.ACTION_VIEW).setType("Image/*").also{
            startActivity(it)
        }
    }

    fun camera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
            startActivity(it)
        }
    }

    fun alarm(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
            startActivity(it)
        }
    }

}