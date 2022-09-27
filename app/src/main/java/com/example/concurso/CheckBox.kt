package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, SpinnerZapatos:: class.java)
            startActivity(intent)
        }
    }
}