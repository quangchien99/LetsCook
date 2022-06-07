/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network.model

import com.google.gson.annotations.SerializedName

/**
 * The difference between data transfer objects and business objects or data access objects is that
 * a DTO does not have any behavior except for storage, retrieval, serialization and deserialization
 * of its own data (mutators, accessors, parsers and serializers). In other words,
 * DTOs are simple objects that should not contain any business logic
 * but may contain serialization and deserialization mechanisms
 * for transferring data over the wire.
 */

/**
 * RecipeDto for network (data transfer object)
 * RecipeEntity for database
 * Recipe for domain
 */

/**
 * Define class for the Recipe from network.
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
data class RecipeDto(

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
