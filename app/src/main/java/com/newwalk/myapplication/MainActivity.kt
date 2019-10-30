package com.newwalk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var i = 0
 var SKLAD : Array<Weapon> = arrayOf(
     Weapon("UZI", 35f, 7.5f, 0.25f),
     Weapon("Shotgun", 400f, 3f, 1.8f),
     Weapon("Bow", 180f, 4f,  1.15f),
     Weapon("revolver", 350f, 6f, 1.1f),
     Weapon("Shock_revolver", 380f, 7f, 1.4f),
     Weapon("Sniper_rifle", 1250f, 999f, 2f)
 )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    class Weapon(name : String, damage : Float, range : Float,
                 reload : Float){
        var damage = damage
        var range = range
        var name = name
        var reload = reload
        //var image = image
    }
    fun next(v: View){
        URON.setText(SKLAD[i].damage.toString())
        IMYA.setText(SKLAD[i].name)
        ZARYADKA.setText(SKLAD[i].reload.toString())
        DALNYOST.setText(SKLAD[i].range.toString())
        i++
    }


}
