package com.example.myapplication


import android.media.Image
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val imagething : ImageView = findViewById(R.id.imageView)
        var current = 0;


        imagething.setOnClickListener{
            current++
            if (current > 3){ current = 0}
            if (current == 1){ imagething.setImageResource(R.drawable.pear) }
            if (current == 2){ imagething.setImageResource(R.drawable.orange) }
            if (current == 3){ imagething.setImageResource(R.drawable.banana) }
            if (current == 0){ imagething.setImageResource(R.drawable.apple) }




        }




    }
}
