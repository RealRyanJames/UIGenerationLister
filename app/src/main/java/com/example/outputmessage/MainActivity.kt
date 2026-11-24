package com.example.outputmessage

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

@SuppressLint("SetTextI18n")
fun createAppendedButton(button: Button) {

    button.text = "Enter Application"
    button.setBackgroundColor(Color.rgb(20, 20, 20))
    button.setTextColor(Color.rgb(255, 255, 255))
}

object ValuesSend {

    @SuppressLint("SetTextI18n")
    fun createText(text: String = "Welcome to | RGB Generation |", textView: TextView) {

        if (text.isEmpty()) {
            textView.text = "Empty Try Again"
        } else {
            textView.text = text
        }
    }
}



open class DarkElements {

    var darkElement: Boolean = true
        private set

    fun isDark(): Boolean {
        if (this.darkElement) {
            this.darkElement = true
        }

        return this.darkElement
    }
}

open class LightElements {

    var lightElement: Boolean = true
        private set

    fun isLight(): Boolean {
        if (this.lightElement) {
            this.lightElement = true
        }

        return this.lightElement
    }
}

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting_main_screen)

        val valueStarting = findViewById<TextView>(R.id.welcomeValue)
        ValuesSend.createText("Welcome to | RGB Generation |", valueStarting)
        valueStarting.setTextColor(Color.rgb(20, 20, 20))
        valueStarting.textSize = 20f

        val button1 = findViewById<Button>(R.id.btn1)
        val dateNow = findViewById<TextView>(R.id.dateNow)
        dateNow.text = Calendar.getInstance().time.toString()
        button1.setOnClickListener {
            val newView = Intent(this, StartingMainScreen::class.java)
            startActivity(newView)
        }

        val darkModeButton = findViewById<Button>(R.id.darkMode)

        darkModeButton.text = "Dark Mode"
        darkModeButton.setBackgroundColor(Color.rgb(20, 20, 20))
        darkModeButton.setTextColor(Color.rgb(255, 255, 255))

        val lightModeButton = findViewById<Button>(R.id.lightMode)
        lightModeButton.text = "| Light Mode |"

        lightModeButton.setTextColor(Color.rgb(255, 255, 255))
        lightModeButton.setBackgroundColor(Color.rgb(20, 20, 20))

        darkModeButton.setOnClickListener {

            button1.text = "| Visit Mode |"
            button1.setTextColor(Color.rgb(255, 255, 255))
            button1.setBackgroundColor(Color.rgb(20, 20, 20))

            if (DarkElements().isDark()) {

                button1.text = "| Visit Mode |"
                button1.setTextColor(Color.rgb(255, 255, 255))
                button1.setBackgroundColor(Color.rgb(20, 20, 20))

                lightModeButton.text = "| Light Mode |"
                val mainScreen = findViewById<View>(R.id.welcome)
                valueStarting.setTextColor(Color.rgb(255, 255, 255))
                dateNow.setTextColor(Color.rgb(255, 255, 255))
                mainScreen.setBackgroundColor(DarkMode.`is`())
                button1.setTypeface(Typeface.DEFAULT_BOLD)
            }
        }

        lightModeButton.text = "| Light Mode |"

        lightModeButton.setTextColor(Color.rgb(255, 255, 255))
        lightModeButton.setBackgroundColor(Color.rgb(20, 20, 20))

        button1.setTextColor(Color.rgb(255, 255, 255))
        button1.setBackgroundColor(Color.rgb(20, 20, 20))

        lightModeButton.setOnClickListener {

            darkModeButton.visibility = View.VISIBLE
            darkModeButton.text = " | Dark Mode |"
            lightModeButton.text = "Light Mode"
            button1.text = "| Visit Mode |"
            button1.setTextColor(Color.rgb(255, 255, 255))
            button1.setBackgroundColor(Color.rgb(20, 20, 20))

            if (LightElements().isLight()) {
                val mainScreen = findViewById<View>(R.id.welcome)
                mainScreen.setBackgroundColor(Color.rgb(255, 255, 255))
                valueStarting.setTextColor(Color.rgb(20, 20, 20))
                dateNow.setTextColor(Color.rgb(20, 20, 20))

            }
        }

        createAppendedButton(button1)
    }
}
