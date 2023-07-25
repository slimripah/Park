package com.slimripah.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_TIMER = 5000;

    ImageView logo;
    TextView powered;
    Animation fade, drop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logoImage);
        powered = findViewById(R.id.poweredLine);

        //Animations
        fade = AnimationUtils.loadAnimation(this, R.anim.fadein_anim);
        drop = AnimationUtils.loadAnimation(this, R.anim.drop_anim);

        //set animation
        logo.setAnimation(fade);
        powered.setAnimation(drop);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), Dashboard.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIMER);

    }
}