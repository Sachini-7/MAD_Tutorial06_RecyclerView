package com.example.tutorial06

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDataVH(itemView: View):RecyclerView.ViewHolder(itemView) {
    val tvUserName:TextView=itemView.findViewById(R.id.tvUserName)
    val tvDescription:TextView=itemView.findViewById(R.id.tvDescription)
    val btnLike: Button =itemView.findViewById(R.id.btnLike)
}