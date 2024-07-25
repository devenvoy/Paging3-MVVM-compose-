package com.devansh.paging3_mvvm_compose.data.netwoek

import com.devansh.paging3_mvvm_compose.data.model.UserList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/user")
    suspend fun getUser(
        @Query("limit") limit: Int,
        @Query("skip") skip: Int? = null,
    ): Response<UserList>

}