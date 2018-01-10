package com.ruyu.haidihan.helloworldtext.SimpleControl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ruyu.haidihan.helloworldtext.R;


public class RadioButtonActivity extends AppCompatActivity {
    TextView tv = null;//根据不同选项所要变更的文本控件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        //根据ID找到该文本控件
        tv = (TextView)this.findViewById(R.id.tvSex);
        //根据ID找到RadioGroup实例
        RadioGroup group = (RadioGroup)this.findViewById(R.id.radioGroup);
        //绑定一个匿名监听器
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                // TODO Auto-generated method stub
                //获取变更后的选中项的ID
                int radioButtonId = arg0.getCheckedRadioButtonId();
                //根据ID获取RadioButton的实例
                RadioButton rb = (RadioButton)RadioButtonActivity.this.findViewById(radioButtonId);
                //更新文本内容，以符合选中项
                tv.setText("您的性别是：" + rb.getText());
            }
        });
    }
}
