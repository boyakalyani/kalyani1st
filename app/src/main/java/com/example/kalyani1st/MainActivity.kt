package com.example.kalyani1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

//    private lateinit var enabledImageView: ImageView
//    private lateinit var disabledImageView: ImageView
//    private lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the image views and toggle button.
//        enabledImageView= findViewById(R.id.img)//enableid
//        disabledImageView = findViewById(R.id.img2)//disid
//        toggleButton = findViewById(R.id.tglbtm1)//tglbtnid

        // Set the initial state of the image views.
//        disabledImageView.visibility = View.VISIBLE
//        enabledImageView.visibility = View.INVISIBLE
//
        // Set an OnCheckedChangeListener on the toggle button.
//        toggleButton.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                // The toggle button is enabled.
//                // Show the enabled image and hide the disabled image.
//                enabledImageView.visibility = View.VISIBLE
//                disabledImageView.visibility = View.INVISIBLE
//            } else {
//                // The toggle button is disabled.
//                // Show the disabled image and hide the enabled image.
//                disabledImageView.visibility = View.VISIBLE
//                enabledImageView.visibility = View.INVISIBLE
//            }
//        }
    }
}
