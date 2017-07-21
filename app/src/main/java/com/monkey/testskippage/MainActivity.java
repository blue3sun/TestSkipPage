package com.monkey.testskippage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("testskippage.intent.action.skip");
                intent.addCategory("testskippage.intent.category.skip");
                startActivity(intent);
            }
        });
        ((TextView)findViewById(R.id.tv_title)).setText("MainActivity");
    }
}
