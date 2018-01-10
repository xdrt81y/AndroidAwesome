package com.ruyu.haidihan.helloworldtext.SeniorControl;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.ruyu.haidihan.helloworldtext.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Map<String, Object>> dataList;
    private SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = (GridView) findViewById(R.id.gridview);
        //初始化数据
        initData();

        String[] from={"img","text"};

        int[] to={R.id.img,R.id.text};

        adapter=new SimpleAdapter(this, dataList, R.layout.activity_grid_item, from, to);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                AlertDialog.Builder builder= new AlertDialog.Builder(GridViewActivity.this);
                builder.setTitle("提示").setMessage(dataList.get(arg2).get("text").toString()).create().show();
            }
        });
    }

    void initData() {
        //图标
        int icno[] = { R.drawable.brazil, R.drawable.canada, R.drawable.china,
                R.drawable.france, R.drawable.germany, R.drawable.india, R.drawable.iran,
                R.drawable.italy, R.drawable.japan, R.drawable.korea };
        //图标下的文字
        String name[]={"巴西","加拿大","中国","法国","德国","印度","伊朗","意大利","日本","韩国"};
        dataList = new ArrayList<Map<String, Object>>();
        for (int i = 0; i <icno.length; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("img", icno[i]);
            map.put("text",name[i]);
            dataList.add(map);
        }
    }
}
