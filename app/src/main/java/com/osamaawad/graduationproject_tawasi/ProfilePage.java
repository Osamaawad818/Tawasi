package com.osamaawad.graduationproject_tawasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfilePage extends AppCompatActivity {

    Button LoginOrCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        LoginOrCreateAccount = findViewById(R.id.btn_Login_OrCreateAccount);
    }


    public void LoginOrCreateAccount(View view) {
        startActivity(new Intent(ProfilePage.this , Sign_in.class));
    }
}
