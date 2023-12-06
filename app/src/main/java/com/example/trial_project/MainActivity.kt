package com.example.trial_project

import android.annotation.SuppressLint
import android.app.AlertDialog
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
    private lateinit var registerUserBtn: Button
    private lateinit var preference: SharedPreferences
    lateinit var backButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        backButton=findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            // Set the message show for the Alert time
            builder.setMessage("Do you want to exit ?")

            // Set Alert Title
            builder.setTitle("Alert !")

            // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
            builder.setCancelable(false)

            // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
            builder.setPositiveButton("Yes") {
                // When the user click yes button then app will close
                    dialog, which -> finish()
            }

            // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
            builder.setNegativeButton("No") {
                // If user click no then dialog box is canceled.
                    dialog, which -> dialog.cancel()
            }

            // Create the Alert dialog
            val alertDialog = builder.create()
            // Show the Alert Dialog box
            alertDialog.show()
        }





        userPassid = findViewById(R.id.userid)
        passwordId = findViewById(R.id.pass)
        registerUserBtn = findViewById(R.id.registerUserBtn)
        loginbtn = findViewById(R.id.loginpagebtn)


        registerUserBtn.setOnClickListener {
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
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                // Login failed
                Toast.makeText(this, "Login failed.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
