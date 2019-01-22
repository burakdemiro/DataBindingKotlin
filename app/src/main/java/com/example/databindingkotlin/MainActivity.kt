package com.example.databindingkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingkotlin.databinding.ActivityMainBinding
import com.example.databindingkotlin.fragments.UrunDetayFragment

class MainActivity : AppCompatActivity() {

    // lazy-tembel
    // ilk başta atama yapma ne zamanki ben binding nesnesini kullandım o zaman bu atamayı yaparsın
    val binding:ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var urunDetayFragment = UrunDetayFragment()
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.anaContainer.id, urunDetayFragment, "urunDetayFragment")
        transaction.commit()

        /*var mainFragment = MainFragment()
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.anaContainer.id, mainFragment, "mainFragment")
        transaction.commit()*/
    }
}
