package com.yayarh.budgetapp

import android.content.Intent
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


private val Any.activity_main3: Any
    get() {
        TODO("Not yet implemented")
    }
private val <T> Class<T>.button: T
    get() {
        TODO("Not yet implemented")
    }
private lateinit var button: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.id.activity_main3)

        button = findViewById(R.javaClass.button)
        

        button.setOnClickListener {
            val intent = Intent (this,MainActivity2::class.java )
            startActivity(intent)
        }
    }

    private fun setContentView(activityMain3: Any) {
        TODO("Not yet implemented")
    }
}
