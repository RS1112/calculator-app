package com.example.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById(R.id.ed1) as EditText;
        val num2 = findViewById(R.id.ed2) as EditText;
        val total = findViewById(R.id.ed3) as EditText;
        val b1 = findViewById(R.id.clrbtn) as Button;
        val badd = findViewById(R.id.adbtn) as Button;
        val bsub = findViewById(R.id.subbtn) as Button;
        val bmul = findViewById(R.id.multbtn) as Button;
        val bdiv = findViewById(R.id.divbtn) as Button;

        b1.setOnClickListener(){
            num1.setText("");
            num2.setText("");
            total.setText("");
        }
        badd.setOnClickListener(){
            val n1=num1.text.toString().toInt();
            val n2=num2.text.toString().toInt();
            val result = n1 + n2;
            total.setText(result.toString());
        }
        bsub.setOnClickListener(){
            val n1=num1.text.toString().toInt();
            val n2=num2.text.toString().toInt();
            val result = n1 - n2;
            total.setText(result.toString());
        }
        bmul.setOnClickListener(){
            val n1=num1.text.toString().toInt();
            val n2=num2.text.toString().toInt();
            val result = n1 * n2;
            total.setText(result.toString());
        }
        bdiv.setOnClickListener(){
            val n1=num1.text.toString().toInt();
            val n2=num2.text.toString().toInt();
            val result = n1 / n2;
            total.setText(result.toString());
        }
    }
}