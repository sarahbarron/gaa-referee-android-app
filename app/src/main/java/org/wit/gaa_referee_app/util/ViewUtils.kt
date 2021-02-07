package org.wit.gaa_referee_app.util

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}