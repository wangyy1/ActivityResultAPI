package com.wyy.activityresultapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GetDataFromSecondActivity extends ActivityResultContract<Void, String> {

    @NonNull
    @Override
    public Intent createIntent(@NonNull Context context, Void input) {
        return new Intent(context, SecondActivity.class);
    }

    @Override
    public String parseResult(int resultCode, @Nullable Intent intent) {
        if (resultCode == Activity.RESULT_OK) {
            if (intent != null) {
                return intent.getStringExtra("data");
            }
        }
        return null;
    }
}
