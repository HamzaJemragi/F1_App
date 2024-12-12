package com.hamza.f1app.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.hamza.f1app.R
import com.hamza.f1app.fragments.DriverBioFragment
import com.hamza.f1app.fragments.DriverStatsFragment


class DriverinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_driverinfo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.driverInfoActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val driverPosition = intent?.extras?.getInt("driverPosition")!!.toInt()
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val adapter = ViewPagerDriverAdapter(this, driverPosition)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.Stats)
                1 -> getString(R.string.Bio)
                else -> null
            }
        }.attach()
    }
    class ViewPagerDriverAdapter(activity: AppCompatActivity, val driverPosition: Int) :
        FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 2
        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> DriverStatsFragment(driverPosition)
            1 -> DriverBioFragment(driverPosition)
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}