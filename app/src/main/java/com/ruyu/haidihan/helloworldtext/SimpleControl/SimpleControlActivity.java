package com.ruyu.haidihan.helloworldtext.SimpleControl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.R;

public class SimpleControlActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_control);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 跳转到RadioButtonActivity
        final Button radioButton = (Button)this.findViewById(R.id.radioButton);
        radioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SimpleControlActivity.this, RadioButtonActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到checkboxactivity
        final Button checkboxButton = (Button)this.findViewById(R.id.checkboxButton);
        checkboxButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SimpleControlActivity.this, CheckBoxActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到menuactivity
        final Button menuButton = (Button)this.findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SimpleControlActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
