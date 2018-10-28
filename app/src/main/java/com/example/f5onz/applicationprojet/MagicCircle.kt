package com.example.dl811587.customview

data class MagicCircle(val maxX: Float, val maxY: Float) {
    var cx: Float = 50F
    var cy: Float = 50F
    val rad: Float = 60F
    var delta = 10
    var dx = delta
    var dy = delta

    fun move(){
        when {
            cx < 0F -> dx = delta
            cx > maxX -> dx = -delta
            cy < 0F -> dy = delta
            cy > maxY -> dy = -delta
        }
        cx += dx
        cy += dy
    }
}