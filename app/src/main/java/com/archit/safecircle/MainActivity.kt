package com.archit.safecircle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)

        val bottomNavigation: BottomNavigationView=findViewById(R.id.bottom_bar_navigation)
        bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.navbar_guard -> {
                    inflateFragment(GuardScreenFragment.newInstance())
                }
                R.id.navbar_home -> {
                    inflateFragment(HomeScreenFragment.newInstance())
                }
                R.id.navbar_dashboard -> {
                    inflateFragment(DashboardMapFragment.newInstance())
                }
                else -> {
                    inflateFragment(ProfileScreenFragment.newInstance())
                }
            }
            true
        }
        bottomNavigation.selectedItemId=(R.id.navbar_home)

    }

    private fun inflateFragment(fragment: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.commit()

    }
}