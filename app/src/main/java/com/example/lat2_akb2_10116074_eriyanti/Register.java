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


public class Register extends AppCompatActivity {
    Button button_r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button_r=findViewById(R.id.btn_regis);
        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent ( Register.this,Almost_There.class);
                startActivity(inten);
            }
        });
    }
}
