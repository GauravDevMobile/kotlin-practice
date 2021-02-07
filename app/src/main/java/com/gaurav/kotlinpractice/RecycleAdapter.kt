package com.gaurav.kotlinpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class RecycleAdapter(val itemClickListener: (Int) -> (Unit)) : RecyclerView.Adapter<RecycleAdapter.VHolder>() {
    var list: ArrayList<Int>? = ArrayList();

    inner class VHolder(var item: View) : RecyclerView.ViewHolder(item) {
        var text = item.textView


        fun bind(b: Int) {
            item.setOnClickListener {
                itemClickListener(b)
            }
            text.text = b.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        return VHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {

        holder.bind(list?.get(position)!!)
    }

    fun setData(l: List<Int>) {
        list?.let {
            it.clear()
            it.addAll(l)
            if (it.size > 0) {
                notifyDataSetChanged()
            }
        }
    }
}