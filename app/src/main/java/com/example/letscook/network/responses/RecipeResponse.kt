/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network.responses

import com.example.letscook.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

/**
 * Define the Response Recipe from Network.
 * @property count the number of recipes.
 * @property previous the previous search.
 * @property recipes list of [RecipeNetworkEntity].
 */
class RecipeResponse(
    @SerializedName("count")
    var count: Int,

    @SerializedName("previous")
    var previous: String? = null,

    @SerializedName("results")
    var recipes: List<RecipeNetworkEntity>
)
