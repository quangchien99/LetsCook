/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.network

import com.example.letscook.network.model.RecipeDto
import com.example.letscook.network.responses.RecipeResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


/**
 * Define the retrofit service class for getting data from food2fork api.
 */
interface RecipeService {

    /**
     * get all recipes from food2fork api.
     * @param token the Authorization of the api.
     * @param page page want to search.
     * @param query the name need to be searched.
     * @return [RecipeResponse] RecipeResponse
     */
    @GET("search")
    suspend fun search(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("query") query: String
    ): RecipeResponse


    /**
     * get  recipe from food2fork api by id.
     * @param token the Authorization of the api.
     * @param id the id of the recipe need to get.
     * @return [RecipeDto] RecipeNetworkEntity
     */
    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query("id") id: Int
    ): RecipeDto
}
