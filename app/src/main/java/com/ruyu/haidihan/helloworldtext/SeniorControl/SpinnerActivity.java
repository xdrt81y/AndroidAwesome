package com.ruyu.haidihan.helloworldtext.SeniorControl;


import java.util.ArrayList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.ruyu.haidihan.helloworldtext.R;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinnerButton;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinnerButton = (Spinner) findViewById(R.id.spinnerButton);
        spinner = (Spinner) findViewById(R.id.spinner2);

        /*静态的显示下来出来的菜单选项，显示的数组元素提前已经设置好了
         * 第二个参数：已经编写好的数组
         * 第三个数据：默认的样式
         */
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.number_array, android.R.layout.simple_spinner_item);
        //设置spinner中每个条目的样式，同样是引用android提供的布局文件
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerButton.setAdapter(adapter);
        spinnerButton.setPrompt("测试");
        spinnerButton.setOnItemSelectedListener(new spinnerListener());

        /*
         * 动态添显示下来菜单的选项，可以动态添加元素
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("1.苹果");
        list.add("2.橘子");
        /*
         * 第二个参数是显示的布局
         * 第三个参数是在布局显示的位置id
         * 第四个参数是将要显示的数据
         */
        ArrayAdapter adapter2 = new ArrayAdapter(this, R.layout.activity_spinner_item, R.id.textview,list);
        spinner.setAdapter(adapter2);
        spinner.setOnItemSelectedListener(new spinner2Listener());
    }

    class spinnerListener implements android.widget.AdapterView.OnItemSelectedListener{


        @Override
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int position, long id) {
            //将选择的元素显示出来
            String selected = parent.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            System.out.println("nothingSelect");
        }
    }
    class spinner2Listener implements android.widget.AdapterView.OnItemSelectedListener{


        @Override
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int position, long id) {
            String selected = parent.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            System.out.println("nothingSelect");
        }
    }
}
