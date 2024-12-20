package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R

class PastRaceAdapter(
    private val pastRaces: List<Race>,
    private val listener: OnItemClickListener,
) :
    RecyclerView.Adapter<PastRaceAdapter.ViewHolder>() {

        private val desPastList = pastRaces.sortedByDescending { it.id }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val arrowButton = view.findViewById<ImageButton>(R.id.arrowButton)
        val days = view.findViewById<TextView>(R.id.days)
        val month = view.findViewById<TextView>(R.id.month)
        val roundNumber = view.findViewById<TextView>(R.id.roundNumber)
        val location = view.findViewById<TextView>(R.id.location)
        val eventTitle = view.findViewById<TextView>(R.id.eventTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.racing_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return desPastList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val race = desPastList[position]

        holder.arrowButton
        holder.days.text = race.date.split("/")[0]
        holder.month.text = race.date.split("/")[1]
        holder.roundNumber.setText("Round ${race.id}")
        holder.location.text = race.lieu
        holder.eventTitle.setText("FORMULA 1 ${race.nom}")
        holder.itemView.setOnClickListener {
            val race = desPastList[position]
            val originalIndex = pastRaces.indexOf(race)
            listener.onItemClick(originalIndex)
        }
    }
}