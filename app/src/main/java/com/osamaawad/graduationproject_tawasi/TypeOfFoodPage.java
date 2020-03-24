package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TypeOfFoodPage extends AppCompatActivity {

    CardView Desserts_Restaurants , SeeFood , ReadyFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_page);

        Desserts_Restaurants = findViewById(R.id.Card_DesRes);
        SeeFood = findViewById(R.id.Card_SeeFood);
        ReadyFood = findViewById(R.id.Card_ReadyFood);

        ReadyFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TypeOfFoodPage.this , RestaurantPage.class));
            }
        });
    }
}
