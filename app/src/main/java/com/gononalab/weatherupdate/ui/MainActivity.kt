package com.gononalab.weatherupdate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.gononalab.weatherupdate.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)

        bottom_nav.setupWithNavController(navController) // Setting up bottom_nav with our navigationController
        NavigationUI.setupActionBarWithNavController(this,navController)                                                    //


    }

    override fun onSupportNavigateUp(): Boolean {
//        return super.onSupportNavigateUp()
        return NavigationUI.navigateUp(navController,null) // up/back button(on toolbar) behaviour
    }
}
