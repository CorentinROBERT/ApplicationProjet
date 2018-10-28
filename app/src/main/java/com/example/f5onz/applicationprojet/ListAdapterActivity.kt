package com.example.f5onz.applicationprojet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_list_adapter.*

class ListAdapterActivity : AppCompatActivity() {

    var mAndroidVersionList = Array<MyAndroidVersion>(13, { MyAndroidVersion("???", 0) })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_adapter)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        seedAndroidVersionList()
        androidVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        androidVersionRecyclerView.adapter = AndroidVersionAdapter(mAndroidVersionList)
    }

    private fun seedAndroidVersionList() {
        var nameArray = resources.getStringArray(R.array.androidVersionName)
        val imgArray = arrayOf(R.drawable.donut, R.drawable.cupcake, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecreamsandwich, R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo)
        for (i in 0..(nameArray.size-1))
            mAndroidVersionList[i] = MyAndroidVersion(nameArray[i], imgArray[i])
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

