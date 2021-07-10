package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.markjmind.propose.Propose;
import com.markjmind.propose.listener.JwAnimatorListener;

public class MainActivity2 extends AppCompatActivity {
    Button btnMain2;
    ImageView flip_img;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnMain2 = findViewById(R.id.btnMain2);
        textView1 = findViewById(R.id.textView1);
        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_anim,R.anim.exit_anim);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create move ObjectAnimator
                ObjectAnimator move_anim = ObjectAnimator.ofFloat(textView1, View.TRANSLATION_X, 0f,700);
                move_anim.setDuration(2000);

                // create rotation ObjectAnimator
                ObjectAnimator rotation_anim = ObjectAnimator.ofFloat(textView1, View.ROTATION_X, 0,700);
                rotation_anim.setDuration(2000);

                // create propose, use Right motion
                Propose propose = new Propose(getApplicationContext());
                propose.motionRight.play(move_anim).with(rotation_anim); //move with rotation
                textView1.setOnTouchListener(propose);

            }
        });

        flip_img = findViewById(R.id.img1);
        flip_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator front = ObjectAnimator.ofFloat(flip_img, View.ROTATION_Y, 0,90);
                front.setDuration(500);
                ObjectAnimator back= ObjectAnimator.ofFloat(flip_img, View.ROTATION_Y, -90,0);
                back.setDuration(500);

                Propose propose = new Propose(getApplicationContext());

                propose.motionRight.play(front).next(back); /** set right move Animator **/
                propose.motionRight.setMotionDistance(200*Propose.getDensity(getApplicationContext())); /** set Drag Distance **/
                flip_img.setOnTouchListener(propose);	  /** set touch listener **/

                front.addListener(new JwAnimatorListener() {
                    public void onStart(Animator arg0) {}
                    public void onEnd(Animator arg0) {
                        flip_img.setBackgroundResource(R.drawable.girl_background);
                        flip_img.setImageResource(R.drawable.girl);
                    }
                    public void onReverseStart(Animator arg0) {
                        flip_img.setBackgroundResource(R.drawable.boy_background);
                        flip_img.setImageResource(R.drawable.boy);
                    }
                    public void onReverseEnd(Animator arg0) {}
                });
            }
        });

    }
}