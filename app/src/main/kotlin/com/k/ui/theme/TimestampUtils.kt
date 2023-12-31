package com.k.ui.theme

import java.text.ParsePosition
import java.text.SimpleDateFormat

/**
 * Timestamp to String
 * @param Timestamp
 * @return String
 */
fun transToString(time: Long): String {
    return SimpleDateFormat("YY-MM-DD-hh-mm-ss").format(time)
}

/**
 * String to Timestamp
 * @param String
 * @return Timestamp
 */
fun transToTimeStamp(date: String): Long {
    return SimpleDateFormat("YY-MM-DD-hh-mm-ss").parse(date, ParsePosition(0)).time
}

