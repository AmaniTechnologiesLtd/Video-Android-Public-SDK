package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.amani.AmaniSdk
import com.app.amani.base.viewmodel.AmaniApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AmaniSdk.init(this)
        AmaniSdk.getInstance().goToPreRegistrationActivity(this,"")
    }
}