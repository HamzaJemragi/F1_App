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


class StandingFragment() : Fragment(R.layout.fragment_standing) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)

        val adapter = ViewPagerStandingAdapter(requireActivity() as AppCompatActivity)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.Drivers)
                1 -> getString(R.string.Constructors)
                else -> null
            }
        }.attach()
    }

    class ViewPagerStandingAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 2
        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> DriversStandingFragment()
            1 -> ConstructorStandingFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}