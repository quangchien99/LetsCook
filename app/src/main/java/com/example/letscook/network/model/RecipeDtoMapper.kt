/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network.model

import com.example.letscook.domain.model.Recipe
import com.example.letscook.domain.utils.DomainMapper

/**
 * Define the Mapper class for mapping between RecipeNetworkEntity and domain model (Recipe).
 */
class RecipeDtoMapper : DomainMapper<RecipeDto, Recipe> {

    override fun mapToDomainModel(model: RecipeDto) =
        Recipe(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage = model.featuredImage,
            rating = model.rating,
            referenceUrl = model.sourceUrl,
            description = model.description,
            cookingInstruction = model.cookingInstruction,
            ingredients = model.ingredients,
            dateCreated = model.dateAdded,
            dateLastModified = model.dateUpdated
        )

    override fun mapFromDomainModel(domainModel: Recipe) = RecipeDto(
        pk = domainModel.id,
        title = domainModel.title,
        publisher = domainModel.publisher,
        featuredImage = domainModel.featuredImage,
        rating = domainModel.rating,
        sourceUrl = domainModel.referenceUrl,
        description = domainModel.description,
        cookingInstruction = domainModel.cookingInstruction,
        ingredients = domainModel.ingredients,
        dateAdded = domainModel.dateCreated,
        dateUpdated = domainModel.dateLastModified
    )

    /**
     * Handle mapping from list of [RecipeDto] to [Recipe] - domain model.
     * @param recipeDtoList list of [RecipeDto] the entity need to map to [Recipe].
     * @return list of [Recipe] after mapping from entityList.
     */
    fun fromRecipeDtoList(recipeDtoList: List<RecipeDto>) = recipeDtoList.map {
        mapToDomainModel(it)
    }

    /**
     * Handle mapping from list of [Recipe] - domain model to [RecipeDto] - network entity.
     * @param domainRecipeList list of [Recipe] the entity need to map to [RecipeDto].
     * @return list of [RecipeDto] after mapping from domainEntityList.
     */
    fun toRecipeDtoList(domainRecipeList: List<Recipe>) = domainRecipeList.map {
        mapFromDomainModel(it)
    }
}
