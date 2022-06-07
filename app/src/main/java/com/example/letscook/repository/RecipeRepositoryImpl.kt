/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.repository

import com.example.letscook.domain.model.Recipe
import com.example.letscook.network.RecipeService
import com.example.letscook.network.model.RecipeDtoMapper

/**
 * Define the implementation of [RecipeRepository]
 */
class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val recipeDtoMapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        val searchResult = recipeService.search(token, page, query).recipes
        return recipeDtoMapper.fromRecipeDtoList(searchResult)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        val recipeDto = recipeService.get(token, id)
        return recipeDtoMapper.mapToDomainModel(recipeDto)
    }
}
