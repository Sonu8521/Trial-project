package com.example.trial_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace)

        Handler().postDelayed({
            val x = Intent(this,MainActivity ::class.java)
            startActivity(x)
            finish()
        },2000)




    }
}