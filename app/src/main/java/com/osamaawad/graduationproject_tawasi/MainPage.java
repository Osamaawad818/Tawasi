package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.osamaawad.graduationproject_tawasi.ViewPagerClass.SlideAdapter;

public class MainPage extends AppCompatActivity {

    ViewPager Offers;
    private int layouts[] = {R.layout.fragment_offers1 , R.layout.fragment_offer2 , R.layout.fragment_offers3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Offers = findViewById(R.id.VP_Offers);

        Offers.setAdapter(new SlideAdapter(getSupportFragmentManager()));
    }
}
