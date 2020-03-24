package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    Button LoginOrCreateAccount;

    TextView CallUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        LoginOrCreateAccount = findViewById(R.id.btn_Login_OrCreateAccount);

        CallUs = findViewById(R.id.txt_CallUs);
        CallUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilePage.this , UserPage.class));
            }
        });
    }


    public void LoginOrCreateAccount(View view) {
        startActivity(new Intent(ProfilePage.this , Sign_in.class));
    }
}
