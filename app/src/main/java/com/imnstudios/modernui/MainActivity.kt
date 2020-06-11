package com.imnstudios.modernui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import com.imnstudios.modernui.adapters.MainPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var mainPagerAdapter: MainPagerAdapter
    private lateinit var homeBtn: ImageButton
    private lateinit var addBtn: ImageButton
    private lateinit var notificationBtn: ImageButton
    private lateinit var searchBtn: ImageButton
    private lateinit var profileBtn: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.mViewPager)
        homeBtn = findViewById(R.id.homeBtn)
        addBtn = findViewById(R.id.addBtn)
        profileBtn = findViewById(R.id.profileBtn)
        searchBtn = findViewById(R.id.searchBtn)
        notificationBtn = findViewById(R.id.notiBtn)

        mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        viewPager.adapter = mainPagerAdapter
        viewPager.offscreenPageLimit = 5

        //page change listeners
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changingTabs(position)
            }

        })
        viewPager.currentItem =0
        homeBtn.setImageResource(R.drawable.ic_home_pink)


        homeBtn.setOnClickListener{
            viewPager.currentItem = 0
            homeBtn.setImageResource(R.drawable.ic_home_pink)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)
        }
        searchBtn.setOnClickListener{
            viewPager.currentItem = 1
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_pink)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)
        }
        addBtn.setOnClickListener{
            viewPager.currentItem = 2
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_pink)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)
        }
        notificationBtn.setOnClickListener{
            viewPager.currentItem = 3
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_fill)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)
        }
        profileBtn.setOnClickListener{
            viewPager.currentItem = 4
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_pink_fill)
        }

    }

    private fun changingTabs(position: Int) {
        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_home_pink)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)


        }
        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_pink)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)


        }
        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_pink)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)

        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_fill)
            profileBtn.setImageResource(R.drawable.ic_person_outline_)

        }
        if (position == 4) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_add_black)
            notificationBtn.setImageResource(R.drawable.ic_notifications_blck)
            profileBtn.setImageResource(R.drawable.ic_person_pink_fill)
        }
    }
}