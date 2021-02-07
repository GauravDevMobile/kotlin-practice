package com.gaurav.kotlinpractice

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.gaurav.kotlinpractice.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
var list=(10..20).map {
    it*2
}

        val b: (Int) -> (Unit)
        var d:RecycleAdapter= RecycleAdapter({
            Log.e("gggg",it.toString())
        })
binding.pager.adapter= d
        d.setData(list)


//        //for tabview
//binding.pager.adapter=StateAdapter(this)
//        TabLayoutMediator(binding.tab, binding.pager) { tab, position ->
//            tab.text = "Tab ${(position + 1)}"
//        }.attach()


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }

}