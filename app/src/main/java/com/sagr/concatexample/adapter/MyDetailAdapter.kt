package com.sagr.concatexample.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagr.concatexample.R
import com.sagr.concatexample.model.MyDetail
import java.util.Random

class MyDetailAdapter(
    private val myDetails: List<MyDetail>
) : RecyclerView.Adapter<MyDetailAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvUserName: TextView = itemView.findViewById(R.id.tvUserName)
        private val tvAboutMe: TextView = itemView.findViewById(R.id.tvAboutMe)

        fun bind(user: MyDetail) {
            tvUserName.text = user.name
            tvAboutMe.text = user.aboutMe

            // Generate a random color
            val randomColor = getRandomColor()
            itemView.setBackgroundColor(randomColor)
        }

        private fun getRandomColor(): Int {
            val random = Random()
            return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_my_detail, parent,
                false
            )
        )

    override fun getItemCount(): Int = myDetails.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(myDetails[position])
}
