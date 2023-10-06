package com.example.week2android

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.week2android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)


        _binding.button.setOnClickListener {
            // Way 1 to set Image
//            val newImageDrawable: Drawable? = getDrawable( R.drawable.image1)
            val newImageDrawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.image1)
            _binding.imageView.setImageDrawable(newImageDrawable)

//            setImageUsingGlide()

            // When the button is clicked, select a random image URL from the list
            val randomImageUrl = imageUrls.random()

            // Load and display the randomly selected image using Glide
            loadImageUsingGlide(randomImageUrl)
        }
    }

    private fun loadImageUsingGlide(imageUrl: String) {
        Glide
            .with(this)
            .load(imageUrl)
            .centerCrop()
            .into(_binding.imageView)
    }




    private val imageUrls = listOf(

//        "https://drive.google.com/uc?export=view&id=https://drive.google.com/file/d/1enWHfRhLCbEwft9YyiVcfVkM788z0VFy/view?usp=drive_link",
//        "https://drive.google.com/uc?export=view&id=https://drive.google.com/file/d/1t-LFAiWJ4MOq9OmhPb4EeDLzvpvNAcdT/view?usp=sharing"
//        "https://image.tmdb.org/t/p/original/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg",
        "https://th.bing.com/th/id/OIP.cRiYwRIyOs94Hm9QyV3wbgHaHa?w=198&h=198&c=7&r=0&o=5&dpr=1.3&pid=1.7",
        "https://th.bing.com/th?id=OIP.8ldccR0PEFbLZh8bA6uN3wHaEK&w=333&h=187&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2"



    // Add more image URLs as needed
        // Add more image URLs as needed
    )

}