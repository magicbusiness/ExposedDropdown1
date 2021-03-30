package com.example.exposeddropdown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentDropdown = FragmentDropdown()

        fragment(fragmentDropdown)

        // init
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, SampleActivity::class.java)
            startActivity(intent)
        }
    }

    private fun fragment(fragment: Fragment)
    {
        // Initialize Fragment Manager
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Replace fragment with Layout that Had been Made
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()

    }
}