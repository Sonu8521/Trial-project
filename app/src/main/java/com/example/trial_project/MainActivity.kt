package com.example.trial_project

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var userPassid: EditText
    private lateinit var passwordId: EditText
    private lateinit var loginbtn: Button
    private lateinit var registerUser: Button
    private lateinit var preference: SharedPreferences

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userPassid = findViewById(R.id.userid)
        passwordId = findViewById(R.id.pass)
        registerUser = findViewById(R.id.registerBtn)
        loginbtn = findViewById(R.id.loginpagebtn)


        registerUser.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
        preference = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val data1 = preference.getString("userid", "")
        val data2 = preference.getString("pass", "")


        loginbtn.setOnClickListener {
            val enteredUserId = userPassid.text.toString()
            val enteredPass = passwordId.text.toString()

            if (enteredUserId == data1 && enteredPass == data2) {
                // Successful login, navigate to another activity
                startActivity(Intent(this, Buttom_Navi::class.java))
            } else {
                // Login failed
                Toast.makeText(this, "Login failed.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
