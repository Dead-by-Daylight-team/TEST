package com.newwalk.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PointF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.TabHost
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    var i = 0
// var SKLAD : Array<Weapon> = arrayOf(
//     Weapon("UZI", 35f, 7.5f, 0.25f, R.drawable.uzi_shka),
//     Weapon("Shotgun", 400f, 3f, 1.8f, R.drawable.drob),
//     Weapon("Bow", 180f, 4f,  1.15f, R.drawable.bow_aline),
//     Weapon("revolver", 350f, 6f, 1.1f, R.drawable.revolver_jane),
//     Weapon("Shock_revolver", 380f, 7f, 1.4f, R.drawable.shocky_thing),
//     Weapon("Sniper_rifle", 1250f, 999f, 2f, R.drawable.sniperka),
//     Weapon("Minigun_costume", 250f, 9f, 0.4f, R.drawable.minigun_robert),
//     Weapon("Minigun_common", 200f, 9f, 0.4f, R.drawable.minigun_standart)
    lateinit var ee: movv
    lateinit var ff: fon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
ee = findViewById(R.id.Movv)
ff = findViewById(R.id.Fon)
        ee.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent): Boolean {
                if (event.action == MotionEvent.ACTION_DOWN)
                    ee.df = false
                if (event.action == MotionEvent.ACTION_UP)
                    ee.df = true
        var xy = PointF(event.x, event.y)
            ee.trt = xy


                return true
            }
        })
    }
    class Weapon(name : String, damage : Float, range : Float,
                 reload : Float, image : Int){
        var damage = damage
        var range = range
        var name = name
        var reload = reload
        var image = image
    }
//    fun next(v: View){
//        URON.setText(SKLAD[i].damage.toString())
//        IMYA.setText(SKLAD[i].name)
//        ZARYADKA.setText(SKLAD[i].reload.toString())
//        DALNYOST.setText(SKLAD[i].range.toString())
//        KARTINKA.setImageResource(SKLAD[i].image)
//        i++
//    }
//    fun previous(v: View){
//        URON.setText(SKLAD[i].damage.toString())
//        IMYA.setText(SKLAD[i].name)
//        ZARYADKA.setText(SKLAD[i].reload.toString())
//        DALNYOST.setText(SKLAD[i].range.toString())
//        KARTINKA.setImageResource(SKLAD[i].image)
//        i--
//    }


}

class movv (context: Context, attributeSet: AttributeSet) : View(context, attributeSet){
    var trt : PointF = PointF(250f, 250f)
    var df : Boolean = true
    override fun onDraw(canvas: Canvas) {
        var paint = Paint()
        super.onDraw(canvas)
 if (df)
     trt = PointF(250f, 250f)
        canvas.drawCircle(trt.x, trt.y, 30f, paint )
        invalidate()
    }

}
class fon (context: Context, attributeSet: AttributeSet) : View(context, attributeSet){

}