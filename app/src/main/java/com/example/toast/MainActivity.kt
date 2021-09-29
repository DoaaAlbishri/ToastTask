package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edname: EditText
    lateinit var edloc: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edname = findViewById(R.id.editTextTextPersonName)
        edloc = findViewById(R.id.editTextTextPersonName2)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
        val name = edname.text.toString()
        val loc = edloc.text.toString()
            Toast.makeText(applicationContext, "$name\n$loc", Toast.LENGTH_LONG)
            .show()
        }

    }


}