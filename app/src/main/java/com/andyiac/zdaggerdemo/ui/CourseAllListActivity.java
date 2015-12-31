package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseAllListGridViewAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.CourseType;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseAllListActivity extends AppCompatActivity {

    ApiClient.ApiServiceInterface apiService;
    private GridView mGlBasicCourse, mGlProCourse;
    private CourseAllListGridViewAdapter basicCourseAdapter;
    private CourseAllListGridViewAdapter proCourseAdapter;

    private List<CourseType.TypeEntity> mBasicCourse = new ArrayList<>();
    private List<CourseType.TypeEntity> mProCourse = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_all_list_activity);
        apiService = ApiClient.getApiClient();

        initView();
        initData();
    }

    private void initView() {
        basicCourseAdapter = new CourseAllListGridViewAdapter(this, mBasicCourse);
        proCourseAdapter = new CourseAllListGridViewAdapter(this, mProCourse);
        mGlBasicCourse = (GridView) findViewById(R.id.gl_course_all_basic);
        mGlProCourse = (GridView) findViewById(R.id.gl_course_all_pro);
        mGlBasicCourse.setAdapter(basicCourseAdapter);
        mGlProCourse.setAdapter(proCourseAdapter);
    }

    private void initData() {

        AppObservable.bindActivity(this, apiService.getCourseTypes())
                .map(new Func1<CourseType, CourseType>() {
                    @Override
                    public CourseType call(CourseType courseType) {
                        return courseType;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CourseType>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CourseType courseType) {
                        Logger.json(JSON.toJSONString(courseType));

                        mBasicCourse.addAll(courseType.getData().getType_basic());
                        basicCourseAdapter.notifyDataSetChanged();

                        mProCourse.addAll(courseType.getData().getType_pro());
                        proCourseAdapter.notifyDataSetChanged();


                    }
                });


    }

}

