package com.andyiac.zdaggerdemo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.andyiac.zdaggerdemo.R;

/**
 * @author andyiac
 * @date 12/31/15
 * @web www.andyiac.com
 */
public class CourseDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details_activity);
    }

    public static void startIntent(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, CourseDetailsActivity.class);
        context.startActivity(intent);
    }
}
