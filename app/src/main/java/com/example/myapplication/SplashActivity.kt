package com.example.myapplication



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Create this layout or use a drawable

        // Delay to show the splash screen for a few seconds
        Handler().postDelayed({
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
            finish() // Close SplashActivity
        }, 3000) // 3-second delay
    }
}
