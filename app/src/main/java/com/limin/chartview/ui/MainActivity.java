package com.limin.chartview.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.jimmylee.pieview.Part;
import com.jimmylee.pieview.PieView;
import com.limin.chartview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private PieView pieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        pieView = findViewById(R.id.pieView);
    }

    @Override
    protected void initData() {
        List<Part> parts = new ArrayList<>();
        parts.add(new Part(60, ContextCompat.getColor(this, R.color.colorPrimary)));
        parts.add(new Part(100, Color.GREEN));
        parts.add(new Part(100, Color.TRANSPARENT));
        parts.add(new Part(100, 0xffff0000));
        pieView.setParts(parts);
    }

    @Override
    protected void addListener() {

    }
}
