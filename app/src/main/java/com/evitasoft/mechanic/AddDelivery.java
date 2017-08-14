package com.evitasoft.mechanic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.app.Dialog;
import android.widget.Spinner;

import java.util.ArrayList;


public class AddDelivery extends AppCompatActivity {
    Typeface custom_font;
    ArrayList<String> items =new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_delivery);
        setToolbar();


      //  btnClickHandler();
    }

    private void setToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/Ubuntu-M.ttf");
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setTypeface(custom_font);
        mTitle.setText(R.string.add_new_cylinder_delivery);
        setSupportActionBar(toolbar);
    }

    private void btnClickHandler() {
        Button btnSelectCustomer = (Button) findViewById(R.id.btnRegister);
        Button btnPaymentMode = (Button) findViewById(R.id.btnPaymentMode);
        Button btnAddDelivery = (Button) findViewById(R.id.btnAddDelivery);

        btnSelectCustomer.setTypeface(custom_font);
        btnPaymentMode.setTypeface(custom_font);
        btnAddDelivery.setTypeface(custom_font);

        btnSelectCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPaymentMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAddDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }




}
