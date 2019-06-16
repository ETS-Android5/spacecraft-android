package com.hawksjamesf.common;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Nov/24/2018  Sat
 */
public class LottieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        LottieAnimationView lav = findViewById(R.id.lav);
        lav.setAnimation("src/animationsExprimental/assets/lottie.json");
        lav.playAnimation();
//        LottieCompositionFactory.fromJsonInputStream()
    }
}
