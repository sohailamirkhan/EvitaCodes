package com.evitasoft.mechanic;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    Typeface custom_font;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setToolbar();

        btnClickHandler();
    }

    private void setToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/Ubuntu-M.ttf");
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setTypeface(custom_font);
        mTitle.setText(R.string.welcome_screen);
        setSupportActionBar(toolbar);
    }


    //wadekar
    private void btnClickHandler() {

        Button btnAddDelivery = (Button)findViewById(R.id.btnAddDelivery);
        Button btnUpdateDelivery = (Button)findViewById(R.id.btnUpdateDelivery);
        Button btnReport = (Button) findViewById(R.id.btnReport);

        btnAddDelivery.setTypeface(custom_font);
        btnUpdateDelivery.setTypeface(custom_font);
        btnReport.setTypeface(custom_font);

        btnAddDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), AddDelivery.class);
                startActivity(intent);
            }
        });


        btnUpdateDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), UpdateDelivery.class);
                startActivity(intent);
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
