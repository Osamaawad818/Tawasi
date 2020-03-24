package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters.ARAdapter;
import com.osamaawad.graduationproject_tawasi.RecyclerViewAdapters.MWAdapter;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.AllRestaurant;
import com.osamaawad.graduationproject_tawasi.RecyclerViewClasses.MostWonted;

import java.util.ArrayList;

public class RestaurantPage extends AppCompatActivity {

    RecyclerView rcMostWonted , rcAllRestauarnt;

    ArrayList<MostWonted> mostWonted;
    MWAdapter mwAdapter;
    ArrayList<AllRestaurant> allRestaurants;
    ARAdapter arAdapter;

    FrameLayout food , search , profile , type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_page);

        food = findViewById(R.id.F_Food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext() , RestaurantPage.class));
            }
        });

        profile = findViewById(R.id.F_Profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RestaurantPage.this , ProfilePage.class));
            }
        });

        type = findViewById(R.id.F_Type);
        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RestaurantPage.this , TypeOfFoodPage.class));
            }
        });

        RecyclerMostWonted();
        RecyclerAllRestaurant();
    }

    public void RecyclerMostWonted(){
        rcMostWonted = findViewById(R.id.RV_Most_Wonted);

        Integer[] logo= {R.drawable.room1 , R.drawable.room2 , R.drawable.room3 , R.drawable.room4, R.drawable.room5 ,
                R.drawable.room1 , R.drawable.room2 , R.drawable.room3};

        String[] RestName = {"Burger Maker" , "Shwerma" , "Zet w Z3ter" , "Fire Fly" , "Pizza Hat"
                , "Burger Maker" , "Shwerma" , "Zet w Z3ter"};

        String[] RestRate = {"Good" , "Good" , "bad" , "Very Good" , "Good" , "Good" , "Good" , "bad"};

        mostWonted = new ArrayList<>();
        for (int i = 0 ; i < logo.length ; i++){
            MostWonted most = new MostWonted(logo[i] , RestName[i] , RestRate[i]);
            mostWonted.add(most);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(RestaurantPage.this ,
                LinearLayoutManager.HORIZONTAL , false);

        rcMostWonted.setLayoutManager(layoutManager);
        rcMostWonted.setItemAnimator(new DefaultItemAnimator());

        mwAdapter = new MWAdapter(RestaurantPage.this , mostWonted);
        rcMostWonted.setAdapter(mwAdapter);
    }

    public void RecyclerAllRestaurant(){
        rcAllRestauarnt = findViewById(R.id.RV_All_Restaurant);

        Integer[] logo1 = {R.drawable.room1 , R.drawable.room2 , R.drawable.room3 , R.drawable.room4 , R.drawable.room5};
        String[] RestName1 = {"Maker" , "Shweerma" , "Zet w Z3ter2" , "Fire Fly2" , "Pizza Hat2"};
        String[] RestRate1 = {"4" , "5" , "5" , "2" , "3"};

        allRestaurants = new ArrayList<>();
        for (int i = 0 ; i < logo1.length ; i++){
            AllRestaurant all = new AllRestaurant(logo1[i] , RestName1[i] , RestRate1[i]);
            allRestaurants.add(all);
        }

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(RestaurantPage.this ,
                LinearLayoutManager.VERTICAL , false);

        rcAllRestauarnt.setLayoutManager(layoutManager1);
        rcAllRestauarnt.setItemAnimator(new DefaultItemAnimator());

        arAdapter = new ARAdapter(RestaurantPage.this ,allRestaurants );
        rcAllRestauarnt.setAdapter(arAdapter);
    }

}


