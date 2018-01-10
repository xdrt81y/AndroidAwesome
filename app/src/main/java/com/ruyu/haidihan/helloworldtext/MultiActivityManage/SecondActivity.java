package com.ruyu.haidihan.helloworldtext.MultiActivityManage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //接收参数 来自First
        Button btn=(Button)findViewById(R.id.secondButton);
        Intent intent=getIntent();
        String string=intent.getStringExtra("data");
        btn.setText(string);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                returnData();
            }
        });
    }

    private void returnData() {
        Intent intent=new Intent();
        intent.putExtra("returnData", "from Second");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public void onBackPressed() {
    // TODO Auto-generated method stub
        returnData();
    }
}
