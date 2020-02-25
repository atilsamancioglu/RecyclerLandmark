package com.atilsamancioglu.recyclerlandmark

import android.graphics.Bitmap

class SingletonClass {

    companion object Selected {
        var selectedImage : Bitmap? = null
    }

}