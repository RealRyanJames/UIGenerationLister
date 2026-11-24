package com.example.outputmessage

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

fun createAppendedButton(button: Button) {

    button.text = "Enter Application"
    button.setBackgroundColor(Color.rgb(20, 20, 20))
    button.setTextColor(Color.rgb(255, 255, 255))

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting_main_screen)


        val button1 = findViewById<Button>(R.id.btn1)

        button1.setOnClickListener {
            val newView = Intent(this, StartingMainScreen::class.java)
            startActivity(newView)
        }

        createAppendedButton(button1)
    }
}
