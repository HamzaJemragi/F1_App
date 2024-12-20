package com.hamza.f1app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import Constructor
import com.hamza.f1app.R


class RecyclerViewConstructorAdabter(
    private val listConstructor: List<Constructor>,
    private val context: Context,
    private val listener: OnItemClickListener,
) :
    RecyclerView.Adapter<RecyclerViewConstructorAdabter.ViewHolderConstructor>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }


    class ViewHolderConstructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val constructorLogo = itemView.findViewById<ImageView>(R.id.constructorLogo)
        val line = itemView.findViewById<View>(R.id.line)
        val constructorName = itemView.findViewById<TextView>(R.id.constructorName)
        val flagDriver1 = itemView.findViewById<ImageView>(R.id.flagDriver1)
        val flagDriver2 = itemView.findViewById<ImageView>(R.id.flagDriver2)
        val driver1 = itemView.findViewById<TextView>(R.id.driver1)
        val driver2 = itemView.findViewById<TextView>(R.id.driver2)
        val carPhoto = itemView.findViewById<ImageView>(R.id.carPhoto)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolderConstructor {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.constructor_card
            , parent, false)
        return ViewHolderConstructor(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolderConstructor,
        position: Int,
    ) {
        val constructor = listConstructor[position]
        holder.constructorLogo.setImageResource(constructor.logo)
        holder.line.setBackgroundColor(getColor(context,constructor.construcorColor))
        holder.constructorName.text = constructor.nom
        holder.flagDriver1.setImageResource(constructor.pilotes[0].flag)
        holder.flagDriver2.setImageResource(constructor.pilotes[1].flag)
        holder.driver1.text = constructor.pilotes[0].lastName
        holder.driver2.text = constructor.pilotes[1].lastName
        holder.carPhoto.setImageResource(constructor.carImage)
        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }

    }

    override fun getItemCount(): Int = listConstructor.size
}