package com.coderscastle.recyclerview
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val userList: ArrayList<Users>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.tvName.text = user.name
        holder.tvAge.text = "Age : ${user.age}"
        holder.tvPhone.text = "Phone : ${user.phone}"
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val tvName = itemView.findViewById<TextView>(R.id.tvName)!!
        val tvAge = itemView.findViewById<TextView>(R.id.tvAge)!!
        val tvPhone = itemView.findViewById<TextView>(R.id.tvPhone)!!

    }
}