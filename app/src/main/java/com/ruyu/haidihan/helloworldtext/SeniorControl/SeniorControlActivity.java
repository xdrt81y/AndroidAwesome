package com.ruyu.haidihan.helloworldtext.SeniorControl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.R;
import com.ruyu.haidihan.helloworldtext.SeniorControl.CustomListItem.CustomListItemActivity;

public class SeniorControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_control);

        // 跳转到AutocompletionActivity
        final Button autocompletionButton = (Button)this.findViewById(R.id.autocompletionButton);
        autocompletionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, AutocompletionActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到ListActivity
        final Button listViewButton = (Button)this.findViewById(R.id.listViewButton);
        listViewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, ListViewActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到GridActivity
        final Button gridViewButton = (Button)this.findViewById(R.id.gridViewButton);
        gridViewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, GridViewActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到AdapterActivity
        final Button AdapterButton = (Button)this.findViewById(R.id.adapterButton);
        AdapterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, AdapterActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到SpinnerActivity
        final Button spinnerButton = (Button)this.findViewById(R.id.spinnerButton);
        spinnerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, SpinnerActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到GalleryActivity
        final Button galleryButton = (Button)this.findViewById(R.id.gallaryButton);
        galleryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, GalleryActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到ScrollActivity
        final Button scrollButton = (Button)this.findViewById(R.id.scrollViewButton);
        scrollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, ScrollViewActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到DialogActivity
        final Button dialogButton = (Button)this.findViewById(R.id.dialogButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, DialogActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到CustomListActivity
        final Button customListButton = (Button)this.findViewById(R.id.customListButton);
        customListButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SeniorControlActivity.this, CustomListItemActivity.class);
                startActivity(intent);

            }
        });
    }
}
