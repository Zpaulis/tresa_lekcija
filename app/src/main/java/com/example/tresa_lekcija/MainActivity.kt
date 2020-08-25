package com.example.tresa_lekcija

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainButtonPush.text = getString(R.string.button_name)
        mainButtonPush.setOnClickListener {
                   Toast.makeText(this, getString(R.string.toast_text), Toast.LENGTH_SHORT).show()
            cliks = cliks + 1
            mainCounterView.text = "$cliks"
            Log.i(TAG, "Pressed $cliks times")
        }

    }
    companion object{
        private const val TAG = "MainActivity"
        private var cliks: Int = 0
    }
}