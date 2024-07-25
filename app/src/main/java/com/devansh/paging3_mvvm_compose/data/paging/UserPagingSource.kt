package com.devansh.paging3_mvvm_compose.data.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.devansh.paging3_mvvm_compose.data.model.User
import com.devansh.paging3_mvvm_compose.domain.repo.ApiServiceImpl

class UserPagingSource(
    private val apiService: ApiServiceImpl,
) : PagingSource<Int, User>() {

    override fun getRefreshKey(state: PagingState<Int, User>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, User> {
        return try {
            val currentPage = params.key ?: 1
            val response = apiService.getUser(
                limit = 10,
                skip = null
            )
            val data = response.body()?.users

            Log.e("load", "load: ${response.body()?.total}")

            LoadResult.Page(
                data = data ?: emptyList(),
                prevKey = if (currentPage == 1) null else currentPage - 1,
                nextKey = if (data.isNullOrEmpty()) null else currentPage + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}