package com.example.animation;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private int resourveId;
    private String name,address;

    public User() {
    }

    public User(int resourveId, String name, String address) {
        this.resourveId = resourveId;
        this.name = name;
        this.address = address;
    }

    public int getResourveId() {
        return resourveId;
    }

    public void setResourveId(int resourveId) {
        this.resourveId = resourveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "resourveId=" + resourveId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static List<User> getMock(){
        return new ArrayList<>(Arrays.asList(
                new User(R.drawable.cat_sad,"Meo1","abc"),
                new User(R.drawable.cat_progress,"Meo2","abcd"),
                new User(R.drawable.boy,"Meo3","abcdef"),
                new User(R.drawable.girl,"Meo4","xyz"),
                new User(R.drawable.amongus,"Meo5","zzzzz"),
                new User(R.drawable.chick,"Meo6","qqqqq"),
                new User(R.drawable.luffy,"Meo7","ccccc"),
                new User(R.drawable.luffy1,"Meo8","ssssss"),
                new User(R.drawable.plane,"Meo9","abc"),
                new User(R.drawable.ufo,"Meo10","abc"),
                new User(R.drawable.ufos,"Meo11","abc"),
                new User(R.drawable.cat_sad,"Meo12","abc"),
                new User(R.drawable.cat_progress,"Meo13","abc"),
                new User(R.drawable.boy,"Meo14","abc"),
                new User(R.drawable.girl,"Meo15","abc"),
                new User(R.drawable.amongus,"Meo16","abc"),
                new User(R.drawable.chick,"Meo17","abc"),
                new User(R.drawable.luffy,"Meo18","abc"),
                new User(R.drawable.luffy1,"Meo19","abc"),
                new User(R.drawable.plane,"Meo20","abc")
        ));
    }
}
