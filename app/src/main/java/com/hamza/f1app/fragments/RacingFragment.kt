package com.hamza.f1app.fragments

import android.content.Context

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.hamza.f1app.R

class RacingFragment() : Fragment(R.layout.racing_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager2 = view.findViewById<ViewPager2>(R.id.viewPager)

        val adapter = ViewPagerRacingAdapter(requireActivity() as AppCompatActivity)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.Upcoming)
                1 -> getString(R.string.Past)
                else -> null
            }
        }.attach()
    }
}

class ViewPagerRacingAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> upcoming_racing_fragment()
        1 -> past_racing_fragment()
        else -> throw IllegalArgumentException("Invalid position")
    }
}