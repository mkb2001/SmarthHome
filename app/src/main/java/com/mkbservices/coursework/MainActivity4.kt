package com.mkbservices.coursework

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
   }
    val mainActivity3 = MainActivity3()
    fun showTimePicker(view: View?) {
        val intent = Intent(this, mainActivity3::class.java)
        intent.putExtra("showTimePicker", true)
        startActivity(intent)
    }
}