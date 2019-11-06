package com.newwalk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var i = 0
 var SKLAD : Array<Weapon> = arrayOf(
     Weapon("UZI", 35f, 7.5f, 0.25f, R.drawable.uzi_shka),
     Weapon("Shotgun", 400f, 3f, 1.8f, R.drawable.drob),
     Weapon("Bow", 180f, 4f,  1.15f, R.drawable.bow_aline),
     Weapon("revolver", 350f, 6f, 1.1f, R.drawable.revolver_jane),
     Weapon("Shock_revolver", 380f, 7f, 1.4f, R.drawable.shocky_thing),
     Weapon("Sniper_rifle", 1250f, 999f, 2f, R.drawable.sniperka),
     Weapon("Minigun_costume", 250f, 9f, 0.4f, R.drawable.minigun_robert),
     Weapon("Minigun_common", 200f, 9f, 0.4f, R.drawable.minigun_standart)
 )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    class Weapon(name : String, damage : Float, range : Float,
                 reload : Float, image : Int){
        var damage = damage
        var range = range
        var name = name
        var reload = reload
        var image = image
    }
    fun next(v: View){
        URON.setText(SKLAD[i].damage.toString())
        IMYA.setText(SKLAD[i].name)
        ZARYADKA.setText(SKLAD[i].reload.toString())
        DALNYOST.setText(SKLAD[i].range.toString())
        KARTINKA.setImageResource(SKLAD[i].image)
        i++
    }
    fun previous(v: View){
        URON.setText(SKLAD[i].damage.toString())
        IMYA.setText(SKLAD[i].name)
        ZARYADKA.setText(SKLAD[i].reload.toString())
        DALNYOST.setText(SKLAD[i].range.toString())
        KARTINKA.setImageResource(SKLAD[i].image)
        i--
    }


}
