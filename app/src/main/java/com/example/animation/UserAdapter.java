package com.example.animation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> mListUser;
    Context mContext;

    public UserAdapter(List<User> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @NotNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull UserViewHolder holder, int position) {
        User user = mListUser.get(position);

        holder.imgAvatar.setImageResource(user.getResourveId());
        holder.txtName.setText(user.getName());
        holder.txtAddress.setText(user.getAddress());

    }

    @Override
    public int getItemCount() {
        if (mListUser == null || mListUser.size() == 0){
            return 0;
        }
        return mListUser.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        ImageView imgAvatar;
        TextView txtName,txtAddress;

        public UserViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }
    }


}
