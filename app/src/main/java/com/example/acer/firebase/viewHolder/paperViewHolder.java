package com.example.acer.firebase.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.acer.firebase.Interface.ItemClickListner;
import com.example.acer.firebase.R;

/**
 * Created by acer on 6/23/2018.
 */

public class paperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView category_name;
    public ImageView category_image;

    private ItemClickListner itemClickListner;


    public paperViewHolder(View itemView) {
        super(itemView);
        category_image = (ImageView)itemView.findViewById(R.id.category_image);
        category_name = (TextView)itemView.findViewById(R.id.category_name);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v,getAdapterPosition(),false);
    }

}
