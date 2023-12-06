package com.example.trial_project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class showdata : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showdata)


        val textView1 = findViewById<TextView>(R.id.text1)
        val textView2 = findViewById<TextView>(R.id.text2)
        //val textView3 = findViewById<TextView>(R.id.text3)

        val showPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val usernameText = showPreferences.getString("user_email","")
        val userageText = showPreferences.getString("user_pwd","")
      //  val userfatherTextView = showPreferences.getString("usrefather","")

        textView1.setText(usernameText)
        textView2.setText(userageText)
      //  textView3.setText(userfatherTextView)


    }
}


