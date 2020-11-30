package com.example.fragmentkomunikasi

import ViewPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // tampilan yang dibuat
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tampilan adapter
        view_pager.adapter = ViewPagerAdapter(this, supportFragmentManager)
        // untuk menampilkan bar fragment
        tabs.setupWithViewPager(view_pager)
    }
}