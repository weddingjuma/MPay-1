package com.example.yubarajkalathoki.mpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RechargeCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_card);
    }

    public void goToMainActivity(View view){
        Intent intent
                =new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
