package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainscreen : AppCompatActivity() {

    //declarations
    private lateinit var txtTitle: TextView
    private lateinit var edtItem:  EditText
    private lateinit var edtCategory:  EditText
    private lateinit var edtQuantity: EditText
    private lateinit var edtComment: EditText
    private lateinit var btnAdd:Button
    private lateinit var btnView: Button
    private lateinit var tvResult: TextView

   companion object{
       //stores the item names
       val itemNames = ArrayList<String>()
       //stores the item categories
       val categories= ArrayList<String>()
       //stores the quantity of each item
       val quantities = ArrayList<Int>()
       //stores the comments or notes
       val comments = ArrayList<String>()
   }




























    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //typecasting
        btnAdd=findViewById(R.id.btnAdd)
        btnView=findViewById(R.id.btnView)
        tvResult = findViewById(R.id.tvResults)
        edtItem=findViewById(R.id.edtItem)
        edtCategory =findViewById(R.id.edtCategory)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtComment = findViewById(R.id.edtComment)

          // the button click listener  for the  buttons
        btnAdd.setOnClickListener {
            if (
                edtItem.text.isEmpty()||
                edtCategory.text.isEmpty() ||
                edtComment.text.isEmpty()||
                edtQuantity.text.isEmpty()
                ){
                Toast.makeText(
                    this,"Gear Added",Toast.LENGTH_SHORT
                ).show()
                var totalItems =0

                for (item in quantities){
                    totalItems+= item
                }
                tvResult.text = "Total items packed :$totalItems"
                edtItem.text.clear()
                edtComment.text.clear()
                edtQuantity.text.clear()
                edtCategory.text.clear()

            }
        }
        btnView.setOnClickListener {
            val intent = Intent(this, DetailedActivity::class.java)
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





























