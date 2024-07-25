package com.devansh.paging3_mvvm_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.devansh.paging3_mvvm_compose.ui.presentation.navigation.RootNavGraph
import com.devansh.paging3_mvvm_compose.ui.theme.Paging3MVVMcomposeTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Paging3MVVMcomposeTheme {
                RootNavGraph()
            }
        }
    }
}
