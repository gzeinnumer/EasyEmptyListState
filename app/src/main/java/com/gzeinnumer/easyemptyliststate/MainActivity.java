package com.gzeinnumer.easyemptyliststate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gzeinnumer.easyemptyliststate.ui.nested.NestedActivity;
import com.gzeinnumer.easyemptyliststate.ui.noNested.NoNestedActivity;
import com.gzeinnumer.eels.EasyEmptyList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_nested).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), NestedActivity.class));
        });
        findViewById(R.id.btn_no_nested).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), NoNestedActivity.class));
        });
    }
}