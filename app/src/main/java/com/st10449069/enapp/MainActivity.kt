package com.st10449069.enapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.homeFragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.aboutFragment, R.id.contactFragment, R.id.homeFragment, R.id.courseSummaryFragment, R.id.enquiryFragment))

        bottomNavigationView.setupWithNavController(navController)
    }
}