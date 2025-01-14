package com.wakaztahir.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * @brief Collection of Material Dialog Demos
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogDemos() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Material Dialogs Demo")
                }
            )
        }
    ) {
        DateTimeDialogDemo(Modifier.padding(it))
    }
}
