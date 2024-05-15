package com.connectapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.connectapp.location.LocationCaptureActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            startLocation()
        }

        //startLocation()
    }

    fun startLocation(){

        startActivity(Intent(this,LocationCaptureActivity::class.java))
    }

}