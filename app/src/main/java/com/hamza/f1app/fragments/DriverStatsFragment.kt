package com.hamza.f1app.fragments

import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hamza.f1app.R
import com.hamza.f1app.data.drivers
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.hamza.f1app.data.constructors

class DriverStatsFragment(val driverPosition: Int) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.driver_stats, container, false)

        val standingInfo = view.findViewById<View>(R.id.standingInfo)
        val frame = standingInfo.findViewById<FrameLayout>(R.id.frame)
        val layerDrawable = frame.background as LayerDrawable
        val borderDrawable = layerDrawable.getDrawable(1) as GradientDrawable
        val standingNumber = standingInfo.findViewById<TextView>(R.id.standingNumber)
        val totalPts = standingInfo.findViewById<TextView>(R.id.totalPts)

        val podiums = view.findViewById<View>(R.id.podiums)
        val podiumsTitle = podiums.findViewById<TextView>(R.id.infoTitle)
        val podiumsInfo = podiums.findViewById<TextView>(R.id.info)

        val fastestLap = view.findViewById<View>(R.id.fastestLap)
        val fastestLapTitle = fastestLap.findViewById<TextView>(R.id.infoTitle)
        val fastestLapInfo = fastestLap.findViewById<TextView>(R.id.info)

        val worldChampoionships = view.findViewById<View>(R.id.worldChampoionships)
        val worldChampoionshipsTitle = worldChampoionships.findViewById<TextView>(R.id.infoTitle)
        val worldChampoionshipsInfo = worldChampoionships.findViewById<TextView>(R.id.info)

        val GPsEntered = view.findViewById<View>(R.id.GPsEntered)
        val GPsEnteredTitle = GPsEntered.findViewById<TextView>(R.id.infoTitle)
        val GPsEnteredInfo = GPsEntered.findViewById<TextView>(R.id.info)


        val team = view.findViewById<View>(R.id.team)
        val layoutImage = team.findViewById<ConstraintLayout>(R.id.layoutImage)
        val layerDrawableTeam = layoutImage.background as LayerDrawable
        val borderDrawableTeam = layerDrawableTeam.getDrawable(1) as GradientDrawable
        val imageViewCar = layoutImage.findViewById<ImageView>(R.id.imageViewCar)
        val teamName = team.findViewById<TextView>(R.id.teamName)

        val country = view.findViewById<View>(R.id.country)
        val countryName = country.findViewById<TextView>(R.id.countryName)
        val countryFlag = country.findViewById<ImageView>(R.id.flag)

        val placeBirth = view.findViewById<View>(R.id.placeBirth)
        val placeBirthTitle = placeBirth.findViewById<TextView>(R.id.infoTitle)
        val placeBirthInfo = placeBirth.findViewById<TextView>(R.id.info)

        val dateBirth = view.findViewById<View>(R.id.dateBirth)
        val dateBirthTitle = dateBirth.findViewById<TextView>(R.id.infoTitle)
        val dateBirthhInfo = dateBirth.findViewById<TextView>(R.id.info)


        borderDrawable.setStroke(
            4,
            constructors.find { it.id == drivers[driverPosition].equipe }!!.construcorColor
        )
        totalPts.text = drivers[driverPosition].points.toString()
        val orderdDrivers = drivers.sortedByDescending { it.points }
        standingNumber.text = (orderdDrivers.indexOf(drivers[driverPosition]) + 1).toString()

        podiumsTitle.text = getString(R.string.podiums)
        podiumsInfo.text = drivers[driverPosition].podiums.toString()

        fastestLapTitle.text = getString(R.string.fastestLap)
        fastestLapInfo.text = drivers[driverPosition].fastestLap.toString()

        worldChampoionshipsTitle.text =getString( R.string.worldChampoionships)
        worldChampoionshipsInfo.text = drivers[driverPosition].worldChampionships.toString()

        GPsEnteredTitle.text =getString( R.string.GPsEntered)
        GPsEnteredInfo.text = drivers[driverPosition].GPsEntered.toString()

        imageViewCar.setImageResource(constructors.find { it.id == drivers[driverPosition].equipe }!!.carImage)
        borderDrawableTeam.setStroke(
            4,
            constructors.find { it.id == drivers[driverPosition].equipe }!!.construcorColor
        )
        teamName.text = constructors.find { it.id == drivers[driverPosition].equipe }!!.nom
        countryName.text = drivers[driverPosition].nationalite
        countryFlag.setImageResource(drivers[driverPosition].flag)

        placeBirthTitle.text = getString(R.string.placeBirth)
        placeBirthInfo.text = drivers[driverPosition].birthPlace

        dateBirthTitle.text = getString(R.string.dateBirth)
        dateBirthhInfo.text = drivers[driverPosition].birthDate

        return view
    }
}
