package com.example.tutorial


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "NiceApp"
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
       }
    }

    fun sayHello(v: View) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show()
    }

    fun count(v: View) {
        counter = counter + 1

        print(counter)
        myTextView.text = counter.toString()
    }

    fun thirdbutton(v: View) {
        val myIntent = Intent(this, SecondActivity::class.java)
        myIntent.putExtra("counter", counter) //Optional parameters
        this.startActivity(myIntent)
    }
}
