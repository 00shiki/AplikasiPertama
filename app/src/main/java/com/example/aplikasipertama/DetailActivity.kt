package com.example.aplikasipertama

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.aplikasipertama.model.Student

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val student: Student? = intent.getParcelableExtra("STUDENT")

        Log.d("DetailActivity", "name ${student?.name}")
        Log.d("DetailActivity", "major ${student?.major}")

        val tvName = findViewById<TextView>(R.id.tv_detail_name)
        val tvMajor = findViewById<TextView>(R.id.tv_detail_major)

        tvName.text = student?.name
        tvMajor.text = student?.major
    }
}