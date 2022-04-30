package com.sunayanpradhan.imagezoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView

class MainActivity : AppCompatActivity() {

    lateinit var imageView: SubsamplingScaleImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView=findViewById(R.id.image_view)

        imageView.setImage(ImageSource.resource(R.drawable.photo))


    }
}