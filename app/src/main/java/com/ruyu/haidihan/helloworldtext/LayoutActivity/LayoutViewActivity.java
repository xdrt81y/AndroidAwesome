package com.ruyu.haidihan.helloworldtext.LayoutActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruyu.haidihan.helloworldtext.R;

public class LayoutViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_view);

        // 跳转到线性布局（LinearLayout）
        final Button linearLayoutButton = (Button)this.findViewById(R.id.linearLayoutButton);
        linearLayoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LayoutViewActivity.this, LinearLayoutActivity.class);
                startActivity(intent);

            }
        });
        // 跳转到相对布局（RelativeLayout）
        final Button relativeLayoutButton = (Button)this.findViewById(R.id.relativeLayoutButton);
        relativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LayoutViewActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);

            }
        });
        // 跳转到帧布局（FrameLayout）、
        final Button frameLayoutButton = (Button)this.findViewById(R.id.frameLayoutButton);
        frameLayoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LayoutViewActivity.this, FrameLayoutActivity.class);
                startActivity(intent);

            }
        });
        // 跳转到表格布局(TableLayout)
        final Button tableLayoutButton = (Button)this.findViewById(R.id.tableLayoutButton);
        tableLayoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LayoutViewActivity.this, TableLayoutActivity.class);
                startActivity(intent);

            }
        });
    }
}
