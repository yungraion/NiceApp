package com.example.tutorial

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.content_second.*


class SecondActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "NiceApp"
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)
        configureNumbers()
    }

    fun configureNumbers() {
        val intent = intent
        counter = intent.getIntExtra("counter", -1)
        titletext.text = "Here is a random number between 0 and $counter"
        val rnds = (0..counter).random()
        randomnumber.text = rnds.toString()
    }

    fun return2mainmenu(v: View) {
        val myIntent = Intent(this, MainActivity::class.java)
        myIntent.putExtra("counter", counter) //Optional parameters
        this.startActivity(myIntent)
    }
}
