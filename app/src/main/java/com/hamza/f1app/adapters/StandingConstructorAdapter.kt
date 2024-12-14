package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Constructor
import com.hamza.f1app.Models.Driver
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors

class StandingConstructorAdapter(
    private val listConstructor: List<Constructor>,
    private val listener: OnItemClickListener,
) : RecyclerView.Adapter<StandingConstructorAdapter.ViewHolderConstructorStanding>() {

    private val orderedList = listConstructor.sortedByDescending { it.pilotes.sumOf { it.points } }

    companion object {
        private const val FIRST_PLACE = 1
        private const val OTHER_PLACES = 2
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) FIRST_PLACE else OTHER_PLACES
    }

    abstract class ViewHolderConstructorStanding(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderConstructorStanding {
        return when (viewType) {
            FIRST_PLACE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.standing_firstplaceconstructor_card, parent, false)
                FirstPlaceLayout(view)
            }

            OTHER_PLACES -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.standing_otherplacesconstructor_card, parent, false)
                OtherPlacesLayout(view)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: ViewHolderConstructorStanding, position: Int) {
        when (holder) {
            is FirstPlaceLayout -> holder.bind(orderedList[position])
            is OtherPlacesLayout -> holder.bind(orderedList[position], position)
        }
    }

    override fun getItemCount(): Int = orderedList.size

    class FirstPlaceLayout(itemView: View) : ViewHolderConstructorStanding(itemView) {
        private val standingNumber = itemView.findViewById<TextView>(R.id.standingNumber)
        private val line = itemView.findViewById<View>(R.id.line)
        private val constructorName = itemView.findViewById<TextView>(R.id.constructorName)
        private val flagDriver1 = itemView.findViewById<ImageView>(R.id.flagDriver1)
        private val flagDriver2 = itemView.findViewById<ImageView>(R.id.flagDriver2)
        private val driver1 = itemView.findViewById<TextView>(R.id.driver1)
        private val driver2 = itemView.findViewById<TextView>(R.id.driver2)
        private val carPhoto = itemView.findViewById<ImageView>(R.id.carPhoto)
        private val pts = itemView.findViewById<TextView>(R.id.pts)

        fun bind(constructor: Constructor) {
            standingNumber.text = "1"
            line.setBackgroundResource(constructor.construcorColor)
            constructorName.text = constructor.nom
            flagDriver1.setImageResource(constructor.pilotes[0].flag)
            flagDriver2.setImageResource(constructor.pilotes[1].flag)
            driver1.text = constructor.pilotes[0].firsName
            driver2.text = constructor.pilotes[1].firsName
            carPhoto.setImageResource(constructor.carImage)
            pts.text = "${constructor.pilotes.sumOf { it.points }} pts"
        }
    }

    class OtherPlacesLayout(itemView: View) : ViewHolderConstructorStanding(itemView) {
        private val standingNumber = itemView.findViewById<TextView>(R.id.standingNumber)
        private val line = itemView.findViewById<View>(R.id.line)
        private val constructorName = itemView.findViewById<TextView>(R.id.constructorName)
        private val drivers = itemView.findViewById<TextView>(R.id.drivers)
        private val pts = itemView.findViewById<TextView>(R.id.pts)

        fun bind(constructor: Constructor, position: Int) {
            standingNumber.text = "${position + 1}"
            line.setBackgroundResource(constructor.construcorColor)
            constructorName.text = constructor.nom
            drivers.text="${constructor.pilotes[0].lastName} / ${constructor.pilotes[1].lastName}"
            pts.text="${constructor.pilotes.sumOf{it.points}}pts"
        }
    }
}