package com.vanpra.composematerialdialogs.datetime.date

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.vanpra.composematerialdialogs.datetime.PlatformLocalDate

class DatePickerState(
    initialDate: PlatformLocalDate,
    val yearRange: IntRange
) {
    var selected by mutableStateOf(initialDate)
    var yearPickerShowing by mutableStateOf(false)

    companion object {
        val dayHeaders = listOf("S", "M", "T", "W", "T", "F", "S")
    }
}
