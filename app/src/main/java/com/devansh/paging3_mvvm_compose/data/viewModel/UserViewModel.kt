package com.devansh.paging3_mvvm_compose.data.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.devansh.paging3_mvvm_compose.data.paging.UserPagingSource
import com.devansh.paging3_mvvm_compose.domain.repo.ApiServiceImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val apiService: ApiServiceImpl,
) : ViewModel() {

    val users = Pager(
        PagingConfig(pageSize = 10)
    ) {
        UserPagingSource(apiService)
    }.flow.cachedIn(viewModelScope)

}