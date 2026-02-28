package com.oreki.openf1.presentation.user

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UserScreen(
    modifier: Modifier = Modifier
) {
    Scaffold { padding ->
        Column(
            modifier = modifier.padding(padding)
        ) {
            Text(text = "User Screen")
        }
    }
}