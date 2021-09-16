package com.ads.ads3_financial_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        button6.setOnClickListener {
            finish()
            startActivity(Intent(this,OnBoardingOneActivity::class.java))
        }

        button2.setOnClickListener {
            finish()
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}