package com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.osamaawad.graduationproject_tawasi.R;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.RestaurantMenu;
import java.util.ArrayList;

public class RMAdapter extends RecyclerView.Adapter<RMAdapter.ViewHolder> {

    ArrayList<RestaurantMenu> restaurantMenus;
    Context context;

    public RMAdapter(ArrayList<RestaurantMenu> restaurantMenus, Context context) {
        this.restaurantMenus = restaurantMenus;
        this.context = context;
    }

    @NonNull
    @Override
    public RMAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_menu , parent , false);

        return new RMAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RMAdapter.ViewHolder holder, int position) {
        holder.Image_logo2.setImageResource(restaurantMenus.get(position).getLogo2());
        holder.MealName2.setText(restaurantMenus.get(position).getMealName2());
        holder.MealPrice2.setText(restaurantMenus.get(position).getMealPrice2());

        holder.Image_logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context , R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(context.getApplicationContext())
                        .inflate(R.layout.layout_bottom_sheet ,
                                holder.bottom_Sheet
                        );

                bottomSheetView.findViewById(R.id.btn_ADD).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Thank You", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantMenus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView Image_logo2;
        TextView MealName2 , MealPrice2;
        LinearLayout bottom_Sheet;
        Button Add;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Image_logo2 = itemView.findViewById(R.id.Meal_logo);
            MealName2 = itemView.findViewById(R.id.txt_MealName);
            MealPrice2 = itemView.findViewById(R.id.txt_MealPrice);

            bottom_Sheet = itemView.findViewById(R.id.BottomSheetContainer);

            Add = itemView.findViewById(R.id.btn_ADD);
        }
    }
}
