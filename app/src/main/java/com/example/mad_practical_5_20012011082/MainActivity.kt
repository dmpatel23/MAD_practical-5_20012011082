package com.example.mad_practical_5_20012011082

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browsebtn=findViewById<Button>(R.id.browse)
        val edittxt=findViewById<EditText>(R.id.editTextText)

        browsebtn.setOnClickListener {
            openurl(edittxt.text.toString())
        }
    }

    fun openurl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }

    fun call(number:String){

    }

    fun calllog(){

    }
    fun gallery(){

    }

    fun camera(){

    }

    fun alarm(){

    }

}