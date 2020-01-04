package com.example.abotiqueapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_2)


        webview.loadUrl("http://www.2ambale.com/")




        }


    }
