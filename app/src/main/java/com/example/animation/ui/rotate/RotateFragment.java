package com.example.animation.ui.rotate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.animation.R;


public class RotateFragment extends Fragment {
    ImageView imgRotate1,imgRotate2;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_rotate, container, false);

        imgRotate1 = root.findViewById(R.id.imgRotate1);
        imgRotate2 = root.findViewById(R.id.imgRotate2);

        Animation animRotate1 = AnimationUtils.loadAnimation(getContext(),R.anim.rotate1);
        Animation animRotate2 = AnimationUtils.loadAnimation(getContext(),R.anim.rotate);

        imgRotate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate1);
            }
        });

        imgRotate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate2);
            }
        });

        return root;
    }

}