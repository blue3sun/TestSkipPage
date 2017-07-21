package com.monkey.testskippage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/7/21 16:25
 */

public class ThridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        ((TextView)findViewById(R.id.tv_title)).setText("ThridActivity");
    }
}
