package com.gzeinnumer.eels;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class EasyEmptyList extends LinearLayout {
    private final Context _context;
    public RecyclerView rv;
    public ImageView imageView;
    public CardView cardView;
    private int size = 0;
    private int emptyImage = R.drawable.no_data;

    public EasyEmptyList(Context context) {
        this(context, null);
    }

    public EasyEmptyList(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this._context = context;
        initView();
    }

    private void initView() {
        inflate(_context, R.layout.easy_empty_list, this);

        rv = findViewById(R.id.rv);
        imageView = findViewById(R.id.img_empty);
        cardView = findViewById(R.id.cv);
        setSize(size);
        setImage();
    }

    private void setImage() {
        imageView.setImageDrawable(ContextCompat.getDrawable(_context, emptyImage));
    }

    public void setSize(int size) {
        this.size = size;

        visilityItem();
    }

    private void visilityItem() {
        if (size > 0) {
            cardView.setVisibility(GONE);
            rv.setVisibility(VISIBLE);
        } else {
            cardView.setVisibility(VISIBLE);
            rv.setVisibility(GONE);
        }
    }

    public void setImageEmpty(int drawable){
        this.emptyImage = drawable;
        setImage();
    }
}
