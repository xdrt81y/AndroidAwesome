package com.ruyu.haidihan.helloworldtext.SeniorControl;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.R;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        Button buttonNormal = (Button) findViewById(R.id.normalDialogButton);
        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
    }

    private void showNormalDialog(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(DialogActivity.this);
        normalDialog.setIcon(R.drawable.i2);
        normalDialog.setTitle("我是一个普通Dialog");
        normalDialog.setMessage("你要点击哪一个按钮呢?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.setNegativeButton("关闭",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        // 显示
        normalDialog.show();
    }
}
