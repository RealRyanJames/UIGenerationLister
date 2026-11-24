package com.example.outputmessage

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File

class ChristmasHoliday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_christmas_holiday)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image = findViewById<ImageView>(R.id.imageSrc)
        val filePng = File("C:\\Users\\Ryan\\AndroidStudioProjects\\OutputMessage\\app\\src\\main\\java\\com\\example\\outputmessage", "xmas-tree-png-christmas-green-tree-decoration-vector.jpg")
        val mapped = BitmapFactory.decodeFile(filePng.absolutePath)
        image.setImageBitmap(mapped)

    }
}