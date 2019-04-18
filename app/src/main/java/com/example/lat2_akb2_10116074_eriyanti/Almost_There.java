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


public class Almost_There extends AppCompatActivity {
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost__there);

        btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent ( Almost_There.this,Verify_account.class);
                startActivity(inten);
            }
        });
    }
}
