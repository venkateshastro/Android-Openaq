package com.example.demo.repository

import com.example.demo.Api.RetrofitInstance
import com.example.demo.model.Post

class Repository {
    suspend fun getPost(): Post {
        return RetrofitInstance.Api.getpost()
    }
}
