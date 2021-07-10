package com.example.animation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SpecialFragment extends Fragment {
    ImageView imgSpecial1,imgSpecial2,imgSpecial3,imgSpecial4,imgSpecial5,imgSpecial6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_special, container, false);

        imgSpecial1 = root.findViewById(R.id.imgSpecial1);
        imgSpecial2 = root.findViewById(R.id.imgSpecial2);
        imgSpecial3 = root.findViewById(R.id.imgSpecial3);
        imgSpecial4 = root.findViewById(R.id.imgSpecial4);
        imgSpecial5 = root.findViewById(R.id.imgSpecial5);
        imgSpecial6 = root.findViewById(R.id.imgSpecial6);

        Animation animSpecial1 = AnimationUtils.loadAnimation(getContext(),R.anim.scale_alpha);
        Animation animSpecial2 = AnimationUtils.loadAnimation(getContext(),R.anim.alpha_rotate);
        Animation animSpecial3 = AnimationUtils.loadAnimation(getContext(),R.anim.xoay_to_ra);
        Animation animSpecial4 = AnimationUtils.loadAnimation(getContext(),R.anim.translate_alpha);
        Animation animSpecial5 = AnimationUtils.loadAnimation(getContext(),R.anim.translate_scale);
        Animation animSpecial6 = AnimationUtils.loadAnimation(getContext(),R.anim.translate_rotate_scale);

        imgSpecial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial1);
            }
        });
        imgSpecial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial2);
            }
        });
        imgSpecial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial3);
            }
        });
        imgSpecial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial4);
            }
        });
        imgSpecial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial5);
            }
        });
        imgSpecial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSpecial6);
            }
        });


        return root;
    }
}