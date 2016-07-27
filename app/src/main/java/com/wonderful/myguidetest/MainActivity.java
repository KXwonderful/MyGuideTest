package com.wonderful.myguidetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_test1,btn_test2,btn_test3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test1 = (Button) findViewById(R.id.btn_test1);
        btn_test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,DefaultActivity.class);
                startActivity(intent1);
            }
        });

        btn_test2 = (Button) findViewById(R.id.btn_test2);
        btn_test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,CustomActivity.class);
                startActivity(intent2);
            }
        });

        btn_test3 = (Button) findViewById(R.id.btn_test3);
        btn_test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,CustomActivity2.class);
                startActivity(intent2);
            }
        });
    }
}
