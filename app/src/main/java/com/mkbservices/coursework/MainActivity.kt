package com.mkbservices.coursework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import fragments.*


class MainActivity : AppCompatActivity() {
    private val favoritesFragment = FavouriteFragment()
    private val ideasFragment = IdeasFragment()
    private val routinesFragment = RoutinesFragment()
    private val settingsFragment = SettingsFragment()
    private val thingsFragment = ThingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(favoritesFragment)
        val navBar: BottomNavigationView = findViewById(R.id.bottom_navigation)
        navBar.setOnItemSelectedListener{
            when(it.itemId){
                R.id.nav_favourites -> replaceFragment(favoritesFragment)
                R.id.nav_ideas-> replaceFragment(ideasFragment)
                R.id.nav_routines -> replaceFragment(routinesFragment)
                R.id.nav_settings -> replaceFragment(settingsFragment)
                R.id.nav_things ->  replaceFragment(thingsFragment)

            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragments_cont, fragment)
            transaction.commit()
        }
    }


}