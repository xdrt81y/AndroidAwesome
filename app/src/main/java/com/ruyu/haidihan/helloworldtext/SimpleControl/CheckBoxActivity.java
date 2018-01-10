package com.ruyu.haidihan.helloworldtext.SimpleControl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.ruyu.haidihan.helloworldtext.R;

//public class CheckBoxActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_check_box);
//    }
//}

public class CheckBoxActivity extends AppCompatActivity {


    private CheckBox checkbox_all;
    private CheckBox checkbox_lanqiu;
    private CheckBox checkbox_zuqiu;
    private CheckBox checkbox_paiqiu;
    private CheckBox checkbox_pingpangqiu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        /**
         * 初始化控件
         */
        initView();

        /**
         * 监听事件
         */
        listener();
    }
    private void listener() {


        checkbox_all.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkbox_lanqiu.setChecked(true);
                    checkbox_zuqiu.setChecked(true);
                    checkbox_paiqiu.setChecked(true);
                    checkbox_pingpangqiu.setChecked(true);
                }else{
                    checkbox_lanqiu.setChecked(false);
                    checkbox_paiqiu.setChecked(false);
                    checkbox_zuqiu.setChecked(false);
                    checkbox_pingpangqiu.setChecked(false);

                }

            }
        });

    }
    private void initView() {

        checkbox_all=(CheckBox) findViewById(R.id.checkbox_all);
        checkbox_lanqiu=(CheckBox) findViewById(R.id.checkbox_lanqiu);
        checkbox_zuqiu=(CheckBox) findViewById(R.id.checkbox_zuqiu);
        checkbox_paiqiu=(CheckBox) findViewById(R.id.checkbox_paiqiu);
        checkbox_pingpangqiu=(CheckBox) findViewById(R.id.checkbox_pingpang);
    }
}
