/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.repository

import com.example.letscook.domain.model.Recipe

/**
 * Define functions to for the RecipeRepository.
 */
interface RecipeRepository {

    /**
     * get all recipes for the UI.
     * @param token the Authorization of the api.
     * @param page page want to search.
     * @param query the name need to be searched.
     * @return [Recipe] Recipe
     */
    suspend fun search(token: String, page: Int, query: String): List<Recipe>

    /**
     * get recipe for the UI.
     * @param token the Authorization of the api.
     * @param id the id of the recipe need to get.
     * @return [Recipe] Recipe
     */
    suspend fun get(token: String, id: Int): Recipe
}
