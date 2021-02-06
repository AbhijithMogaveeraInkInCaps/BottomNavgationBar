package com.abhijith.bottomnavgationbar.ui.activity

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.abhijith.bottomnavgationbar.R
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private val bottomNavigationView: CustomBottomNavigation by lazy {
        findViewById(R.id.bnv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setUpWithNavController(supportFragmentManager,object:CustomBottomNavigation.Callback{
            override fun onExplore() {

            }

            override fun onHome() {

            }

            override fun onCreate() {

            }

            override fun onSubscription() {

            }

            override fun library() {

            }
        })
    }
}