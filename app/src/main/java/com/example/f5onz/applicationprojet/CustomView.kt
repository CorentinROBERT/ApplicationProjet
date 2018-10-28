package com.example.dl811587.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Color.*
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import java.util.*

class CustomView : View, View.OnTouchListener {
    private var mPaint = Paint()
    lateinit var mCircle: MagicCircle
    companion object {
        val DELTA = 8
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mCircle = MagicCircle(width.toFloat(), height.toFloat())
        mCircle.delta = DELTA
    }

    constructor(context: Context) : this(context,null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mCircle.move()
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        invalidate()
    }
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event != null) {
            mCircle.cx = event.x
            mCircle.cy = event.y
            mPaint.color = Color.rgb(Random().nextInt(255),Random().nextInt(255),Random().nextInt(255))
        }
        return false
    }
    private fun init(){
        super.setOnTouchListener(this)
        mPaint.color = BLUE
    }
}