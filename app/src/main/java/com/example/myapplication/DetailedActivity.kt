package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity :  AppCompatActivity(){

//declarations
        private lateinit var txtDetails: TextView
        private lateinit var btnBack: Button

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_detailed)

            txtDetails = findViewById(R.id.txtDetails)
            btnBack = findViewById(R.id.btnback)

            var display = ""

            for (i in MainActivity.itemNames.indices) {
                display += "Item: ${MainActivity.itemNames[i]}\n" +
                        "Category: ${MainActivity.categories[i]}\n" +
                        "Quantity: ${MainActivity.quantities[i]}\n" +
                        "Comments: ${MainActivity.comments[i]}\n\n"
            }

            txtDetails.text = display

            btnBack.setOnClickListener {
                finish()
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }

