package com.example.aplikasipertama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val actionBar = supportActionBar
        actionBar!!.title = "Main"

        val textView = findViewById<TextView>(R.id.tv_hello)
        val button = findViewById<Button>(R.id.btn_tombol)
        val imageView = findViewById<ImageView>(R.id.iv_avatar)
        val btnNextPage = findViewById<Button>(R.id.btn_next_page)
        val editText = findViewById<EditText>(R.id.ed_title)

//        imageView.setImageDrawable(resources.getDrawable(R.drawable.ic_account_circle_black))

        Glide
            .with(this@MainActivity)
            .load("https://upload.wikimedia.org/wikipedia/commons/3/37/Lambang_UNJ_dan_moto.png")
            .centerCrop()
            .into(imageView)

        button.setOnClickListener {
            textView.text = editText.text.ifEmpty { "Ohayou" }
        }

        btnNextPage.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
//            finish()
        }
    }
}