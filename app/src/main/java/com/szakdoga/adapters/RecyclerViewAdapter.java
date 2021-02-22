package com.szakdoga.adapters;

import android.app.VoiceInteractor;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.szakdoga.R;
import com.szakdoga.model.FoodMacro;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.List;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {



    private final Context mContext;
    private final List<FoodMacro> foodData;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<FoodMacro> foodData) {
        this.mContext = mContext;
        this.foodData = foodData;

        // Request option for Glide
        option = new RequestOptions().centerCrop();
    }

    @NonNull
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.menu_offer_window,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, BulkingMenuOfferActivity.class);
                i.putExtra("image",foodData.get(viewHolder.getAdapterPosition()).getImage());
                i.putExtra("foodname",foodData.get(viewHolder.getAdapterPosition()).getFoodName());

                mContext.startActivity(i);

            }
        });




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.foodname.setText(foodData.get(position).getFoodName());

        // Load Image from the internet and set it into Imageview using Glide

        Glide.with(mContext).load(foodData.get(position).getImage()).apply(option).into(holder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id ;
        TextView foodname ;
        ImageView img_thumbnail;
        LinearLayout view_container;





        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            foodname = itemView.findViewById(R.id.breakfast_name_1);

            img_thumbnail = itemView.findViewById(R.id.breakfast_1);

        }
    }
}

