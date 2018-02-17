package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by gotwski on 17/02/18.
 */

val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)