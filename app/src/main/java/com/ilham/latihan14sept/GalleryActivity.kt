package com.ilham.latihan14sept

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GalleryActivity : AppCompatActivity() {
    private lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener() {
            intent = Intent(this@GalleryActivity, RecyclePnpActivity::class.java)
            startActivity(intent)
        }
        // Get the ImageView in the layout
        val imageView: ImageView = findViewById(R.id.fullscreen_image)

        // Get the image resource ID passed from the previous activity
        val imageResId = intent.getIntExtra("imageResId", -1)

        // Set the image in the ImageView
        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}