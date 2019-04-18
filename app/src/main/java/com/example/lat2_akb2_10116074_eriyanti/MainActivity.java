package com.example.lat2_akb2_10116074_eriyanti;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

//10116074
//eriyanti
//akb-2
// selasa
    //Main Java jam 10.43
    //Register jam 12.10
    //Almost jam 13.23
    //verify jam 19.34
//rabu
    // use jam 12.34 malam\







public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btnLogin;
    TextView txtRegis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.button5);
        txtRegis = (TextView) findViewById(R.id.txt_regis);
        et1 = (EditText) findViewById(R.id.editText);

        final String txtregis = "doesn't have account ? Register";

        SpannableString ss = new SpannableString(txtregis);

        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.WHITE);
        ss.setSpan(foregroundColorSpan, 23, ss.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.WHITE);
                //textPaint.setColor(txtregis.getResources().getColor(R.color.Background));
                ds.setUnderlineText(false);

            }
        };

        ss.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegis.setText(ss);
        txtRegis.setMovementMethod(LinkMovementMethod.getInstance());
    }


}


