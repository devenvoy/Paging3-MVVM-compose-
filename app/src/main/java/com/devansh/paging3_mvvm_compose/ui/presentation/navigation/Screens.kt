package com.devansh.paging3_mvvm_compose.ui.presentation.navigation

sealed class Screens(val route: String) {
    data object HomeScreen : Screens("home_screen")
    data object UserDetailScreen : Screens("user_detail_screen")
}