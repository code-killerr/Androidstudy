package com.example.administrator.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.first_layout);//资源会在R文件中生成ID此时调用该方法可以得到相关布局id放入setContentView中展现
}
}
