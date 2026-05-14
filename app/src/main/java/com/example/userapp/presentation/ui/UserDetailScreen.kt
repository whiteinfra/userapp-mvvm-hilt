package com.example.userapp.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.userapp.presentation.viewmodel.UserViewModel

@Composable
fun UserDetailScreen(
    userId: Int,
    viewModel: UserViewModel = hiltViewModel()
) {
    val user by viewModel.selectedUser.collectAsState()
    LaunchedEffect(userId) { viewModel.selectUser(userId) }
    user?.let {
        Column(Modifier.padding(16.dp)) {
            Text("ID: ${it.id}")
            Text("Ім’я: ${it.name}")
            Text("Email: ${it.email}")
        }
    } ?: Text("Завантаження...")
}
