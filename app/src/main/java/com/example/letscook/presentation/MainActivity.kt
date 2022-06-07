/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.letscook.R
import com.example.letscook.logger.Logger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var randomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //For testing - remove later
        Logger.e("ChienPQ -- testing DI-- randomString Injected= $randomString")
    }

}
