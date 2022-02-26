package com.wakaztahir.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun SimpleDialogAndButton(
    buttonText: String,
    content: @Composable (()->Unit) -> Unit
) {
    var dialogState by remember { mutableStateOf(false) }

    if(dialogState) {
        content { dialogState = false }
    }

    TextButton(
        onClick = { dialogState = true },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(MaterialTheme.colors.secondary),
    ) {
        Text(
            buttonText,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center),
            color = MaterialTheme.colors.onSecondary
        )
    }
}

/**
 * @brief Add title to top of layout
 */
@Composable
fun DialogSection(title: String, content: @Composable () -> Unit) {
    Text(
        title,
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier.padding(start = 8.dp, top = 8.dp)
    )

    content()
}


@Composable
expect fun DialogBox(
    onDismissRequest : ()->Unit,
    content : @Composable ()->Unit
)