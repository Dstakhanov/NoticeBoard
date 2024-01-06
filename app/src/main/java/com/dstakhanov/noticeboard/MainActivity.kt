package com.dstakhanov.noticeboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.dstakhanov.noticeboard.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
     }

    private fun init() {

        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.myToolbar.toolbar, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var whatPressed = ""
        when(item.itemId){

            R.id.id_my_ads -> {
                whatPressed = "id_my_ads"
            }
            R.id.id_car -> {
                whatPressed = "id_car"
            }
            R.id.id_pc -> {
                whatPressed = "id_pc"
            }
            R.id.id_smart -> {
                whatPressed = "id_smart"
            }
            R.id.id_dm -> {
                whatPressed = "id_dm"
            }
            R.id.id_sing_up -> {
                whatPressed = "id_sing_up"
            }
            R.id.id_sing_in -> {
                whatPressed = "id_sing_in"
            }
            R.id.id_sing_out -> {
                whatPressed = "id_sing_out"
            }
         }
        Toast.makeText(this, "Presed $whatPressed", Toast.LENGTH_LONG).show()

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true

    }
}