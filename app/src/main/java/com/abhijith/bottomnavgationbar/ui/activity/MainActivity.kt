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

    private val bottomNavigationView: BottomNavigationView by lazy {
        findViewById(R.id.bnv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigation()
        makeCreateIconLarge()

    }

    private fun setUpNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragm) as NavHostFragment?
        NavigationUI.setupWithNavController(
            bottomNavigationView,
            navHostFragment!!.navController
        )
    }

    private fun makeCreateIconLarge() {
        val menuView = bottomNavigationView.getChildAt(0) as BottomNavigationMenuView
        val i = 2;
        val iconView = menuView.getChildAt(i).findViewById<View>(R.id.icon)
        val layoutParams = iconView.layoutParams
        val displayMetrics = resources.displayMetrics
        layoutParams.height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics).toInt()
        layoutParams.width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics).toInt()
        iconView.layoutParams = layoutParams
    }
}