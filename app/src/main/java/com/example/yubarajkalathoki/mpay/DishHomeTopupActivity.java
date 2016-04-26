package com.example.yubarajkalathoki.mpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DishHomeTopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_home_topup);
    }

    public void goToMainActivity(View view){
        Intent intent
                =new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
