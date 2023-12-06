package com.example.trial_project

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ProfileFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rowView = inflater.inflate(R.layout.fragment_profile_, container, false)


        val profileName=rowView.findViewById<TextView>(R.id.Name)
        val profilePass=rowView.findViewById<TextView>(R.id.age)
     //  val profilefather=rowView.findViewById<TextView>(R.id.registerUserfather)

        val context = requireActivity()
        val showPreferences = context.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)

        val usernameText = showPreferences.getString("userid", "")
        val passwordText = showPreferences.getString("pass", "")
      //  val userfatherTextView=showPreferences.getString("userfather","")


        profileName.text = usernameText
        profilePass.text = passwordText
      //  profilefather.text = userfatherTextView


        return rowView
    }


}
