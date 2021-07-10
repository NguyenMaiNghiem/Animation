package com.example.animation.ui.alpha;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.animation.R;

public class AlphaFragment extends Fragment {
    ImageView imgAlpha1,imgAlpha2,imgAlpha3,imgAlpha4;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_alpha, container, false);

        imgAlpha1 = root.findViewById(R.id.imgAlpha1);
        imgAlpha2 = root.findViewById(R.id.imgAlpha2);
        imgAlpha3 = root.findViewById(R.id.imgAlpha3);
        imgAlpha4 = root.findViewById(R.id.imgAlpha4);

        Animation animAlpha1 = AnimationUtils.loadAnimation(getContext(),R.anim.alpha);
        Animation animAlpha2 = AnimationUtils.loadAnimation(getContext(),R.anim.alpha1);
        Animation animAlpha3 = AnimationUtils.loadAnimation(getContext(),R.anim.alpha2);
        Animation animAlpha4 = AnimationUtils.loadAnimation(getContext(),R.anim.alpha3);

        imgAlpha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha1);
            }
        });

        imgAlpha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha2);
            }
        });

        imgAlpha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha3);
            }
        });

        imgAlpha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha4);
            }
        });

        return root;
    }

}