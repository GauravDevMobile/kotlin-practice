package com.gaurav.kotlinpractice

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter2(val context: Context) : RecyclerView.Adapter<Adapter2.AViewHolder>(), Filterable {
    var list: ArrayList<String> = ArrayList();
    var list2: ArrayList<String> = ArrayList();

    inner class AViewHolder(var mview: View) : RecyclerView.ViewHolder(mview) {
        lateinit var textz: TextView;


        init {
            textz = mview.findViewById<TextView>(R.id.textView)
            mview.setOnClickListener {
                Log.e("TAG", "fdsdf: ")

            }
        }

    }

    override fun getFilter(): Filter {
        return mFilter;
    }

    var mFilter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            var filterlist = ArrayList<String>()
            if (constraint == null || constraint.length == 0) {
                filterlist.addAll(list2)
            } else {
                for (i in list2) {
                    if (i.contains(constraint)) {
                        filterlist.add(i)
                    }
                }
            }
            var filterResult = FilterResults()
            filterResult.values = filterlist
            return filterResult

        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            list.clear()
            list.addAll(results?.values as Collection<String>)
            notifyDataSetChanged()
        }
    }

    fun addItems(items: List<String>) {
        list?.clear()
        list2.clear()
        list2?.addAll(items)
        if (items.size > 0) {
            list?.addAll(items)
            list2?.addAll(items)
            notifyDataSetChanged()
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)

        return AViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: AViewHolder, position: Int) {
        holder.textz.text = list?.get(position)
        holder.textz.setOnClickListener {
            var a: Int = 10
            var b: Int = 20

            var c = a + b
            for (i in 1..5) {
                c = c + a
            }

        }

    }
}