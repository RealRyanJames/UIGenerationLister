package com.example.outputmessage

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting_main_screen)

        val valueStarting = findViewById<TextView>(R.id.welcomeValue)
        ValuesSend.createText("Welcome to | RGB Generation |", valueStarting)
        valueStarting.setTextColor(Color.rgb(20, 20, 20))
        valueStarting.textSize = 20f

        var button1 = findViewById<Button>(R.id.btn1)
        val dateNow = findViewById<TextView>(R.id.dateNow)
        dateNow.text = Calendar.getInstance().time.toString()
        button1.setOnClickListener {
            val newView = Intent(this, StartingMainScreen::class.java)
            startActivity(newView)
        }

        val darkModeButton = findViewById<Button>(R.id.darkMode)
        darkModeButton.setOnClickListener {

            darkModeButton.visibility = View.GONE
            val params = button1.layoutParams as ViewGroup.MarginLayoutParams
            params.setMargins(10, 700 * 2, 10, 10)
            button1.layoutParams = params

            if (DarkElements().isDark()) {
                val mainScreen = findViewById<View>(R.id.welcome)
                valueStarting.setTextColor(Color.rgb(255, 255, 255))
                dateNow.setTextColor(Color.rgb(255, 255, 255))
                mainScreen.setBackgroundColor(DarkMode.`is`())
                button1.setTextColor(Color.rgb(20, 20, 20))
                button1.setBackgroundColor(Color.rgb(255, 255, 255))
                button1.setTypeface(Typeface.DEFAULT_BOLD)
            }
        }

        createAppendedButton(button1)
    }
}
