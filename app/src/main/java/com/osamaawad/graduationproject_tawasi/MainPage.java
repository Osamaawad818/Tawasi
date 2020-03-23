package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import com.osamaawad.graduationproject_tawasi.ViewPagerClass.SlideAdapter;

public class MainPage extends AppCompatActivity {

    ViewPager Offers;
    private int layouts[] = {R.layout.fragment_offers1 , R.layout.fragment_offer2 , R.layout.fragment_offers3};

    Button Start_Deliver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Offers = findViewById(R.id.VP_Offers);
        Start_Deliver = findViewById(R.id.btn_Start_Deliver);

        Offers.setAdapter(new SlideAdapter(getSupportFragmentManager()));
    }


    public void StartDeliver(View view) {
        startActivity(new Intent(MainPage.this , RestaurantPage.class));
    }
}
