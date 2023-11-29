package com.example.trial_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_, container, false)
//
//        val buttomNavigation=findViewById<BottomNavigationView>(R.id.button_nevigation)
//
//        loadFragment(people_Fragment())
//
//        buttomNavigation.setOnItemSelectedListener{
//
//            when(it.itemId)
//            {
//                R.id.user_home->loadFragment(Home_Fragment())
//                R.id.user_people->loadFragment(people_Fragment())
//                R.id.user_setting->loadFragment(Setting_Fragment())
//            }
//            true
//        }
//    }
//
//    private fun loadFragment(fragment:Fragment) {
//        supportFragmentManager.beginTransaction().replace(R.id.framelayout,Mainfragment).commit()

    }
}
