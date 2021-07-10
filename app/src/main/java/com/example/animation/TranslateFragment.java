package com.example.animation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TranslateFragment extends Fragment {
    ImageView imgTranslate1,imgTranslate2,imgTranslate3,imgTranslate4,imgTranslate5,imgTranslate6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_translate, container, false);

        imgTranslate1 = root.findViewById(R.id.imgTranslate1);
        imgTranslate2 = root.findViewById(R.id.imgTranslate2);
        imgTranslate3 = root.findViewById(R.id.imgTranslate3);
        imgTranslate4 = root.findViewById(R.id.imgTranslate4);
        imgTranslate5 = root.findViewById(R.id.imgTranslate5);
        imgTranslate6 = root.findViewById(R.id.imgTranslate6);

        Animation animTranslate1 = AnimationUtils.loadAnimation(getContext(),R.anim.translate1);
        Animation animTranslate2 = AnimationUtils.loadAnimation(getContext(),R.anim.translate2);
        Animation animTranslate3 = AnimationUtils.loadAnimation(getContext(),R.anim.translate3);
        Animation animTranslate4 = AnimationUtils.loadAnimation(getContext(),R.anim.translate4);
        Animation animTranslate5 = AnimationUtils.loadAnimation(getContext(),R.anim.translate5);
        Animation animTranslate6 = AnimationUtils.loadAnimation(getContext(),R.anim.translate);

        imgTranslate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate1);
            }
        });
        imgTranslate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate2);
            }
        });
        imgTranslate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate3);
            }
        });
        imgTranslate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate4);
            }
        });
        imgTranslate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate5);
            }
        });
        imgTranslate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate6);
            }
        });

        return root;
    }
}