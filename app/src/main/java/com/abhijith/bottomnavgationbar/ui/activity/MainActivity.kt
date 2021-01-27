package com.abhijith.bottomnavgationbar.ui.activity

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.abhijith.bottomnavgationbar.R
import com.abhijith.bottomnavgationbar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            setUpNavigation()
            makeCreateIconLarge()
        }
    }
    private fun ActivityMainBinding.setUpNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragm) as NavHostFragment?

        NavigationUI.setupWithNavController(
            bnv,
            navHostFragment!!.navController
        )
    }

    private fun ActivityMainBinding.makeCreateIconLarge() {
        val menuView = bnv.getChildAt(0) as BottomNavigationMenuView
        val i = 2;
        val iconView = menuView.getChildAt(i).findViewById<View>(R.id.icon)
        val layoutParams = iconView.layoutParams
        val displayMetrics = resources.displayMetrics
        layoutParams.height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics).toInt()
        layoutParams.width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics).toInt()
        iconView.layoutParams = layoutParams
    }

}