package com.hamza.f1app.activities

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors
import com.hamza.f1app.data.drivers

class ConstructorinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constructorinfo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.constructorInfoActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.darkGray)
        val constructorPosition = intent?.extras?.getInt("constructorPosition")!!.toInt()
//        val constructorPosition =0

        val line = findViewById<View>(R.id.line)
        val constructorName = findViewById<TextView>(R.id.constructorName)
        val constructorCountry = findViewById<TextView>(R.id.constructorCountry)
        val constructorsLogo = findViewById<ImageView>(R.id.constructorsLogo)

        val standingInfo = findViewById<View>(R.id.standingInfo)
        val frame = standingInfo.findViewById<FrameLayout>(R.id.frame)
        val layerDrawable = frame.background as LayerDrawable
        val borderDrawable = layerDrawable.getDrawable(0) as GradientDrawable
        val standingNumber = standingInfo.findViewById<TextView>(R.id.standingNumber)
        val totalPts = standingInfo.findViewById<TextView>(R.id.totalPts)

        val firstYear = findViewById<View>(R.id.firstYear)
        val firstYearTitle = firstYear.findViewById<TextView>(R.id.infoTitle)
        val firstYearInfo = firstYear.findViewById<TextView>(R.id.info)

        val highestFinish = findViewById<View>(R.id.highestFinish)
        val highestFinishTitle = highestFinish.findViewById<TextView>(R.id.infoTitle)
        val highestFinishInfo = highestFinish.findViewById<TextView>(R.id.info)

        val constructorChampionships = findViewById<View>(R.id.constructorChampionships)
        val constructorChampionshipsTitle =
            constructorChampionships.findViewById<TextView>(R.id.infoTitle)
        val constructorChampionshipsInfo =
            constructorChampionships.findViewById<TextView>(R.id.info)

        val polePositions = findViewById<View>(R.id.polePositions)
        val polePositionsTitle = polePositions.findViewById<TextView>(R.id.infoTitle)
        val polePositionsInfo = polePositions.findViewById<TextView>(R.id.info)

        val powerUnit = findViewById<View>(R.id.powerUnit)
        val powerUnitTitle = powerUnit.findViewById<TextView>(R.id.infoTitle)
        val powerUnitInfo = powerUnit.findViewById<TextView>(R.id.info)

        val teamChief = findViewById<View>(R.id.teamChief)
        val teamChiefTitle = teamChief.findViewById<TextView>(R.id.infoTitle)
        val teamChiefInfo = teamChief.findViewById<TextView>(R.id.info)

        val driver1 = findViewById<ConstraintLayout>(R.id.driver1)
        val driverImage1 = findViewById<ImageView>(R.id.driverImage1)
        val drivername1 = findViewById<TextView>(R.id.drivername1)

        val driver2 = findViewById<ConstraintLayout>(R.id.driver2)
        val driverImage2 = findViewById<ImageView>(R.id.driverImage2)
        val drivername2 = findViewById<TextView>(R.id.drivername2)

        val chassis= findViewById<View>(R.id.chassis)
        val chassisTitle = chassis.findViewById<TextView>(R.id.infoTitle)
        val chassisInfo = chassis.findViewById<TextView>(R.id.info)

        line.setBackgroundColor(getColor(constructors[constructorPosition].construcorColor))
        constructorName.text = constructors[constructorPosition].nom
        constructorCountry.text = constructors[constructorPosition].nationalite
        constructorsLogo.setImageResource(constructors[constructorPosition].logo)

        borderDrawable.setStroke(25, constructors[constructorPosition].construcorColor)
        totalPts.text =
            constructors[constructorPosition].pilotes.sumOf { it.seasonPoint }.toString()
        val orderdConstructors =
            constructors.sortedByDescending { it.pilotes.sumOf { it.seasonPoint } }
        standingNumber.text =
            (orderdConstructors.indexOf(constructors[constructorPosition]) + 1).toString()

        firstYearTitle.text = getString(R.string.first_team_entry)
        firstYearInfo.text = constructors[constructorPosition].firstEntry.toString()

        highestFinishTitle.text = getString(R.string.highestFinish)
        highestFinishInfo.text = constructors[constructorPosition].highestFinish

        constructorChampionshipsTitle.text = getString(R.string.constructorChampionships)
        constructorChampionshipsInfo.text =
            constructors[constructorPosition].constructorChampionships.toString()

        polePositionsTitle.text = getString(R.string.polePositions)
        polePositionsInfo.text = constructors[constructorPosition].polePositions.toString()

        powerUnitTitle.text = getString(R.string.powerUnit)
        powerUnitInfo.text = constructors[constructorPosition].powerUnit

        teamChiefTitle.text = getString(R.string.teamChief)
        teamChiefInfo.text = constructors[constructorPosition].teamChief

        driverImage1.setImageResource(constructors[constructorPosition].pilotes[0].driverImage2)
        drivername1.text = constructors[constructorPosition].pilotes[0].lastName

        driverImage2.setImageResource(constructors[constructorPosition].pilotes[1].driverImage2)
        drivername2.text = constructors[constructorPosition].pilotes[1].lastName

        chassisTitle.text=getString(R.string.chassis)
        chassisInfo.text=constructors[constructorPosition].chassis


        driver1.setOnClickListener {
            val intent = Intent(this, DriverinfoActivity::class.java)
            intent.putExtra(
                "driverPosition",
                drivers.indexOf(constructors[constructorPosition].pilotes[0])
            )
            startActivity(intent)
        }

        driver2.setOnClickListener {
            val intent = Intent(this, DriverinfoActivity::class.java)
            intent.putExtra(
                "driverPosition",
                drivers.indexOf(constructors[constructorPosition].pilotes[1])
            )
            startActivity(intent)
        }
    }

}
