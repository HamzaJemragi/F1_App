package com.hamza.f1app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getString
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Latest
import com.hamza.f1app.R


class RecyclerViewLatestAdapter(
    private val listLatest: List<Latest>,
    private val context: Context,
    private val listener: OnItemClickListener,
) :
    RecyclerView.Adapter<RecyclerViewLatestAdapter.ViewHolderLatest>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }


    class ViewHolderLatest(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val latestImage = itemView.findViewById<ImageView>(R.id.latestImage)
        val latestType = itemView.findViewById<TextView>(R.id.latestType)
        val latestTitle = itemView.findViewById<TextView>(R.id.latestTitle)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolderLatest {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.latest_card, parent, false)
        return ViewHolderLatest(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolderLatest,
        position: Int,
    ) {
        val latest = listLatest[position]
        holder.latestImage.setImageResource(latest.newsImage)
        holder.latestType.text = getString(context,latest.type)
        holder.latestTitle.text = getString(context,latest.title)
        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }
    }


    override fun getItemCount(): Int = listLatest.size
}