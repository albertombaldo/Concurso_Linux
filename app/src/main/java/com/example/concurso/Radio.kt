package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Radio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)
        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, CheckBox:: class.java)
            startActivity(intent)
        }
    }
}