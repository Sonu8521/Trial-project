package com.example.trial_project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Buttom_Navi : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttom_navi)

        val frameLayout = findViewById<BottomNavigationView>(R.id.bottom_nav)
        LoadFragment(HomeFragment())
        frameLayout.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->LoadFragment(HomeFragment(

                ))
                R.id.gallery->LoadFragment(Image_Fragment<Any>())
                R.id.profile->LoadFragment(Profile_Fragment())

            }
            true
        }


    }
    private fun LoadFragment(homeFragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame,homeFragment).commit()
    }
}