package com.gaurav.kotlinpractice

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class StateAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    companion object {
        private const val TAB_COUNT = 2
    }
    override fun getItemCount(): Int {
        return  TAB_COUNT
    }

    override fun createFragment(position: Int): Fragment {
      return  when(position)
      {
          0->BlankFragment.newInstance("","")
          1->BlankFragment2.newInstance("","")
          else ->BlankFragment.newInstance("","")

      }
    }
}