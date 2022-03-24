package com.ranosys.autoimageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ranosys.autoimageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slider = findViewById<ImageSlider>(R.id.slider)


        var list = listOf<SlideModel>(SlideModel("https://bit.ly/37Rn50u"),
            SlideModel("https://bit.ly/2BteuF2"),
            SlideModel("https://bit.ly/3fLJf72"))

        slider.setImageList(list)
    }

}