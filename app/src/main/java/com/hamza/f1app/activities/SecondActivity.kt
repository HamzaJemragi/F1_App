package com.hamza.f1app.activities

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.hamza.f1app.R
import com.hamza.f1app.fragments.ConstructorFragment
import com.hamza.f1app.fragments.DriversFragment
import com.hamza.f1app.fragments.LatestFragment
import com.hamza.f1app.fragments.RacingFragment
import com.hamza.f1app.fragments.StandingFragment


class SecondActivity: AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.second_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.secondActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val frameLayout = findViewById<FrameLayout>(R.id.frameLayout)
        val bottomNavigationView = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_nav)

        val homeActivity = LatestFragment()
        val racingFragment = RacingFragment()
        val driversFragment = DriversFragment()
        val constructorsFragment = ConstructorFragment()
        val standingsFragment = StandingFragment()

        makeCurrentFragment(homeActivity)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.latest -> makeCurrentFragment(homeActivity)
                R.id.racing -> makeCurrentFragment(racingFragment)
                R.id.drivers -> makeCurrentFragment(driversFragment)
                R.id.constructors -> makeCurrentFragment(constructorsFragment)
                R.id.standings -> makeCurrentFragment(standingsFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }


    override fun finish() {
        val titleView = TextView(this).apply {
            text = getString(R.string.dialogAlert)
            setTextColor(Color.BLACK)
            textSize = 20f
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            setPadding(0, 50, 0, 0)
        }


        val builder = AlertDialog.Builder(this)

        builder.setMessage(getString(R.string.dialogExit))


        builder.setCancelable(false)

        builder.setPositiveButton(getString(R.string.dialogYes)) {
                dialog, which -> super.finish()
        }

        builder.setNegativeButton(getString(R.string.dialogNo)) {
                dialog, which -> dialog.cancel()
        }

        builder.setCustomTitle(titleView)


        val alertDialog = builder.create()

        alertDialog.setOnShowListener {
            alertDialog.window?.setBackgroundDrawableResource(android.R.color.white)
            alertDialog.findViewById<TextView>(android.R.id.message)?.setTextColor(Color.BLACK)
        }
        alertDialog.show()
    }
}