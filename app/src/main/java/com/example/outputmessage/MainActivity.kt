package com.example.outputmessage

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.text = "| Generate Value |"

        val colorR = findViewById<TextView>(R.id.color_r)

        btn.setTextColor(Color.rgb(255, 255, 255))
        btn.setBackgroundColor(Color.rgb(20, 20, 20))


        val view = findViewById<LinearLayout>(R.id.main)
        btn.setOnClickListener {
            val r = generateCodes()
            val g = generateCodes()
            val b = generateCodes()
            if (r < 255 || g < 255 || b < 255) {
                colorR.setTextColor(Color.rgb(255, 255, 255))
            } else {
                colorR.setTextColor(Color.rgb(r, g, b))
            }


            colorR.text = "R: $r, G: $g, B: $b"
            view.setBackgroundColor(Color.rgb(r, g, b))
            btn.text = setNameButton()
            btn.setTextColor(Color.rgb(255, 255, 255))
            btn.setBackgroundColor(Color.rgb(20, 20, 20))
        }
    }
}

fun generateCodes(): Int {
    val rand = Random.nextInt(1, 254 + 1)
    return rand
}

fun setNameButton(): String {
    Thread.sleep(1 * 2000)
    return "Generate Color"
}