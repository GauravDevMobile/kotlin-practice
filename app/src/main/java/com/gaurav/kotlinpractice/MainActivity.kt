package com.gaurav.kotlinpractice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var i=Intent(this,MainActivity2::class.java)
        i.putExtra("",ParcelClass(101))
        startActivity(i)

    }
}



