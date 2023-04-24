package com.mkbservices.coursework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val mainActivity3 = MainActivity3()
        val fab = findViewById<FloatingActionButton>(R.id.my_fab)
        fab.setOnClickListener {
            val intent = Intent(this, mainActivity3::class.java)
            startActivity(intent)
        }
           }

}