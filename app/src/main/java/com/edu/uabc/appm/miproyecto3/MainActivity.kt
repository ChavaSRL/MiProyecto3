package com.edu.uabc.appm.miproyecto3

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.edu.uabc.appm.miproyecto3.Fragment.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            finish()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        //var fragmentTransaction = false
       // var fragment: Fragment? = null
        when (item.itemId)   {
           //referencia a los layout
            R.id.nav_fragment_inicio -> {
                primeracarga (fragl= InicioFragment())
            }
            R.id.nav_fragment_mi_proyecto-> {
                segundacarga(frag2 = MiProyectoFragment())
            }
            R.id.nav_fragment_mi_galeria -> {
                terceracarga(frag3 = MiGaleriaFragment())
            }
            R.id.nav_fragment_mi_perfil -> {
                cuartacarga(frag4 = MiPerfilFragment())
            }
           /* R.id.nav_activity_maps -> {
                quintacarga(frag5 = MapsActivity())
            }*/
            R.id.nav_fragment_bibliografia -> {
                sextacarga(frag6 = BibliografiaFragment())
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
    //se agrega
    private fun primeracarga (fragl: InicioFragment){
    val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,fragl)
        fm.commit()
    }
    private fun segundacarga (frag2: MiProyectoFragment){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag2)
        fm.commit()
    }
    private fun terceracarga (frag3: MiGaleriaFragment){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag3)
        fm.commit()
    }
    private fun cuartacarga (frag4: MiPerfilFragment){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag4)
        fm.commit()
    }           //UbicacionFragment
    /*private fun quintacarga (frag5: MapsActivity){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag5)
        fm.commit()
    }*/
    private fun sextacarga (frag6: BibliografiaFragment){
        val fm=supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag6)
        fm.commit()
    }
}
