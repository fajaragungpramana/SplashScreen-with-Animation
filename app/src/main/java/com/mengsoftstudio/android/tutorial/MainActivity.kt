package com.mengsoftstudio.android.tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animBounce = AnimationUtils.loadAnimation(this@MainActivity, R.anim.bounce)
        val animRotate = AnimationUtils.loadAnimation(this@MainActivity, R.anim.rotate)

        iv_logo_app.startAnimation(animBounce)

        tv_app_name.alpha = 0f
        tv_app_name.translationX = 500f
        tv_app_name.animate().alpha(1f).translationX(0f).setDuration(800).setStartDelay(300).start()

        tv_content_splash.alpha = 0f
        tv_content_splash.translationX = 500f
        tv_content_splash.animate().alpha(1f).translationX(0f).setDuration(800).setStartDelay(600).start()

        iv_logo_progress_bar.startAnimation(animRotate)

    }
}
