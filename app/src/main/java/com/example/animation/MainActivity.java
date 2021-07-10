package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN =  7000;

    ImageView imgMain;
    TextView txtMain;

    Animation animTop,animBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imgMain = findViewById(R.id.imgMain);
        txtMain = findViewById(R.id.txtMain);

        animTop = AnimationUtils.loadAnimation(this,R.anim.anim_top);
        animBottom = AnimationUtils.loadAnimation(this,R.anim.anim_bottom);

        imgMain.setAnimation(animTop);
        txtMain.setAnimation(animBottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}