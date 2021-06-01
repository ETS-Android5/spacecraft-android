package com.jamesfchen.uicomponent.newLayoutExprimental

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.jamesfchen.uicomponent.coordinator.ViewPagerAdapterv2
import kotlinx.android.synthetic.main.activity_coordinatorlayout.*

import com.jamesfchen.uicomponent.R

/**
 * Copyright ® $ 2019
 * All right reserved.
 *
 * @author: hawksjamesf
 * @email: hawksjamesf@gmail.com
 * @since: Feb/16/2019  Sat
 */
class CoordinatorLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinatorlayout)
       val  mSectionsPagerAdapter = ViewPagerAdapterv2()
        val mViewPager = findViewById<ViewPager>(R.id.container)
        tablayout.setupWithViewPager(mViewPager)
        mViewPager.adapter = mSectionsPagerAdapter

    }

}