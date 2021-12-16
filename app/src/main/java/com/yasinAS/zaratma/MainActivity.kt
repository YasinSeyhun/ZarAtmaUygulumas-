package com.yasinAS.zaratma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var Zar1Image : ImageView = findViewById(R.id.Zar1)
        var Zar2Image : ImageView = findViewById(R.id.Zar2)
        var button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            var random1 = (1..6).random()
            var random2 = (1..6).random()

            when(random1) {
                1 -> Zar1Image.setImageResource(R.drawable.dice_1)
                2 -> Zar1Image.setImageResource(R.drawable.dice_2)
                3 -> Zar1Image.setImageResource(R.drawable.dice_3)
                4 -> Zar1Image.setImageResource(R.drawable.dice_4)
                5 -> Zar1Image.setImageResource(R.drawable.dice_5)
                6 -> Zar1Image.setImageResource(R.drawable.dice_6)

            }
            when(random2){
                1 -> Zar2Image.setImageResource(R.drawable.dice_1)
                2 -> Zar2Image.setImageResource(R.drawable.dice_2)
                3 -> Zar2Image.setImageResource(R.drawable.dice_3)
                4 -> Zar2Image.setImageResource(R.drawable.dice_4)
                5 -> Zar2Image.setImageResource(R.drawable.dice_5)
                6 -> Zar2Image.setImageResource(R.drawable.dice_6)
            }

        }
    }
}