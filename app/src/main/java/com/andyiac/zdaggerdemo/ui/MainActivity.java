package com.andyiac.zdaggerdemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.AllCourses;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseBanners;
import com.andyiac.zdaggerdemo.data.CourseDetails;
import com.andyiac.zdaggerdemo.data.CourseLikeCount;
import com.andyiac.zdaggerdemo.data.CourseType;
import com.orhanobut.logger.Logger;


import rx.Observer;
import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {


    ApiClient.ApiServiceInterface apiService;

    private Button mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = ApiClient.getApiClient();
    }


    public void onClickGetCourseIndex(View view) {

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


    public void onClickGetCourseTypes(View view) {

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

                    }
                });
    }

    public void onClickGetAllCourses(View view) {
        AppObservable.bindActivity(this, apiService.getAllCourses())
                .map(new Func1<AllCourses, AllCourses>() {
                    @Override
                    public AllCourses call(AllCourses allCourses) {
                        return allCourses;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AllCourses>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(AllCourses allCourses) {
                        Logger.json(JSON.toJSONString(allCourses));
                    }
                });
    }

    public void onClickGetCourseDetails(View view) {
        AppObservable.bindActivity(this, apiService.getCourseDetails("73"))
                .map(new Func1<CourseDetails, CourseDetails>() {
                    @Override
                    public CourseDetails call(CourseDetails courseDetails) {
                        return courseDetails;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CourseDetails>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CourseDetails courseDetails) {
                        Logger.json(JSON.toJSONString(courseDetails));
                    }
                });

    }

    public void onClickCourseLikeCount(View view) {
        AppObservable.bindActivity(this, apiService.getCourseLikeCount("74"))
                .map(new Func1<CourseLikeCount, CourseLikeCount>() {
                    @Override
                    public CourseLikeCount call(CourseLikeCount courseLikeCount) {
                        return courseLikeCount;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CourseLikeCount>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CourseLikeCount courseLikeCount) {
                        Logger.json(JSON.toJSONString(courseLikeCount));
                    }
                });


    }

    public void onClickGetCourseBanners(View view) {
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


    public void onClickCourseActivity(View view) {
        Intent intent = new Intent(this, StartUpCourseMainActivity.class);
        startActivity(intent);
    }

    public void onClickCourseSingleTopicListActivity(View view) {
        Intent intent = new Intent(this, CourseSingleTopicListActivity.class);
        startActivity(intent);
    }
}
