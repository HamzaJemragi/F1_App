package com.hamza.f1app.activities

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
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
import com.hamza.f1app.data.constructors
import com.hamza.f1app.data.drivers
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
        window.statusBarColor = ContextCompat.getColor(this, R.color.darkGray)
        val driverPosition = intent?.extras?.getInt("driverPosition")!!.toInt()

        val driverImage = findViewById<ImageView>(R.id.driverImage)
        val driverNumber = findViewById<TextView>(R.id.driverNumber)
        val driverFirsName = findViewById<TextView>(R.id.driverFirsName)
        val driverLastName = findViewById<TextView>(R.id.driverLastName)
        val line = findViewById<View>(R.id.line)

        driverImage.setImageResource(drivers[driverPosition].driverImage1)
        driverNumber.text = "#${drivers[driverPosition].driverNumber}"
        driverFirsName.text = drivers[driverPosition].firsName
        driverLastName.text = drivers[driverPosition].lastName
        line.setBackgroundColor(getColor(constructors.find { it.id == drivers[driverPosition].equipe }?.construcorColor!!))

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

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

    }
}