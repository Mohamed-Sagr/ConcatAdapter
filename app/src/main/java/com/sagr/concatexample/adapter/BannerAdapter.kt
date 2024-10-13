package com.sagr.concatexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sagr.concatexample.R
import com.sagr.concatexample.model.Banner
class BannerAdapter(
    private val banner: Banner
) : RecyclerView.Adapter<BannerAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageViewBanner: ImageView = itemView.findViewById(R.id.imageViewBanner)

        fun bind(banner: Banner) {
            Glide.with(imageViewBanner.context)
                .load(banner.bannerImage)
                .into(imageViewBanner)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_banner, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(banner)
}
