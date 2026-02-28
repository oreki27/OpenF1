package com.oreki.openf1.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.oreki.openf1.core.ui.components.AppButton

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold { padding ->
        Column(
            modifier = modifier.padding(padding)
        ) {
            Text(text = "Home Screen")
            AppButton(text = "Click Me", onClick = { })
        }
    }
}