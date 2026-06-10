package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declarations
    private lateinit var txtTitle: TextView
    private lateinit var text2: TextView
    private lateinit var btnProceed: Button

    companion object {
        val comments: String
            get() {
                TODO()
            }
        val quantities: String
            get() {
                TODO()
            }
        val categories: String
            get() {
                TODO()
            }
        val itemNames: String
            get() {
                TODO()
            }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //typecasting
        btnProceed = findViewById(R.id.btnProceed)

        //buttonclick listener
        btnProceed.setOnClickListener {
            btnProceed.setOnClickListener {
                val intent = Intent(this, mainscreen::class.java)
                startActivity(intent)
                finish()
            }







            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}



