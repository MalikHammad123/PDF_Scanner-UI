package com.example.pdf_scanner

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.pdf_scanner.Pro1.Pro1
import com.example.pdf_scanner.adapters.Slider
import com.example.pdf_scanner.databinding.OnboardingBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoarding : AppCompatActivity() {
    private lateinit var mViewPager: ViewPager2
    private lateinit var btnBack: TextView
    private lateinit var btnNext: TextView

    private lateinit var binding:OnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =OnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mViewPager = binding.viewPager2
        mViewPager.adapter = Slider(this, this)
        mViewPager.offscreenPageLimit = 1
        btnBack = binding.btnSkip
        btnNext = binding.btnNext
        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        dotsIndicator.attachTo(mViewPager)
        mViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == 2) {
                    btnNext.text = "Finish"
                } else {
                    btnNext.text = "Next"
                }
            }

            override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) {}
            override fun onPageScrollStateChanged(arg0: Int) {}
        })

        btnNext.setOnClickListener {
            if (getItem() > mViewPager.childCount) {
                val i = Intent(applicationContext, Pro1::class.java)
                startActivity(i)
            } else {
                mViewPager.setCurrentItem(getItem() + 1, true)
            }
        }

        btnBack.setOnClickListener {

            val i = Intent(applicationContext, Pro1::class.java)
            startActivity(i)
        }
    }

    private fun getItem(): Int {
        return mViewPager.currentItem
    }
}