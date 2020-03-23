package com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.osamaawad.graduationproject_tawasi.R;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.MostWonted;

import java.util.ArrayList;

public class MWAdapter extends RecyclerView.Adapter<MWAdapter.ViewHolder>{

    ArrayList<MostWonted> mostWonted;
    Context context;

    public MWAdapter( Context context , ArrayList<MostWonted> mostWonted) {
        this.mostWonted = mostWonted;
        this.context = context;
    }

    @NonNull
    @Override
    public MWAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.most_wonted , parent , false);

        return new MWAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MWAdapter.ViewHolder holder, int position) {
        holder.image_Logo.setImageResource(mostWonted.get(position).getLogo());
        holder.Name.setText(mostWonted.get(position).getRestName());
        holder.Rate.setText(mostWonted.get(position).getRestRate());
    }

    @Override
    public int getItemCount() {
        return mostWonted.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_Logo;
        TextView Name , Rate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image_Logo = itemView.findViewById(R.id.MW_LOGO);
            Name = itemView.findViewById(R.id.txt_RestName);
            Rate = itemView.findViewById(R.id.txt_RestRate);
        }
    }
}
