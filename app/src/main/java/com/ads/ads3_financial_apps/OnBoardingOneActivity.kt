package com.ads.ads3_financial_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        button4.setOnClickListener {
            finish()
            startActivity(Intent(this,OnBoardingTwoActivity::class.java))
        }
    }
}