package com.ramazanpeker.landmarkbook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_detail.*

class ShowDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)
        val intent = intent
        val landmarkName = intent.getStringExtra("name")
        val landmarkImageId=intent.getIntExtra("image",0)


        textView.text = landmarkName
        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,landmarkImageId.toInt())
        imageView.setImageBitmap(selectedBitmap)

        /*val SelectedBitmap=Singeleton.selectedImage
        imageView.setImageBitmap((SelectedBitmap))*/
    }
}
