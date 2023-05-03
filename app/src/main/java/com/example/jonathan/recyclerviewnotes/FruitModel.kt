package com.example.jonathan.recyclerviewnotes

class FruitModel {
    var fruitImage: Int?
    var fruitName: String?
    var fruitPrice: Double?

    constructor(fruitImage: Int?, fruitName: String?, fruitPrice: Double?) {
        this.fruitName = fruitName
        this.fruitPrice = fruitPrice
        this.fruitImage = fruitImage
    }
}