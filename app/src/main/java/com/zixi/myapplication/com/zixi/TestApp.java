package com.zixi.myapplication.com.zixi;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zixi.myapplication.R;

public class TestApp extends AppCompatActivity {

    private static int VALUES[] = {0,1,2,0,0,2};
    private static String STR_VALUES[] = {"Alpha", "Zixi demo", "Android colors", "More text", "Video", "Audio"};
    private ListView _list_view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        _list_view = findViewById(R.id.main_list_view);
    }
}
