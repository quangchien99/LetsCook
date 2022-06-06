/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Define class for the Recipe.
 *
 * @property id identifier of the dish.
 * @property title name of the dish.
 * @property publisher the author of the dish.
 * @property featuredImage the image of the dish.
 * @property rating the rating of the dish.
 * @property referenceUrl source of the dish.
 * @property description the description of the dish.
 * @property cookingInstruction the instruction for the dish.
 * @property ingredients list [String] contains all the ingredients for the dish.
 * @property dateCreated the date the recipe is added.
 * @property dateLastModified the date the recipe is modified.
 */

@Parcelize
data class Recipe(
    val id: Int? = null,
    val title: String? = null,
    val publisher: String? = null,
    val featuredImage: String? = null,
    val rating: String? = null,
    val referenceUrl: String? = null,
    val description: String? = null,
    val cookingInstruction: String? = null,
    val ingredients: List<String> = listOf(),
    val dateCreated: String? = null,
    val dateLastModified: String? = null,
) : Parcelable
