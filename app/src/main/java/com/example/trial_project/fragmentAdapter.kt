package com.example.trial_project

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class fragmentAdapter(fa:FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
    return when(position){
        0->chatsFragment()
        1->statusFragment()
        else-> chatsFragment()
    }   }
}