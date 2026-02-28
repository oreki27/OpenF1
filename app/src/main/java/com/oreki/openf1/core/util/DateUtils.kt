package com.oreki.openf1.core.util

import java.text.SimpleDateFormat
import java.util.Locale

object DateUtils {
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())

    fun formatTimestamp(timestamp: Long): String {
        return dateFormat.format(timestamp)
    }
}