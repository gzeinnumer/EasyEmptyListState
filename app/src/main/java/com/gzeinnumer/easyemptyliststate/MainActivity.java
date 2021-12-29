package com.gzeinnumer.easyemptyliststate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.gzeinnumer.eels.EasyEmptyList;

public class MainActivity extends AppCompatActivity {

    private EasyEmptyList easyEmptyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easyEmptyList = findViewById(R.id.easy_empty_list);

        initRVView();
    }

    private void initRVView() {
        DummyAdapterV2 adapter = new DummyAdapterV2(R.layout.item_view, position -> {

        });

//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        easyEmptyList.rv.setAdapter(adapter);
        easyEmptyList.rv.setNestedScrollingEnabled(true);
        easyEmptyList.rv.hasFixedSize();
        easyEmptyList.rv.setLayoutManager(layoutManager);
        easyEmptyList.setSize(1);
        easyEmptyList.setImageEmpty(R.drawable.no_data_custom);
    }
}