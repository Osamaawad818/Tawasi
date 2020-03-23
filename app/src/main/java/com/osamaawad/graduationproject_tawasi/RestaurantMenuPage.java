package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters.ARAdapter;
import com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters.RMAdapter;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.AllRestaurant;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.RestaurantMenu;

import java.util.ArrayList;

public class RestaurantMenuPage extends AppCompatActivity {

    TextView SeeCart , Price;

    RecyclerView rvRestaurantMenu;
    ArrayList<RestaurantMenu> restaurantMenus;
    RMAdapter rmAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_menu_page);

        rvRestaurantMenu = findViewById(R.id.RV_RestaurantMenu);

        SeeCart = findViewById(R.id.txt_See_Cart);
        Price = findViewById(R.id.txt_Price);

        SeeCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RestaurantMenuPage.this , CartPage.class));
            }
        });

        Price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RestaurantMenuPage.this , MealReservationPage.class));
            }
        });

        RecyclerRestaurantMenu();
    }

    public void RecyclerRestaurantMenu(){
        Integer[] logo2 = {R.drawable.room1 , R.drawable.room2 , R.drawable.room3 , R.drawable.room4 , R.drawable.room5
                , R.drawable.room1 , R.drawable.room2};

        String[] MealName2 = {"Maker" , "Zet w Z3ter2" , "Fire Fly2" , "Pizza Hat2" , "Pizza Hat2" , "Zet w Z3ter2" , "Fire Fly2"};
        String[] MealPrice2 = {"4" , "5" , "2" , "3" , "5" , "3" , "5"};

        restaurantMenus = new ArrayList<>();
        for (int i = 0 ; i < logo2.length ; i++){
            RestaurantMenu Restmenu = new RestaurantMenu(logo2[i] , MealName2[i] , MealPrice2[i]);
            restaurantMenus.add(Restmenu);
        }

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(RestaurantMenuPage.this ,
                LinearLayoutManager.VERTICAL , false);

        rvRestaurantMenu.setLayoutManager(layoutManager1);
        rvRestaurantMenu.setItemAnimator(new DefaultItemAnimator());

        rmAdapter = new RMAdapter(restaurantMenus ,RestaurantMenuPage.this);
        rvRestaurantMenu.setAdapter(rmAdapter);
    }
}
