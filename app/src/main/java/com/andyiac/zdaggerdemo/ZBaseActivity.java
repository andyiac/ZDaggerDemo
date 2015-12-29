package com.andyiac.zdaggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */
public abstract class ZBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
    }

    protected abstract void setupActivityComponent();
}
