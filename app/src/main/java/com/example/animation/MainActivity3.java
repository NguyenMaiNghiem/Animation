package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.markjmind.propose.MotionInitor;
import com.markjmind.propose.Propose;
import com.markjmind.propose.listener.ProposeListener;

public class MainActivity3 extends AppCompatActivity {
    ImageView moving_lyt;
    Button btnMain3;

    int end = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnMain3 = findViewById(R.id.btnMain3);
        moving_lyt = findViewById(R.id.imgBell1);

        ObjectAnimator rightMove = ObjectAnimator.ofFloat(moving_lyt, View.TRANSLATION_X, 0,end);
        ObjectAnimator rightDown = ObjectAnimator.ofFloat(moving_lyt, View.TRANSLATION_Y, 0,end);
        rightMove.setInterpolator(null);
        rightDown.setInterpolator(null);
        rightMove.setDuration(1000);
        rightDown.setDuration(1000);

        Propose propose = new Propose(this);
        propose.motionRight.play(rightMove);
        propose.motionRight.setMotionDistance(end).enableTabUp(false); // right move option
        propose.motionDown.play(rightDown);
        propose.motionDown.setMotionDistance(end).enableSingleTabUp(false).enableFling(false).enableTabUp(false);
        propose.motionRight.move(end/2);// center_horizontal lion
        propose.motionDown.move(end/2); // center_vertical lion
        moving_lyt.setOnTouchListener(propose);

        final ObjectAnimator running = ObjectAnimator.ofFloat(moving_lyt,View.ROTATION, 0,-10,20,40,20);
        running.setRepeatCount(ObjectAnimator.INFINITE);
        running.setDuration(150);

        propose.setOnProposeListener(new ProposeListener() {
            public void onStart() {
                running.start();
            }

            public void onScroll(int arg0, long arg1, long arg2) {}

            public void onEnd() {
                moving_lyt.setRotation(0f);
                running.cancel();
            }
        });


//        MotionInitor initor = new MotionInitor() {
//            public void touchDown(Propose propose) {
//                //getParam을 사용하여 해당 View를 리턴받고 사이즈를 얻을수 있다.
//                View lion_view = (View)getParam("lion");
//                int width = lion_view.getWidth();
//                //Animation 혹은 Distance 등의 값을 설정한다.
//                propose.motionRight.setMotionDistance(width);
//            }
//            public void touchUp(Propose propose) {
//                //view touchUp 시 필요한 내용을 초기화 할수있다.
//            }
//        };
//// touchDown시 사이즈를 얻어올 View 등록(key값에 대응하여 여러개 등록가능)
//        initor.addParam("lion", moving_lyt);
//        propose.setOnMotionInitor(initor);

        btnMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,Home.class);
                startActivity(intent);
                overridePendingTransition(R.anim.alpha_scale_nho_lai,R.anim.translate_divao);
            }
        });
    }
}