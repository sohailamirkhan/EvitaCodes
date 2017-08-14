package com.evitasoft.mechanic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UpdateDelivery extends AppCompatActivity {
    Typeface custom_font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delivery);
        setToolbar();


    //    btnClickHandler();
    }


    private void setToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/Ubuntu-M.ttf");
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setTypeface(custom_font);
        mTitle.setText(R.string.update_booked_cylinder_delivery);
        setSupportActionBar(toolbar);
    }



    private void btnClickHandler() {
        Button btnSelectDate = (Button) findViewById(R.id.btnSelectDate);
        Button btnSelectCustomer = (Button) findViewById(R.id.btnSelectCustomer);
        Button btnPaymentStatus = (Button) findViewById(R.id.btnPaymentStatus);
        Button btnUpdateDelivery = (Button) findViewById(R.id.btnUpdateDelivery);

        btnSelectDate.setTypeface(custom_font);
        btnSelectCustomer.setTypeface(custom_font);
        btnPaymentStatus.setTypeface(custom_font);
        btnUpdateDelivery.setTypeface(custom_font);


        btnSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSelectCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPaymentStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnUpdateDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
