package com.example.animation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class ScaleFragment extends Fragment {
    ImageView imgScale1,imgScale2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_scale, container, false);

        imgScale1 = root.findViewById(R.id.imgScale);
        imgScale2 = root.findViewById(R.id.imgScale1);

        Animation animScale = AnimationUtils.loadAnimation(getContext(),R.anim.scale);
        Animation animScale1 = AnimationUtils.loadAnimation(getContext(),R.anim.scale1);

        imgScale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });

        imgScale2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale1);
            }
        });

        return root;
    }
}