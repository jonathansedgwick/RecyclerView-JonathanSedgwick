package com.example.jonathan.recyclerviewnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newLayout: GridLayoutManager
    lateinit var myFruitList: ArrayList<FruitModel>
    lateinit var myAdapter: FruitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.fruits_rv)
        newLayout = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        myRecyclerView.layoutManager = newLayout
        myRecyclerView.setHasFixedSize(true)
        myFruitList = setUpData()
        myAdapter = FruitAdapter(applicationContext, myFruitList)
        myRecyclerView.adapter = myAdapter
    }

    private fun setUpData(): ArrayList<FruitModel> {

        var fruitImages = intArrayOf(
            R.drawable.apple,
            R.drawable.avocado,
            R.drawable.banana,
            R.drawable.blueberry,
            R.drawable.cherry,
            R.drawable.kiwi,
            R.drawable.mango,
            R.drawable.pineapple,
            R.drawable.strawberry,
            R.drawable.watermelon
        )

        var fruitNames = arrayOf(
            "Apple",
            "Avocado",
            "Banana",
            "Blueberry",
            "Cherry",
            "Kiwi",
            "Mango",
            "Pineapple",
            "Strawberry",
            "Watermelon"
        )

        var fruitPrices = arrayOf(
            2.50,
            1.25,
            2.00,
            0.50,
            0.50,
            1.00,
            1.50,
            3.00,
            2.25,
            3.50
            )
        var fruitList = arrayListOf<FruitModel>()
        for (i in fruitImages.indices)
            fruitList.add(
                FruitModel(
                    fruitImages[i],
                    fruitNames[i],
                    fruitPrices[i]
                )
            )
        return fruitList
    }
}