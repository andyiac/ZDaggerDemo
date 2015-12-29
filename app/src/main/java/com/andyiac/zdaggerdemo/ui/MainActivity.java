package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.ClientApplication;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.ZBaseActivity;
import com.andyiac.zdaggerdemo.api.ApiService;
import com.andyiac.zdaggerdemo.data.Course;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import rx.Observer;
import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {


    @Inject
    ApiService apiService;

    private Button mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClientApplication.get(MainActivity.this).getApplicationComponent().inject(this);

        mBtnTest = (Button) findViewById(R.id.btn_test);
        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });
    }


    private void getData() {

        System.out.println("==============");
        System.out.println(apiService);

        AppObservable.bindActivity(this, apiService.getCourseIndex())
                .map(new Func1<Course, Course>() {
                    @Override
                    public Course call(Course course) {
                        return course;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Course>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Course course) {
                        Logger.json(JSON.toJSONString(course));
                    }
                });
    }


}
