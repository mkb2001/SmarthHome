package com.mkbservices.coursework

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val notificationBtn = findViewById<ImageView>(R.id.imageView2)
        notificationBtn.setOnClickListener {
            val textView1 = findViewById<TextView>(R.id.textView1)
            val textView = findViewById<TextView>(R.id.textView)
            val imageView = findViewById<ImageView>(R.id.imageView2)
            textView1.visibility = View.VISIBLE
            imageView.visibility = View.GONE
            textView.visibility = View.GONE
        }

    }
    val mainActivity3 = MainActivity3()
    fun showInputDialog(view: View?) {
        val intent = Intent(this, mainActivity3::class.java)
        intent.putExtra("showInputDialog", true)
        startActivity(intent)
    }

}
