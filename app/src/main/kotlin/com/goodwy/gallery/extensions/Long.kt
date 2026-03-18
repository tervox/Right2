package com.goodwy.gallery.extensions

import com.goodwy.commons.extensions.getFormattedDuration

fun Long.getFormattedDuration(): String {
    return (this / 16L).toInt().getFormattedDuration()
}
