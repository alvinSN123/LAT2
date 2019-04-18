package com.example.lat2_akb2_10116074_eriyanti;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//10116074
//eriyanti
//akb-2
// selasa
//Main Java jam 10.43
//Register jam 12.10
//Almost jam 13.23
//verify jam 19.34
//rabu
// use jam 12.34 malam


public class Verify_account extends AppCompatActivity {
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent ( Verify_account.this,UserHome.class);
                startActivity(inten);
            }
        });
    }
}
