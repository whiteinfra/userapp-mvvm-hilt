package com.example.userapp.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.userapp.presentation.viewmodel.UserViewModel

@Composable
fun UserListScreen(navController: NavHostController, viewModel: UserViewModel = hiltViewModel()) {
    val users by viewModel.users.collectAsState()
    LaunchedEffect(Unit) { viewModel.loadUsers() }
    LazyColumn {
        items(users) { user ->
            ListItem(
                headlineContent = { Text(user.name) },
                supportingContent = { Text(user.email) },
                modifier = Modifier.clickable {
                    navController.navigate("detail/${user.id}")
                }
            )
        }
    }
}
