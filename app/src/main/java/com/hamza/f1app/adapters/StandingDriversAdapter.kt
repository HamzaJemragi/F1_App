package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Driver
import com.hamza.f1app.R

class StandingDriversAdapter(
    private val listDriver: List<Driver>,
    private val listener: OnItemClickListener,
) : RecyclerView.Adapter<StandingDriversAdapter.ViewHolderDriverStanding>() {

    private val orderedList = listDriver.sortedByDescending { it.points }

    companion object {
        private const val FIRST_PLACE = 1
        private const val OTHER_PLACES = 2
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) FIRST_PLACE else OTHER_PLACES
    }

    abstract class ViewHolderDriverStanding(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDriverStanding {
        return when (viewType) {
            FIRST_PLACE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.standing_firstplacedriver_card, parent, false)
                FirstPlaceLayout(view)
            }

            OTHER_PLACES -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.standing_otherplacesdriver_card, parent, false)
                OtherPlacesLayout(view)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: ViewHolderDriverStanding, position: Int) {
        when (holder) {
            is FirstPlaceLayout -> holder.bind(orderedList[position])
            is OtherPlacesLayout -> holder.bind(orderedList[position], position)
        }
    }

    override fun getItemCount(): Int = orderedList.size

    class FirstPlaceLayout(itemView: View) : ViewHolderDriverStanding(itemView) {
        private val standingNumber = itemView.findViewById<TextView>(R.id.standingNumber)
        private val line = itemView.findViewById<View>(R.id.line)
        private val driverFirstName = itemView.findViewById<TextView>(R.id.driverFirsName)
        private val driverLastName = itemView.findViewById<TextView>(R.id.driverLastName)
        private val driverTeam = itemView.findViewById<TextView>(R.id.driverTeam)
        private val driverPhoto = itemView.findViewById<ImageView>(R.id.driverPhoto)
        private val pts = itemView.findViewById<TextView>(R.id.pts)

        fun bind(driver: Driver) {
            standingNumber.text = "1"
            line.setBackgroundResource(driver.equipe!!.construcorColor)
            driverFirstName.text = driver.firsName
            driverLastName.text = driver.lastName
            driverTeam.text = driver.equipe?.nom ?: "Unknown"
            driverPhoto.setImageResource(driver.driverImage1)
            pts.text = "${driver.points} pts"
        }
    }

    class OtherPlacesLayout(itemView: View) : ViewHolderDriverStanding(itemView) {
        private val standingNumber = itemView.findViewById<TextView>(R.id.standingNumber)
        private val line = itemView.findViewById<View>(R.id.line)
        private val driverFirstName = itemView.findViewById<TextView>(R.id.driverFirsName)
        private val driverLastName = itemView.findViewById<TextView>(R.id.driverLastName)
        private val driverTeam = itemView.findViewById<TextView>(R.id.driverTeam)
        private val pts = itemView.findViewById<TextView>(R.id.pts)

        fun bind(driver: Driver, position: Int) {
            standingNumber.text = "${position + 1}"
            line.setBackgroundResource(driver.equipe!!.construcorColor)
            driverFirstName.text = driver.firsName
            driverLastName.text = driver.lastName
            driverTeam.text = driver.equipe?.nom ?: "Unknown"
            pts.text = "${driver.points} pts"
        }
    }
}