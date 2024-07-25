package com.devansh.paging3_mvvm_compose.domain.repo

import com.devansh.paging3_mvvm_compose.data.model.UserList
import com.devansh.paging3_mvvm_compose.data.netwoek.ApiService
import kotlinx.coroutines.delay
import retrofit2.Response
import javax.inject.Inject

class ApiServiceImpl
@Inject constructor(
    private val apiService: ApiService,
) : ApiService {

    override suspend fun getUser(limit: Int, skip: Int?): Response<UserList> {
//        delay(5000)
        return apiService.getUser(limit, skip)
    }

}