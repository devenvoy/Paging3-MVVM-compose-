package com.devansh.paging3_mvvm_compose.ui.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devansh.paging3_mvvm_compose.data.viewModel.UserViewModel
import com.devansh.paging3_mvvm_compose.ui.presentation.screens.HomeScreen

@Composable
fun RootNavGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(Screens.HomeScreen.route) {
            val viewModel = hiltViewModel<UserViewModel>()
            HomeScreen(viewModel)
        }

        composable(Screens.UserDetailScreen.route) {

        }
    }
}
