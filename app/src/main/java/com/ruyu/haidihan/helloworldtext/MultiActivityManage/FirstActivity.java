package com.ruyu.haidihan.helloworldtext.MultiActivityManage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ruyu.haidihan.helloworldtext.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // 跳转到页面布局
        final Button secondActivityButton = (Button)this.findViewById(R.id.secondActivityButton);
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 使用隐式Intent，ACTION_SECOND在AndroidManifest.xml定义
                Intent intent = new Intent();
                intent.setAction("ACTION_SECOND");
                // 向Second传递参数
                intent.putExtra("data", "from first");
                //startActivity(intent);
                //如果你想在Activity中得到新打开Activity关闭后返回的数据
                startActivityForResult(intent, 1);

            }
        });

        // 跳转到页面布局
        final Button fragmentActivityButton = (Button)this.findViewById(R.id.fragmentActivityButton);
        fragmentActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FirstActivity.this,FragmentMainActivity.class);
                startActivity(intent);

            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    // TODO Auto-generated method stub
        switch (requestCode) {
            case 1:
                if(resultCode==RESULT_OK){
                    String string=data.getStringExtra("returnData");
                    Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
