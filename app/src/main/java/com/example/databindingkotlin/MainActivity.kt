package com.example.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        // dataBinding'i kullanabilmek için DataBinding'ten bir nesne oluşturdum
        // activity_main -> MainActivityBinding otomatik generate edildi bu sınıf
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val yeniOgrenci = Ogrenci("Yeni Öğrenci", 3000)
        // binding.tvAd.setText("Kamil")
        // binding.tvNumara.setText("" + 1250)

        binding.ogr = yeniOgrenci
    }
}
