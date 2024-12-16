package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Driver
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors

class RecyclerViewDriverAdapter(
    private val listDriver: List<Driver>,
    private val listener: OnItemClickListener,
) :
    RecyclerView.Adapter<RecyclerViewDriverAdapter.ViewHolderDriver>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }


    class ViewHolderDriver(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val driverNumber = itemView.findViewById<TextView>(R.id.driverNumber)
        val line = itemView.findViewById<View>(R.id.line)
        val driverFirsName = itemView.findViewById<TextView>(R.id.driverFirsName)
        val driverLastName = itemView.findViewById<TextView>(R.id.driverLastName)
        val driverTeam = itemView.findViewById<TextView>(R.id.driverTeam)
        val driverPhoto = itemView.findViewById<ImageView>(R.id.driverPhoto)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolderDriver {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.driver_card, parent, false)
        return ViewHolderDriver(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolderDriver,
        position: Int,
    ) {
        val driver = listDriver[position]


            holder.driverNumber.text = "#${driver.driverNumber}"
            holder.line.setBackgroundResource(constructors.find { it.id == driver.equipe }!!.construcorColor)
            holder.driverFirsName.text = driver.firsName
            holder.driverLastName.text = driver.lastName
            holder.driverTeam.text = constructors.find { it.id == driver.equipe }!!.nom
            holder.driverPhoto.setImageResource(driver.driverImage1)
            holder.itemView.setOnClickListener {
                listener.onItemClick(position)
            }

    }

    override fun getItemCount(): Int = listDriver.size
}