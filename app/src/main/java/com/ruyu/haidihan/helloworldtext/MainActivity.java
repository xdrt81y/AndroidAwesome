package com.ruyu.haidihan.helloworldtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruyu.haidihan.helloworldtext.SimpleControl.SimpleControlActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // xml创建控件
        setContentView(R.layout.activity_main);
        final ImageView logoImage = (ImageView)this.findViewById(R.id.logoImageView);
        final EditText userNameEdit = (EditText)this.findViewById(R.id.userNameEditText);
        final EditText passwordEdit = (EditText)this.findViewById(R.id.passwordEditText);
        final Button loginButton = (Button)this.findViewById(R.id.logButton);
        final Button visitorLoginButton = (Button)this.findViewById(R.id.visitorLoginButton);
        logoImage.setVisibility(View.INVISIBLE);
        textView = (TextView)this.findViewById(R.id.msgTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String userName =  userNameEdit.getText().toString();
                String pass = passwordEdit.getText().toString();
                if (userName.equals("Hanhd")  && pass.equals("123")){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, RootActivity.class);
                    startActivity(intent);
                }else{
                    textView.setText("登录失败！");
                }
            }
        });

        visitorLoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, RootActivity.class);
            startActivity(intent);
            }
        });

        /*
        final Button button1 = (Button)this.findViewById(R.id.myButton1);
        final Button button2 = (Button)this.findViewById(R.id.myButton2);
        final Button button3 = (Button)this.findViewById(R.id.myButton3);

        textView = (TextView)this.findViewById(R.id.myTextViewId);

        Resources resource = this.getBaseContext().getResources();
        final Drawable red_Drawable = resource.getDrawable(R.drawable.red);
        final Drawable blue_Drawable = resource.getDrawable(R.drawable.blue);
        final Drawable yellow_Drawable = resource.getDrawable(R.drawable.yellow);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = "You have clicked" + button1.getText().toString();
                textView.setText(str);
                //当单击button1时，修改textview中的文本
                if (textView.getBackground() != red_Drawable) {
                    textView.setBackgroundDrawable(red_Drawable);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = "You have clicked" + button2.getText().toString();
                textView.setText(str);
                //当单击button1时，修改textview中的文本
                if (textView.getBackground() != blue_Drawable) {
                    textView.setBackgroundDrawable(blue_Drawable);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = "You have clicked" + button3.getText().toString();
                textView.setText(str);
                //当单击button1时，修改textview中的文本
                if (textView.getBackground() != yellow_Drawable) {
                    textView.setBackgroundDrawable(yellow_Drawable);
                }
            }
        });
        */

        /*// 代码创建控件
        TextView HelloWorldTextView = new TextView(this);
        HelloWorldTextView.setText("Hello World");
        setContentView(HelloWorldTextView);
        */

    }
}
