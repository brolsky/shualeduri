package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click = findViewById<Button>(R.id.rame)
        click.setOnClickListener {
            Toast.makeText(this,"შენახულია",Toast.LENGTH_LONG).show()
        }
    }
}