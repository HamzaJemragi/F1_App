package com.hamza.f1app.activities

import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors

class ConstructorinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constructorinfo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val constructorPosition = intent?.extras?.getInt("constructorPosition")!!.toInt()

        val line = findViewById<View>(R.id.line)
        val constructorName = findViewById<TextView>(R.id.constructorName)
        val constructorCountry = findViewById<TextView>(R.id.constructorCountry)
        val constructorsLogo = findViewById<ImageView>(R.id.constructorsLogo)

        val standingInfo = findViewById<View>(R.id.standingInfo)
        val frame = standingInfo.findViewById<FrameLayout>(R.id.frame)
        val layerDrawable = frame.background as LayerDrawable
        val borderDrawable = layerDrawable.getDrawable(1) as GradientDrawable
        borderDrawable.setStroke(4, getColor(constructors[constructorPosition].construcorColor))
        val standingNumber = standingInfo.findViewById<TextView>(R.id.standingNumber)
        val totalPts = standingInfo.findViewById<TextView>(R.id.totalPts)

        val firstYear = findViewById<View>(R.id.firstYear)
        val firstYearTitle = firstYear.findViewById<TextView>(R.id.infoTitle)
        val firstYearInfo = firstYear.findViewById<TextView>(R.id.info)

        val chassis = findViewById<View>(R.id.chassis)
        val chassisTitle = chassis.findViewById<TextView>(R.id.infoTitle)
        val chassisrInfo = chassis.findViewById<TextView>(R.id.info)

        val powerUnit = findViewById<View>(R.id.powerUnit)
        val powerUnitTitle = powerUnit.findViewById<TextView>(R.id.infoTitle)
        val powerUnitInfo = powerUnit.findViewById<TextView>(R.id.info)

        val teamChief = findViewById<View>(R.id.teamChief)
        val teamChiefTitle = teamChief.findViewById<TextView>(R.id.infoTitle)
        val teamChiefInfo = teamChief.findViewById<TextView>(R.id.info)

        val driverImage1 = findViewById<ImageView>(R.id.driverImage1)
        val drivername1 = findViewById<TextView>(R.id.drivername1)

        val driverImage2 = findViewById<ImageView>(R.id.driverImage2)
        val drivername2 = findViewById<TextView>(R.id.drivername2)


        line.setBackgroundColor(getColor(constructors[constructorPosition].construcorColor))
        constructorName.text = constructors[constructorPosition].nom
        constructorCountry.text = constructors[constructorPosition].nationalite
        constructorsLogo.setImageResource(constructors[constructorPosition].logo)
        totalPts.text = constructors[constructorPosition].pilotes.sumOf { it.points }.toString()
        val orderdConstructors = constructors.sortedByDescending { it.pilotes.sumOf { it.points } }
        standingNumber.text = (orderdConstructors.indexOf(constructors[constructorPosition]) + 1).toString()

        firstYearTitle.text = R.string.first_team_entry.toString()
        firstYearInfo.text = constructors[constructorPosition].firstEntry.toString()

        chassisTitle.text = R.string.chassis.toString()
        chassisrInfo.text = constructors[constructorPosition].chassis

        powerUnitTitle.text = R.string.powerUnit.toString()
        powerUnitInfo.text = constructors[constructorPosition].powerUnit

        teamChiefTitle.text = R.string.teamChief.toString()
        teamChiefInfo.text = constructors[constructorPosition].teamChief

        driverImage1.setImageResource(constructors[constructorPosition].pilotes[0].driverImage2)
        drivername1.text = constructors[constructorPosition].pilotes[0].lastName

        driverImage2.setImageResource(constructors[constructorPosition].pilotes[1].driverImage2)
        drivername2.text = constructors[constructorPosition].pilotes[1].lastName
    }

}
