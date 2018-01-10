package com.ruyu.haidihan.helloworldtext.SeniorControl.CustomListItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.ruyu.haidihan.helloworldtext.R;

public class CustomListItemActivity extends AppCompatActivity {
    private ArrayList<ProductModel> productList = new  ArrayList<ProductModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_item);
        createProductList();

        ProductAdapter adapter = new ProductAdapter(CustomListItemActivity.this, R.layout.activity_custom_item, productList);
        ListView listView = (ListView)findViewById(R.id.second_list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProductModel product = productList.get(position);
                Toast.makeText(CustomListItemActivity.this, product.productName, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private  void createProductList() {
        for (int i=0; i<20; i++) {
            ProductModel product = new ProductModel();
            product.productName = "产品名称" + i;
            if (i % 2 == 0){
                product.productBuyState = "认购中";
            } else {
                product.productBuyState = "认购成功";
            }
            product.lendMoney = "" + (i * 100 + i);
            product.interest = "" + (i * 10);
            if (i < 10) {
                product.endDate = "2016-01-0" + i;
            } else {
                product.endDate = "2016-01-" + i;
            }
            productList.add(i, product);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custome_item_list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
