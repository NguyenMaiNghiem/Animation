package com.example.animation.ui.home;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.animation.R;
import com.example.animation.databinding.FragmentHomeBinding;
import com.markjmind.propose.Propose;

public class HomeFragment extends Fragment {

    TextView txtAnimation;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.fragment_home, container, false);

        txtAnimation = root.findViewById(R.id.txtAnimation);

        txtAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create move ObjectAnimator
                ObjectAnimator move_anim = ObjectAnimator.ofFloat(txtAnimation, View.TRANSLATION_X, 0f,700);
                move_anim.setDuration(2000);

                // create rotation ObjectAnimator
                ObjectAnimator rotation_anim = ObjectAnimator.ofFloat(txtAnimation, View.ROTATION_X, 0,700);
                rotation_anim.setDuration(2000);

                // create propose, use Right motion
                Propose propose = new Propose(getContext());
                propose.motionRight.play(move_anim).with(rotation_anim); //move with rotation
                txtAnimation.setOnTouchListener(propose);

            }
        });


        return root;
    }

}