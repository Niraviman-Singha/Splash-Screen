package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.splashscreen.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        this.title = "NIRAVIMAN"

        binding.popup.setOnClickListener {
            val popupMenu = PopupMenu(this@HomeActivity, binding.popup)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                it->
                Toast.makeText(this@HomeActivity, "You clicked: "+it.title, Toast.LENGTH_SHORT).show()
                true
            }
            popupMenu.show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kotlin->{
                Toast.makeText(this@HomeActivity, "Kotlin",Toast.LENGTH_SHORT).show()
            }

            R.id.java->{
                Toast.makeText(this@HomeActivity, "Java",Toast.LENGTH_SHORT).show()
            }

            R.id.dart->{
                Toast.makeText(this@HomeActivity, "Dart",Toast.LENGTH_SHORT).show()
            }

            R.id.python->{
                Toast.makeText(this@HomeActivity, "Python",Toast.LENGTH_SHORT).show()
            }

            R.id.ruby->{
                Toast.makeText(this@HomeActivity, "Ruby",Toast.LENGTH_SHORT).show()
            }

            R.id.swift->{
                Toast.makeText(this@HomeActivity, "Swift",Toast.LENGTH_SHORT).show()
            }

            R.id.haskell->{
                Toast.makeText(this@HomeActivity, "Haskell",Toast.LENGTH_SHORT).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }
}