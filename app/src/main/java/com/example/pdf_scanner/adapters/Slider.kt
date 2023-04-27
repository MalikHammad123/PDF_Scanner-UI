package com.example.pdf_scanner.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pdf_scanner.R
import com.example.pdf_scanner.fragments.FragmentScreen

class Slider (
    fragmentActivity: FragmentActivity,
    private val context: Context
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentScreen.newInstance(
                context.resources.getString(R.string.onboarding1),
                R.drawable.onboarding1
            )
            1 -> FragmentScreen.newInstance(
                context.resources.getString(R.string.onboarding2),
                R.drawable.onboarding2
            )
            else -> FragmentScreen.newInstance(
                context.resources.getString(R.string.onboarding3),
                R.drawable.onboarding3
            )
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}