package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

    }

    public void signIn(View view) {
        Intent i = new Intent(StartPage.this , Sign_in.class);
        startActivity(i);
    }


    public void signUp(View view) {
        Intent i = new Intent(StartPage.this , Sign_up.class);
        startActivity(i);
    }

    public void Skip(View view) {
        Intent i = new Intent(StartPage.this , MainPage.class);
        startActivity(i);
    }
}
