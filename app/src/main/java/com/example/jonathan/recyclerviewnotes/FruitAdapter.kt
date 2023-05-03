package com.example.jonathan.recyclerviewnotes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(var ctx: Context, var fruitList: ArrayList<FruitModel>):
    RecyclerView.Adapter<FruitAdapter.FruitCardViewHolder>() {


    class FruitCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var fruitImage = itemView.findViewById<ImageView>(R.id.fruit_image)
        var fruitName = itemView.findViewById<TextView>(R.id.fruit_name)
        var fruitPrice = itemView.findViewById<TextView>(R.id.fruit_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitCardViewHolder {
        val newView = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item_card, parent, false)
        return FruitCardViewHolder(newView)
    }

    override fun onBindViewHolder(holder: FruitCardViewHolder, position: Int) {
        var myFruitCard: FruitModel = fruitList.get(position)
        holder.fruitImage.setImageResource(myFruitCard.fruitImage!!)
        holder.fruitName.text = myFruitCard.fruitName
        holder.fruitPrice.text = "$" + myFruitCard.fruitPrice.toString()

        holder.fruitImage.setOnClickListener{
            Toast.makeText(ctx, "You selected: " + myFruitCard.fruitName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}