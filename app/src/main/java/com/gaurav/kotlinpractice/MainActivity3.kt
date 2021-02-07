package com.gaurav.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.gaurav.kotlinpractice.databinding.ActivityMain3Binding
import com.gaurav.kotlinpractice.databinding.BottomsheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity3 : AppCompatActivity(),BlankFragment.MClick {
    lateinit var binding: ActivityMain3Binding
    lateinit var bottomsheetBinding: BottomsheetBinding
    lateinit var bottomsheetBehavior:BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding=  ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
bottomsheetBinding=binding.seet
      var fragment=  BlankFragment2.newInstance("gaurav","singh")
        bottomsheetBehavior= BottomSheetBehavior.from(bottomsheetBinding.bottomsheet)

bottomsheetBinding.textView2.setOnClickListener {
    DialogSheet().show(supportFragmentManager,"")
}
        bottomsheetBehavior.addBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {


            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
when(newState)
{
    BottomSheetBehavior.STATE_EXPANDED->bottomsheetBehavior.state=BottomSheetBehavior.STATE_COLLAPSED
    else
        ->    BottomSheetBehavior.STATE_EXPANDED
}
            }
        })


        supportFragmentManager.beginTransaction().add(R.id.frame,fragment).commit()

    }

    override fun onClick(at: String) {
        Log.e("aaa",at)
    }


}