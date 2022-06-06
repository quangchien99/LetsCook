/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network.model

import com.google.gson.annotations.SerializedName

/**
 * Define class for the Recipe.
 *
 * @property pk primary the dish.
 * @property title name of the dish.
 * @property publisher the author of the dish.
 * @property featuredImage the image of the dish.
 * @property rating the rating of the dish.
 * @property sourceUrl source of the dish.
 * @property description the description of the dish.
 * @property cookingInstruction the instruction for the dish.
 * @property ingredients list [String] contains all the ingredients for the dish.
 * @property dateAdded the date the recipe is added.
 * @property dateUpdated the date the recipe is modified.
 */
class RecipeNetworkEntity(

    @SerializedName("pk")
    var pk: Int? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("publisher")
    var publisher: String? = null,

    @SerializedName("featured_image")
    var featuredImage: String? = null,

    @SerializedName("rating")
    var rating: String? = null,

    @SerializedName("source_url")
    var sourceUrl: String? = null,

    @SerializedName("description")
    var description: String? = null,

    @SerializedName("cooking_instruction")
    var cookingInstruction: String? = null,

    @SerializedName("ingredients")
    var ingredients: List<String> = listOf(),

    @SerializedName("date_added")
    var dateAdded: String? = null,

    @SerializedName("date_updated")
    var dateUpdated: String? = null

)
