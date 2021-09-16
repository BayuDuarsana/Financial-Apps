package com.ads.ads3_financial_apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*


class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this,"Wait fro the website ....", Toast.LENGTH_SHORT).show()

        webview.loadUrl("https://www.google.com/")
        webview.settings.javaScriptEnabled

    }
}