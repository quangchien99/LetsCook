/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.presentation.recipelist

import androidx.lifecycle.ViewModel
import com.example.letscook.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val randomString: String
) : ViewModel() {

    //testing purpose - delete later
    init {
        Logger.e("ChienPQ --RecipeListViewModel-- testing DI = $randomString ")
    }
}
