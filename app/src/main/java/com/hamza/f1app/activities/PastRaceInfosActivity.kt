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
import com.hamza.f1app.data.races2021
import com.hamza.f1app.fragments.PastRaceCircuitFragment
import com.hamza.f1app.fragments.PastRaceScheduleFragment

class PastRaceInfosActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.past_race_infos_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.racingInfos)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val raceId = intent?.extras?.getInt("raceId")!!.toInt()
        val season = intent?.extras?.getString("season")!!

        val racingTextView = findViewById<TextView>(R.id.pastRacingTextView)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager)

        if (season == "2024") {
            val pastRaces = mutableListOf<Race>()
            for (i in (0..<races.size)) {
                if (races[i].resultats != null) {
                    pastRaces.add(races[i])
                }
            }

            racingTextView.text = pastRaces[raceId].lieu
        } else if (season == "2021") {
            val pastRaces = mutableListOf<Race>()
            for (i in (0..<races2021.size)) {
                if (races2021[i].resultats != null) {
                    pastRaces.add(races2021[i])
                }
            }

            racingTextView.text = pastRaces[raceId].lieu
        } else {
            val pastRaces = mutableListOf<Race>()
        }

        val adapter = ViewPagerRaceAdapter(this, raceId, season)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.Schedule)
                1 -> getString(R.string.Circuit)
                else -> null
            }
        }.attach()
    }
    class ViewPagerRaceAdapter(activity: AppCompatActivity, val raceId: Int, val season: String) :
        FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 2
        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> PastRaceScheduleFragment(raceId, season)
            1 -> PastRaceCircuitFragment(raceId, season)
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}