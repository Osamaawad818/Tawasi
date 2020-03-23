package com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.osamaawad.graduationproject_tawasi.R;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.AllRestaurant;
import com.osamaawad.graduationproject_tawasi.RestaurantMenuPage;

import java.util.ArrayList;

public class ARAdapter extends RecyclerView.Adapter<ARAdapter.ViewHolder> {

    ArrayList<AllRestaurant> allRestaurants;
    Context context;

    public ARAdapter( Context context , ArrayList<AllRestaurant> allRestaurants) {
        this.allRestaurants = allRestaurants;
        this.context = context;
    }

    @NonNull
    @Override
    public ARAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.all_restaurant , parent , false);

        return new ARAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ARAdapter.ViewHolder holder, int position) {
        holder.image_logo1.setImageResource(allRestaurants.get(position).getLogo1());
        holder.Name1.setText(allRestaurants.get(position).getRestName1());
        holder.Rate1.setText(allRestaurants.get(position).getRestRate1());

        holder.image_logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context.getApplicationContext() , RestaurantMenuPage.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return allRestaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_logo1;
        TextView Name1 , Rate1;

        //LinearLayout ARLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image_logo1 = itemView.findViewById(R.id.AR_LOGO);
            Name1 = itemView.findViewById(R.id.txt_RestName1);
            Rate1 = itemView.findViewById(R.id.txt_RestRate1);

            //ARLayout = itemView.findViewById(R.id.All_Restaurant_Layout);
        }
    }
}
