package com.example.f5onz.applicationprojet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_picker.*
import org.jetbrains.anko.*

class NumberPickerActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_picker)

        np.setMinValue(0)
        np.setMaxValue(10)
        np.setWrapSelectorWheel(true)

        np.setOnValueChangedListener { picker, oldVal, newVal -> tv.setText("Valeur choisie: " + newVal)  }
    }
}
