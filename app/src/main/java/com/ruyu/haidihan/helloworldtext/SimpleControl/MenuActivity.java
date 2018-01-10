package com.ruyu.haidihan.helloworldtext.SimpleControl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ruyu.haidihan.helloworldtext.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        EditText et1= (EditText) findViewById(R.id.etMenu1);
        EditText et2= (EditText) findViewById(R.id.etMenu2);
        registerForContextMenu(et1);
        registerForContextMenu(et2);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.i("dayang","打开Menu时执行该方法");
        return super.onPrepareOptionsMenu(menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.i("dayang","onCreateOptionsMenu");
        //创建Menu菜单
        getMenuInflater().inflate(R.menu.menu_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i("dayang","选择列表项时执行------------");
        //对菜单项点击内容进行设置
        int id = item.getItemId();
        if (id == R.id.openMenu) {
            Toast.makeText(this,"打开文件",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"关闭文件",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v.getId()==R.id.etMenu1){
            getMenuInflater().inflate(R.menu.menu_menu,menu);
        }else if(v.getId()==R.id.etMenu2){
            getMenuInflater().inflate(R.menu.menu_menu2,menu);
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return true;
    }

}
