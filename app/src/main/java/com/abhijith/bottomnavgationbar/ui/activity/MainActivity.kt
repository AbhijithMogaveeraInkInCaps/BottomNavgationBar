package com.abhijith.bottomnavgationbar.ui.activity

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.abhijith.bottomnavgationbar.R
import com.abhijith.bottomnavgationbar.ui.extension.toast
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
                toast("onExplore")
            }

            override fun onHome() {
                toast("onHome")
            }

            override fun onCreate() {
                toast("onCreate")
            }

            override fun onSubscription() {
                toast("onSubscription")
            }

            override fun library() {
                toast("library")
            }
        })
    }
}