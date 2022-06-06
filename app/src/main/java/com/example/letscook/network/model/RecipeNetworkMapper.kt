/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network.model

import com.example.letscook.domain.model.Recipe
import com.example.letscook.domain.utils.EntityMapper

/**
 * Define the Mapper class for mapping between RecipeNetworkEntity and domain model (Recipe).
 */
class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity, Recipe> {

    override fun mapFromEntity(entity: RecipeNetworkEntity) =
        Recipe(
            id = entity.pk,
            title = entity.title,
            publisher = entity.publisher,
            featuredImage = entity.featuredImage,
            rating = entity.rating,
            sourceUrl = entity.sourceUrl,
            description = entity.description,
            cookingInstruction = entity.cookingInstruction,
            ingredients = entity.ingredients,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated
        )

    override fun mapToEntity(domainModel: Recipe) = RecipeNetworkEntity(
        pk = domainModel.id,
        title = domainModel.title,
        publisher = domainModel.publisher,
        featuredImage = domainModel.featuredImage,
        rating = domainModel.rating,
        sourceUrl = domainModel.sourceUrl,
        description = domainModel.description,
        cookingInstruction = domainModel.cookingInstruction,
        ingredients = domainModel.ingredients,
        dateAdded = domainModel.dateAdded,
        dateUpdated = domainModel.dateUpdated
    )

    /**
     * Handle mapping from list of [RecipeNetworkEntity] to [Recipe] - domain model.
     * @param networkEntityList list of [RecipeNetworkEntity] the entity need to map to [Recipe].
     * @return list of [Recipe] after mapping from entityList.
     */
    fun fromEntityList(networkEntityList: List<RecipeNetworkEntity>) = networkEntityList.map {
        mapFromEntity(it)
    }

    /**
     * Handle mapping from list of [Recipe] - domain model to [RecipeNetworkEntity] - network entity.
     * @param domainEntityList list of [Recipe] the entity need to map to [RecipeNetworkEntity].
     * @return list of [RecipeNetworkEntity] after mapping from domainEntityList.
     */
    fun toEntityList(domainEntityList: List<Recipe>) = domainEntityList.map {
        mapToEntity(it)
    }
}