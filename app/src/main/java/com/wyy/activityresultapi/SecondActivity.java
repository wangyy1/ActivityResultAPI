package com.wyy.activityresultapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.second_btn).setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("data", "data form SecondActivity");
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}