package com.abhijith.bottomnavgationbar.ui.extension

import android.content.Context
import android.widget.Toast

fun Context.toast(toast:String){
    Toast.makeText(this, toast, Toast.LENGTH_SHORT).show()
}