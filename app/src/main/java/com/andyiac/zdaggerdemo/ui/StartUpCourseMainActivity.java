package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseListAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.Course;
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
public class StartUpCourseMainActivity extends AppCompatActivity {

    private RecyclerView mRVCourseTop, mRVCourseBasic, mRVCoursePro;
    private List<Course.DataEntity.TopEntity.CourseEntity> mTopCourse = new ArrayList<>();
    private List<Course.DataEntity.BasicEntity.CourseEntity> mBasicCourse = new ArrayList<>();
    private List<Course.DataEntity.ProEntity.CourseEntity> mProCourse = new ArrayList<>();

    private CourseListAdapter mTopCourseAdapter;

    private ApiClient.ApiServiceInterface apiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main_activity);

        apiService = ApiClient.getApiClient();

        initView();
        initRecycleView();
        initData();
    }

    private void initData() {


        getCourseIndex();
    }

    private void getCourseIndex() {

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
                        mTopCourse.addAll(course.getData().getTop().getCourse());
                        mTopCourseAdapter.notifyDataSetChanged();
                    }
                });
    }


    private void initView() {
        mRVCourseTop = (RecyclerView) findViewById(R.id.id_rv_course_top);
        mRVCourseBasic = (RecyclerView) findViewById(R.id.id_rv_course_basic);
        mRVCoursePro = (RecyclerView) findViewById(R.id.id_rv_course_pro);
    }

    private void initRecycleView() {
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRVCourseTop.setLayoutManager(layoutManager);
        mTopCourseAdapter = new CourseListAdapter(this, mTopCourse);

        mRVCourseTop.setAdapter(mTopCourseAdapter);


    }


}