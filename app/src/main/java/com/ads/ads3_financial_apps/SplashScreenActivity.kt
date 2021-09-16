package com.ads.ads3_financial_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        button.setOnClickListener {
            finish()
            startActivity(Intent(this,SignInActivity::class.java))
        }
    }
}