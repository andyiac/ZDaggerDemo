package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseListAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseBanners;
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
    private List<Course.CourseEntity> mTopCourse = new ArrayList<>();
    private List<Course.CourseEntity> mBasicCourse = new ArrayList<>();
    private List<Course.CourseEntity> mProCourse = new ArrayList<>();

    private CourseListAdapter mTopCourseAdapter;
    private CourseListAdapter mBasicCourseAdapter;
    private CourseListAdapter mProCourseAdapter;

    private ApiClient.ApiServiceInterface apiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main_activity);

        apiService = ApiClient.getApiClient();

        initView();

        initData();
    }

    private void initData() {
        getCourseBanners();
        getCourseIndex();
    }


    public void getCourseBanners() {
        AppObservable.bindActivity(this, apiService.getCourseBanners())
                .map(new Func1<CourseBanners, CourseBanners>() {
                    @Override
                    public CourseBanners call(CourseBanners courseBanners) {
                        return courseBanners;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CourseBanners>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CourseBanners courseBanners) {
                        Logger.json(JSON.toJSONString(courseBanners));

                    }
                });
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

                        mBasicCourse.addAll(course.getData().getBasic().getCourse());
                        mBasicCourseAdapter.notifyDataSetChanged();

                        mProCourse.addAll(course.getData().getPro().getCourse());
                        mProCourseAdapter.notifyDataSetChanged();

                    }
                });
    }


    private void initView() {
        mRVCourseTop = (RecyclerView) findViewById(R.id.id_rv_course_top);
        mRVCourseBasic = (RecyclerView) findViewById(R.id.id_rv_course_basic);
        mRVCoursePro = (RecyclerView) findViewById(R.id.id_rv_course_pro);

        initTopRecycleView();
        initBasicRecycleView();
        initProRecycleView();

    }

    private void initTopRecycleView() {
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRVCourseTop.setLayoutManager(layoutManager);
        mTopCourseAdapter = new CourseListAdapter(this, mTopCourse);
        mRVCourseTop.setAdapter(mTopCourseAdapter);
    }


    private void initBasicRecycleView() {
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRVCourseBasic.setLayoutManager(layoutManager);
        mBasicCourseAdapter = new CourseListAdapter(this, mBasicCourse);
        mRVCourseBasic.setAdapter(mBasicCourseAdapter);

    }

    private void initProRecycleView() {
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRVCoursePro.setLayoutManager(layoutManager);
        mProCourseAdapter = new CourseListAdapter(this, mProCourse);
        mRVCoursePro.setAdapter(mProCourseAdapter);

    }


}
