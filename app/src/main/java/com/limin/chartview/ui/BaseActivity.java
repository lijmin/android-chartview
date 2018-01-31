package com.limin.chartview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lijiamin on 18/1/28.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView();
        initView();
        initData();
        addListener();

    }


    protected abstract void setContentView();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void addListener();

}
