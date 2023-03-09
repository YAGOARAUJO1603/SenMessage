package com.ds2.sendmessages

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val displayMessageText = findViewById<TextView>(R.id.displayMessageText)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        displayMessageText.apply { text = message }


    }
}