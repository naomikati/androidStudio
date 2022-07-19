package com.example.mytwopagewebapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    var webViewSite:WebView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webViewSite = findViewById(R.id.mWebSite)
        var webSettings = webViewSite!!.settings
        webSettings.javaScriptEnabled = true
        webViewSite!!.loadUrl("https://www.emobilis.ac.ke/")
    }
}