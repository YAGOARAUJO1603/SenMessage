package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
    fun sendMessage( view: View)
    {
        val textMessage = findViewById<EditText>(R.id.EditMessage)
       /* val textMessage = findViewById<TextView>(R.id.textView)
        textMessage.text = editMessage.text;
        ESSAS LINHAS MOSTRAM O VALOR DE displayMessage na própria activity.
        romovidas pois iremos mostras esse valor na próxima activity */

        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply { putExtra(EXTRA_MESSAGE, message) }

        startActivity(intent)



    }
}