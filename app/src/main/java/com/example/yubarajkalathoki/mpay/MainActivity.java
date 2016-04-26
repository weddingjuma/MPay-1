package com.example.yubarajkalathoki.mpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNtcPrepaidActivity(View view){
        Intent intent=new Intent(getApplicationContext(),NtcPrepaidActivity.class);
        startActivity(intent);
    }
    public void goToAdslTopupActivity(View view){
        Intent intent=new Intent(getApplicationContext(),ADSLTopupActivity.class);
        startActivity(intent);
    }
    public void goToDishHomeTopupActivity(View view){
        Intent intent=new Intent(getApplicationContext(),DishHomeTopupActivity.class);
        startActivity(intent);
    }
    public void goToEsewaTransferActivity(View view){
        Intent intent=new Intent(getApplicationContext(),EsewaTransferActivity.class);
        startActivity(intent);
    }
    public void goToNCELLTopupActivity(View view){
        Intent intent=new Intent(getApplicationContext(),NcellTopupActivity.class);
        startActivity(intent);
    }
    public void goToNtcPostpaidActivity(View view){
        Intent intent=new Intent(getApplicationContext(),NtcPostPaidActivity.class);
        startActivity(intent);
    }
    public void goToRechargeCardActivity(View view){
        Intent intent=new Intent(getApplicationContext(),RechargeCardActivity.class);
        startActivity(intent);
    }
    public void goToSimTvActivity(View view){
        Intent intent=new Intent(getApplicationContext(),SimTVActivity.class);
        startActivity(intent);
    }

}
