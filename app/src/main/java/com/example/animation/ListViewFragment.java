package com.example.animation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class ListViewFragment extends Fragment {

    RecyclerView rcvUser;
    UserAdapter userAdapter;
    List<User> mUserList;

    private Button btnLeftToRight,btnRightToLeft,btnUpToDown,btnDownToUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_list_view, container, false);

        btnLeftToRight = root.findViewById(R.id.btn_left_to_right);
        btnRightToLeft = root.findViewById(R.id.btn_right_to_left);
        btnUpToDown = root.findViewById(R.id.btn_up_to_down);
        btnDownToUp = root.findViewById(R.id.btn_down_to_up);

        rcvUser = root.findViewById(R.id.rcv_user);
        rcvUser.setLayoutManager(new LinearLayoutManager(root.getContext()));
        mUserList = User.getMock();

        btnLeftToRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation(R.anim.layout_anim_left_to_right);
            }
        });
        btnRightToLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation(R.anim.layout_anim_right_to_left);
            }
        });
        btnUpToDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation(R.anim.layout_anim_up_to_down);
            }
        });
        btnDownToUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation(R.anim.layout_anim_down_to_up);
            }
        });


        return root;
    }
    private void setAnimation(int animResource){
        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(getContext(),animResource);
        rcvUser.setLayoutAnimation(layoutAnimationController);


        userAdapter = new UserAdapter(mUserList);
        rcvUser.setAdapter(userAdapter);
    }

}