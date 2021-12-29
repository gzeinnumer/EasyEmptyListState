package com.gzeinnumer.easyemptyliststate.ui.nested;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.gzeinnumer.easyemptyliststate.dapter.DummyAdapterV2;
import com.gzeinnumer.easyemptyliststate.R;
import com.gzeinnumer.eels.EasyEmptyList;

public class NestedActivity extends AppCompatActivity {
    private EasyEmptyList easyEmptyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);

        setTitle("Nested");

        easyEmptyList = findViewById(R.id.easy_empty_list);
        initRVView();
    }

    private void initRVView() {
        DummyAdapterV2 adapter = new DummyAdapterV2(R.layout.item_view, position -> {

        });

        easyEmptyList.rv.setAdapter(adapter);
        easyEmptyList.rv.hasFixedSize();
        easyEmptyList.rv.setLayoutManager(new LinearLayoutManager(this));

        //use list.size();
        //if size == 0 , R.drawable.no_data_custom will SHOW RecyclerView will HIDE
        //if size > 0, R.drawable.no_data_custom will HIDE RecyclerView will SHOW
        easyEmptyList.setSize(1);
        easyEmptyList.setImageEmpty(R.drawable.no_data_custom);
        easyEmptyList.rv.setNestedScrollingEnabled(true); // enable nested
    }
}