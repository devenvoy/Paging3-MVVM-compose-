package com.devansh.paging3_mvvm_compose.ui.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import com.devansh.paging3_mvvm_compose.data.viewModel.UserViewModel
import com.devansh.paging3_mvvm_compose.ui.presentation.screens.components.ErrorItem
import com.devansh.paging3_mvvm_compose.ui.presentation.screens.components.LoadingItem
import com.devansh.paging3_mvvm_compose.ui.presentation.screens.components.UserItemCard

@Composable
fun HomeScreen(
    userViewModel: UserViewModel,
) {

    val users = userViewModel.users.collectAsLazyPagingItems()

    LazyColumn {

        items(users.itemCount) { index ->
            val user = users[index]
            user?.let {
                UserItemCard(user = it)
            }
        }

        when (users.loadState.append) {
            is LoadState.Error -> {
                item {
                    ErrorItem(message = (users.loadState.append as LoadState.Error).error.message.toString())
                }
            }

            LoadState.Loading -> {
                item { LoadingItem() }
            }

            is LoadState.NotLoading -> Unit
        }

    }
}
