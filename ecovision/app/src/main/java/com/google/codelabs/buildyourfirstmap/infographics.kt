package com.google.codelabs.buildyourfirstmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smarteist.autoimageslider.SliderView




class infographics : AppCompatActivity() {
    // on below line we are creating a variable
    // for our array list for storing our images.
    lateinit var imageUrl: ArrayList<String>

    // on below line we are creating
    // a variable for our slider view.
    lateinit var sliderView: SliderView

    // on below line we are creating
    // a variable for our slider adapter.
    lateinit var sliderAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infographics)

        // on below line we are initializing our slier view.
        sliderView = findViewById(R.id.aslider)

        // on below line we are initializing
        // our image url array list.
        var image = intArrayOf(R.drawable.info1, R.drawable.info2)
        // on below line we are adding data to our image url array list.

        // on below line we are initializing our
        // slider adapter and adding our list to it.
        sliderAdapter = SliderAdapter(image )

        // on below line we are setting auto cycle direction
        // for our slider view from left to right.
        sliderView.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR

        // on below line we are setting adapter for our slider.
        sliderView.setSliderAdapter(sliderAdapter)

        // on below line we are setting scroll time
        // in seconds for our slider view.
        sliderView.scrollTimeInSec = 10

        // on below line we are setting auto cycle
        // to true to auto slide our items.
        sliderView.isAutoCycle = true

        // on below line we are calling start
        // auto cycle to start our cycle.
        sliderView.startAutoCycle()

    }
}