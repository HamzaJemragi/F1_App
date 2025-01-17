package com.hamza.f1app.fragments

import android.annotation.SuppressLint
import android.content.Intent
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
import androidx.core.content.ContextCompat.getColor
import com.hamza.f1app.activities.ConstructorinfoActivity
import com.hamza.f1app.data.constructors

class DriverStatsFragment(val driverPosition: Int) : Fragment() {
    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.driver_stats, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val standingInfo = view.findViewById<View>(R.id.standingInfo)
        val frame = standingInfo.findViewById<FrameLayout>(R.id.frame)
        val layerDrawable = frame.background as LayerDrawable
        val borderDrawable = layerDrawable.getDrawable(0) as GradientDrawable
        val standingNumber = standingInfo.findViewById<TextView>(R.id.standingNumber)
        val totalPts = standingInfo.findViewById<TextView>(R.id.totalPts)

        val podiums = view.findViewById<View>(R.id.podiums)
        val podiumsTitle = podiums.findViewById<TextView>(R.id.infoTitleMini)
        val podiumsInfo = podiums.findViewById<TextView>(R.id.info)

        val fastestLap = view.findViewById<View>(R.id.fastestLap)
        val fastestLapTitle = fastestLap.findViewById<TextView>(R.id.infoTitleMini)
        val fastestLapInfo = fastestLap.findViewById<TextView>(R.id.info)

        val worldChampoionships = view.findViewById<View>(R.id.worldChampoionships)
        val worldChampoionshipsTitle = worldChampoionships.findViewById<TextView>(R.id.infoTitleMini)
        val worldChampoionshipsInfo = worldChampoionships.findViewById<TextView>(R.id.info)

        val GPsEntered = view.findViewById<View>(R.id.GPsEntered)
        val GPsEnteredTitle = GPsEntered.findViewById<TextView>(R.id.infoTitleMini)
        val GPsEnteredInfo = GPsEntered.findViewById<TextView>(R.id.info)


        val team = view.findViewById<View>(R.id.team)
        val layoutImage = team.findViewById<ConstraintLayout>(R.id.layoutImage)
        val layerDrawableTeam = layoutImage.background as LayerDrawable
        val borderDrawableTeam = layerDrawableTeam.getDrawable(0) as GradientDrawable
        val imageViewCar = layoutImage.findViewById<ImageView>(R.id.imageViewCar)
        val teamName = team.findViewById<TextView>(R.id.teamName)

        val country = view.findViewById<View>(R.id.country)
        val countryName = country.findViewById<TextView>(R.id.countryName)
        val countryFlag = country.findViewById<ImageView>(R.id.flag)

        val placeBirth = view.findViewById<View>(R.id.placeBirth)
        val placeBirthTitle = placeBirth.findViewById<TextView>(R.id.infoTitleLarge)
        val placeBirthInfo = placeBirth.findViewById<TextView>(R.id.info)

        val dateBirth = view.findViewById<View>(R.id.dateBirth)
        val dateBirthTitle = dateBirth.findViewById<TextView>(R.id.infoTitleLarge)
        val dateBirthhInfo = dateBirth.findViewById<TextView>(R.id.info)


        borderDrawable.setStroke(
            25,
            getColor(requireContext(),constructors.find { it.id == drivers[driverPosition].equipe }!!.construcorColor)
        )
        totalPts.text = drivers[driverPosition].seasonPoint.toString()
        val orderdDrivers = drivers.sortedByDescending { it.seasonPoint }
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
            25,
            getColor(requireContext(),constructors.find { it.id == drivers[driverPosition].equipe }!!.construcorColor)
        )
        teamName.text = constructors.find { it.id == drivers[driverPosition].equipe }!!.nom
        countryName.text = drivers[driverPosition].nationalite
        countryFlag.setImageResource(drivers[driverPosition].flag)

        placeBirthTitle.text = getString(R.string.placeBirth)
        placeBirthInfo.text = drivers[driverPosition].birthPlace

        dateBirthTitle.text = getString(R.string.dateBirth)
        dateBirthhInfo.text = drivers[driverPosition].birthDate

        team.setOnClickListener{
            val intent = Intent(context, ConstructorinfoActivity::class.java)
            intent.putExtra("constructorPosition", (constructors.find { it.id == drivers[driverPosition].equipe }!!.id)-1)
            val options = android.app.ActivityOptions.makeCustomAnimation(
                requireContext(),
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }
    }
}