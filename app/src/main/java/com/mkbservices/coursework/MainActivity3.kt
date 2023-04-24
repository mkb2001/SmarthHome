package com.mkbservices.coursework

import android.app.AlertDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val mainActivity4 = MainActivity4()
        val fab = findViewById<FloatingActionButton>(R.id.my_fab)
        fab.setOnClickListener {
            val intent = Intent(this, mainActivity4::class.java)
            startActivity(intent)
        }
        val showTimePicker = intent.getBooleanExtra("showTimePicker", false)

        if (showTimePicker) {
            showTimePickerDialog()
        }
        val showInputDialog = intent.getBooleanExtra("showInputDialog", false)

        if (showInputDialog) {
            showInputDialog()
        }
        val mainActivity5 = MainActivity5()
        val fab1 = findViewById<FloatingActionButton>(R.id.my_fab1)
        fab1.setOnClickListener {
            val intent = Intent(this, mainActivity5::class.java)
            startActivity(intent)
        }
    }
    private fun showInputDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Enter Text")

        // Set up the input field
        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

        // Set up the OK button
        builder.setPositiveButton("OK") { _, _ ->
            val text = input.text.toString()
            // Do something with the text, such as displaying it in a TextView
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = text
        }

        // Set up the Cancel button
        builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }

        // Show the dialog
        builder.show()
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(this,
            { _, hourOfDay, minute ->
                val timeTextView = findViewById<TextView>(R.id.textView4)
                val relative = findViewById<RelativeLayout>(R.id.relative)
                val timeTextView1 = findViewById<TextView>(R.id.textView2)
                val timeIcon= findViewById<ImageView>(R.id.timeIcon)
                timeTextView1.text = String.format(" The Time is %02d:%02d PM", hourOfDay, minute)
//                timeTextView.gravity = Gravity.CENTER

                // Show the icon
                timeIcon.visibility = View.VISIBLE
                timeTextView.visibility = View.GONE
                relative.visibility = View.VISIBLE
            }, 0, 0, false
        )
        timePickerDialog.show()
    }
}