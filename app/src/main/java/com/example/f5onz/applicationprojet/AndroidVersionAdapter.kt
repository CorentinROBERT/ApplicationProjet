package com.example.f5onz.applicationprojet

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_android_version.view.*

class AndroidVersionAdapter(val items: Array<MyAndroidVersion>) : RecyclerView.Adapter<AndroidVersionAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndroidVersion(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_android_version))
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAndroidVersion(androidVersion: MyAndroidVersion) {
            with(androidVersion) {
                itemView.androidVersionName.text = name
                itemView.androidVersionImg.setImageResource(img)
            }
        }

    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
}
