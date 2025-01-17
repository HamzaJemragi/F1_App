package com.hamza.f1app.activities

import android.content.pm.ActivityInfo
import android.os.Bundle
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
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.data.races
import com.hamza.f1app.fragments.UpcomingRaceCircuitFragment
import com.hamza.f1app.fragments.UpcomingRaceScheduleFragment

class UpcomingRaceInfosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.upcoming_race_infos_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.racingInfos)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val raceId = intent?.extras?.getInt("raceId")!!.toInt()

        val racingTextView = findViewById<TextView>(R.id.racingTextView)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager)

        val upcomingRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats == null) {
                upcomingRaces.add(races[i])
            }
        }
        racingTextView.text = upcomingRaces[raceId].lieu

        val adapter = ViewPagerRaceAdapter(this, raceId)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.Schedule)
                1 -> getString(R.string.Circuit)
                else -> null
            }
        }.attach()
    }
    class ViewPagerRaceAdapter(activity: AppCompatActivity, val raceId: Int) :
        FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 2
        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> UpcomingRaceScheduleFragment(raceId)
            1 -> UpcomingRaceCircuitFragment(raceId)
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

    }
}