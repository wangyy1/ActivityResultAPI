package com.wyy.activityresultapi;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

/**
 * https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650259811&idx=1&sn=6bb2c84899e6f81337328f385464f421&chksm=8863300cbf14b91a0eab9a6881e2b98a3f1df93949cc5eec3cd92e6a01bd989680d85f7f8d91&scene=178&cur_album_id=1455589563531214850#rd
 */
public class MainActivity extends AppCompatActivity {

    private ActivityResultLauncher resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
        if (result.getResultCode() == RESULT_OK) {
            String data = result.getData().getStringExtra("data");
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        }
    });

    private ActivityResultLauncher resultLauncher2 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), result -> {
        if (result) {
            Toast.makeText(this, "开启", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "关闭", Toast.LENGTH_SHORT).show();
        }
    });

    private ActivityResultLauncher resultLauncher3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {

    });

    private ActivityResultLauncher resultLauncher4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {

    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainBtn = findViewById(R.id.main_btn);
        mainBtn.setOnClickListener((view -> {
//            resultLauncher.launch(new Intent(this, SecondActivity.class));
//            resultLauncher2.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
//            resultLauncher3.launch(new Intent(Intent.ACTION_VIEW));
            resultLauncher4.launch(new Intent(Intent.ACTION_DIAL));
        }));
    }
}