package com.canytech.animationloginactivitydaynight

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        var sumMoon = 1

        val sumAnimation = AnimationUtils.loadAnimation(this, R.anim.sum_anim)
        iv_sum.animation = sumAnimation

        iv_change_dn.setOnClickListener {

            if (sumMoon == 1) {

                val infinityView = AnimationUtils.loadAnimation(this, R.anim.infinity)
                infinity_view.animation = infinityView

                val downSumAnimation = AnimationUtils.loadAnimation(this, R.anim.down_sum_anim)
                iv_sum.animation = downSumAnimation

                iv_moon.visibility = View.VISIBLE

                val moonAnimation = AnimationUtils.loadAnimation(this, R.anim.moon_anim)
                iv_moon.animation = moonAnimation

                val cloud3Animation = AnimationUtils.loadAnimation(this, R.anim.cloud_anim)
                iv_cloud3.animation = cloud3Animation

                val cloud2Animation =
                    AnimationUtils.loadAnimation(this, R.anim.cloud_right_to_left_anim)
                iv_cloud2.animation = cloud2Animation

                val cloud1Animation = AnimationUtils.loadAnimation(this, R.anim.cloud1_anim)
                iv_cloud.animation = cloud1Animation

                night_bg.visibility = View.VISIBLE

                val bgNightAnimation =
                    AnimationUtils.loadAnimation(this, R.anim.background_night_anim)
                night_bg.animation = bgNightAnimation

                night_bg.visibility = View.VISIBLE

                val landscapeNightAnimation =
                    AnimationUtils.loadAnimation(this, R.anim.background_night_anim)
                night_bg_landscape.animation = landscapeNightAnimation

                iv_cloud.visibility = View.VISIBLE
                iv_cloud2.visibility = View.VISIBLE
                iv_cloud3.visibility = View.VISIBLE

                sumMoon = 2

            } else {

                val infinityView = AnimationUtils.loadAnimation(this, R.anim.infinity)
                infinity_view.animation = infinityView

                val upSumAnimation = AnimationUtils.loadAnimation(this, R.anim.sum_delay_anim)
                iv_sum.animation = upSumAnimation

                val downMoonAnimation = AnimationUtils.loadAnimation(this, R.anim.down_moon_anim)
                iv_moon.animation = downMoonAnimation

                val cloud1offAnimation = AnimationUtils.loadAnimation(this, R.anim.cloud1off_anim)
                iv_cloud.animation = cloud1offAnimation

                val cloud2Animation =
                    AnimationUtils.loadAnimation(this, R.anim.cloud_left_to_right_anim)
                iv_cloud2.animation = cloud2Animation

                val cloud3Animation = AnimationUtils.loadAnimation(this, R.anim.cloudoff_anim)
                iv_cloud3.animation = cloud3Animation

                val bgNightAnimation =
                    AnimationUtils.loadAnimation(this, R.anim.background_down_night_anim)
                night_bg.animation = bgNightAnimation

                val landscapeNightAnimation =
                    AnimationUtils.loadAnimation(this, R.anim.background_down_night_anim)
                night_bg_landscape.animation = landscapeNightAnimation

                sumMoon = 1
            }
        }
    }
}

