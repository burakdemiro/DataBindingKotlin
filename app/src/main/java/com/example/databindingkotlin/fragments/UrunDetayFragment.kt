package com.example.databindingkotlin.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingkotlin.databinding.FragmentUrunDetayBinding
import com.example.databindingkotlin.utils.TumUrunler


class UrunDetayFragment : Fragment() {

    val binding:FragmentUrunDetayBinding by lazy {
        FragmentUrunDetayBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var denemeUrun = TumUrunler()

        binding.urun = denemeUrun.tumUrunlerDizisi[1]
        return binding.root // root layoutu döndürür
    }


}
