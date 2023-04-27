package com.example.pdf_scanner.Pro1

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.pdf_scanner.R

class Pro1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro1)

        val radioGroup = findViewById<RadioGroup>(R.id.radiogroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radio1)
        val radioButton2 = findViewById<RadioButton>(R.id.radio2)
        val radioButton3 = findViewById<RadioButton>(R.id.radio3)
        val defaultText = radioButton2.text


        radioButton1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Set the background color of the radio button to a new color when it is clicked
                Toast.makeText(this, "Radio Button 1 is selected.", Toast.LENGTH_SHORT).show()
                //radioButton1.setBackgroundColor(Color.parseColor("#E2E7FF"))
                radioButton1.setBackgroundResource(R.drawable.radio_onclick_bg)
            } else {
                // Set the background color of the radio button back to its original color when it is unclicked
                radioButton1.setBackgroundColor(Color.parseColor("#FAFAFA"))
            }
        }
        radioButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {

                val spannable = SpannableStringBuilder(radioButton2.text)
                // Apply a StyleSpan to the part of the text that you want to make bold
                spannable.setSpan(StyleSpan(Typeface.BOLD), 0, 14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                spannable.setSpan(ForegroundColorSpan(Color.BLACK), 0, 14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)


                // Set the text of the RadioButton to the SpannableStringBuilder
                radioButton2.text = spannable




                // Set the background color of the radio button to a new color when it is clicked
                Toast.makeText(this, "Radio Button 2 is selected.", Toast.LENGTH_SHORT).show()
                //radioButton2.setBackgroundColor(Color.parseColor("#E2E7FF"))
                radioButton2.setBackgroundResource(R.drawable.radio_onclick_bg)

            } else {
                // Set the background color of the radio button back to its original color when it is unclicked
                radioButton2.setBackgroundColor(Color.parseColor("#FAFAFA"))
                radioButton2.text=defaultText
            }
        }
        radioButton3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Set the background color of the radio button to a new color when it is clicked
                Toast.makeText(this, "Radio Button 3 is selected.", Toast.LENGTH_SHORT).show()
                //radioButton3.setBackgroundColor(Color.grey)
                //radioButton3.setBackgroundColor(Color.parseColor("#E2E7FF"))
                radioButton3.setBackgroundResource(R.drawable.radio_onclick_bg)

            } else {
                // Set the background color of the radio button back to its original color when it is unclicked
                radioButton3.setBackgroundColor(Color.parseColor("#FAFAFA"))            }
        }







//           radioGroup.setOnCheckedChangeListener { group, checkedId ->
//               val message: String = when (checkedId) {
//                   R.id.radio1 -> "Radio Button 1 is selected."
//                   R.id.radio2 -> "Radio Button 2 is selected."
//                   R.id.radio3 -> "Radio Button 3 is selected."
//                   else -> "No radio button selected."
//               }
//               Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//           }
    }
}