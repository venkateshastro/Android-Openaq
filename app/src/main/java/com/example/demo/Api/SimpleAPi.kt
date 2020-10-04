package com.example.demo.Api

import com.example.demo.Todo
import com.example.demo.Util.Constants
import com.example.demo.model.Post
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleAPi {
    @GET( "/v1/measurements/")
    suspend fun getpost(
        @Query("Country") location : String
    ): Post
}