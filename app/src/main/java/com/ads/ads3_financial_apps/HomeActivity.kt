package com.ads.ads3_financial_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.home_main.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)

        tv_blog.setOnClickListener {
            startActivity(Intent(this,BlogActivity::class.java))
        }
    }

}