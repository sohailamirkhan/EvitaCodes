package com.evitasoft.mechanic;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Typeface custom_font;
    private Button btnRegister;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setToolbar();
        initID();

        btnRegisterHandler();
    }


    private void setToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/Ubuntu-M.ttf");
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setTypeface(custom_font);
        mTitle.setText(R.string.register_evita_mechanics);
        setSupportActionBar(toolbar);
    }


    private void initID() {
         btnRegister = (Button) findViewById(R.id.btnRegister);
        progress = (ProgressBar) findViewById(R.id.progressBar);

    }

    private void btnRegisterHandler() {


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setVisibility(View.VISIBLE);
            }
        });
    }
}
