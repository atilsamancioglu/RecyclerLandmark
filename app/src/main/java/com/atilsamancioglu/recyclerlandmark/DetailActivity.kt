package com.atilsamancioglu.recyclerlandmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val landmarkName = intent.getStringExtra("name")
        textView.text = landmarkName


        val singleton = SingletonClass.Selected
        val selectedBitmap = singleton.selectedImage
        imageView.setImageBitmap(selectedBitmap)


    }
}
