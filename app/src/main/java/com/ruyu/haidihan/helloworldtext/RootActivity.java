package com.ruyu.haidihan.helloworldtext;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.LayoutActivity.LayoutViewActivity;
import com.ruyu.haidihan.helloworldtext.MultiActivityManage.FirstActivity;
import com.ruyu.haidihan.helloworldtext.Network.NetworkDemoActivity;
import com.ruyu.haidihan.helloworldtext.SQLite.SQLiteActivity;
import com.ruyu.haidihan.helloworldtext.SeniorControl.SeniorControlActivity;
import com.ruyu.haidihan.helloworldtext.SimpleControl.SimpleControlActivity;

public class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        // 跳转到简单控件
        final Button simpleControlButton = (Button)this.findViewById(R.id.simpleControlButton);
        simpleControlButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RootActivity.this, SimpleControlActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到高级控件
        final Button seniorControlButton = (Button)this.findViewById(R.id.seniorControlButton);
        seniorControlButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RootActivity.this, SeniorControlActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到页面布局
        final Button layoutButton = (Button)this.findViewById(R.id.layoutButton);
        layoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RootActivity.this, LayoutViewActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到多页面管理
        final Button mutilActivityManageButton = (Button)this.findViewById(R.id.mutilActivityManageButton);
        mutilActivityManageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //1、构造方法传入Component，最常用的方式
//                Intent intent = new Intent(RootActivity.this, FirstActivity.class);

                //2、setComponent方法
                //ComponentName componentName = new ComponentName(RootActivity.this, FirstActivity.class);
                ComponentName componentName = new ComponentName(RootActivity.this, "com.ruyu.haidihan.helloworldtext.MultiActivityManage.FirstActivity");
                // 或者ComponentName componentName = new ComponentName(this.getPackageName(), "com.example.app016.FirstActivity");

                Intent intent = new Intent();
                intent.setComponent(componentName);

                //3、setClass/setClassName方法
                //Intent intent = new Intent();
                //intent.setClass(RootActivity.this, FirstActivity.class);


                startActivity(intent);

            }
        });

        // 跳转到网络请求Demo页面
        final Button networkButton = (Button)this.findViewById(R.id.networkButton);
        networkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RootActivity.this, NetworkDemoActivity.class);
                startActivity(intent);

            }
        });

        // 跳转到本地请求Demo页面
        final Button sqliteButton = (Button)this.findViewById(R.id.sqliteButton);
        sqliteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RootActivity.this, SQLiteActivity.class);
                startActivity(intent);

            }
        });
    }
}
