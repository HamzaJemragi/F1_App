package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.adapters.RecyclerViewDriverAdapter.OnItemClickListener

class RecyclerViewRacingAdapter(private val races: List<Race>, private val listener: OnItemClickListener,) :
    RecyclerView.Adapter<RecyclerViewRacingAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val arrowButton = view.findViewById<ImageView>(R.id.arrowButton)
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
        return races.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val race = races[position]

        holder.arrowButton
        holder.days.text = race.date.split("/")[0]
        holder.month.text = race.date.split("/")[1]
        holder.roundNumber.setText("Round ${race.id}")
        holder.location.text = race.lieu
        holder.eventTitle.setText("FORMULA 1 ${race.nom}")
    }
}