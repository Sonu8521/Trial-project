package com.example.trial_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {

    private lateinit var userids: EditText
    private lateinit var passs: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        userids=findViewById(R.id.registerUserid)
        passs=findViewById(R.id.registerUserPassword)

        val registers=findViewById<Button>(R.id.registerBtn)


        val preference = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val editPreference=preference.edit()

        registers.setOnClickListener {
            editPreference.putString("userid", userids.text.toString()).apply()
            editPreference.putString("pass", passs.text.toString()).apply()
            startActivity(Intent(this, MainActivity::class.java))


        }

    }

}