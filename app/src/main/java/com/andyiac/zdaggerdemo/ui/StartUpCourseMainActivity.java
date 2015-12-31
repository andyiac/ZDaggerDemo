package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseMainCategoryGridViewAdapter;
import com.andyiac.zdaggerdemo.adapter.CourseMainCourseItemGridViewAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseBanners;
import com.andyiac.zdaggerdemo.data.CourseType;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private GridView mGVCourseCategory;
    private GridView mRVCourseTop, mRVCourseBasic, mRVCoursePro;

    private List<Map<String, Object>> mCourseCategories = new ArrayList<>();
    private List<Course.CourseEntity> mTopCourse = new ArrayList<>();
    private List<Course.CourseEntity> mBasicCourse = new ArrayList<>();
    private List<Course.CourseEntity> mProCourse = new ArrayList<>();

    private CourseMainCategoryGridViewAdapter mCourseCategoryAdapter;
    private CourseMainCourseItemGridViewAdapter mTopCourseAdapter;
    private CourseMainCourseItemGridViewAdapter mBasicCourseAdapter;
    private CourseMainCourseItemGridViewAdapter mProCourseAdapter;

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
        getCourseCategories();
        getCourseIndex();

    }

    private void getCourseCategories() {
        Map<String, Object> category1 = new HashMap<>();
        category1.put("img", R.mipmap.course_1);
        category1.put("name", "财务");
        Map<String, Object> category2 = new HashMap<>();
        category2.put("img", R.mipmap.course_2);
        category2.put("name", "财务");
        Map<String, Object> category3 = new HashMap<>();
        category3.put("img", R.mipmap.course_3);
        category3.put("name", "财务");
        Map<String, Object> category4 = new HashMap<>();
        category4.put("img", R.mipmap.course_4);
        category4.put("name", "财务");
        Map<String, Object> category5 = new HashMap<>();
        category5.put("img", R.mipmap.course_4);
        category5.put("name", "财务");
        Map<String, Object> category6 = new HashMap<>();
        category6.put("img", R.mipmap.course_6);
        category6.put("name", "财务");
        Map<String, Object> category7 = new HashMap<>();
        category7.put("img", R.mipmap.course_8);
        category7.put("name", "财务");
        Map<String, Object> category8 = new HashMap<>();
        category8.put("img", R.mipmap.course_8);
        category8.put("name", "财务");

        mCourseCategories.add(category1);
        mCourseCategories.add(category2);
        mCourseCategories.add(category3);
        mCourseCategories.add(category4);
        mCourseCategories.add(category5);
        mCourseCategories.add(category6);
        mCourseCategories.add(category7);
        mCourseCategories.add(category8);
        mCourseCategoryAdapter.notifyDataSetChanged();
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

        mGVCourseCategory = (GridView) findViewById(R.id.id_gv_course_category);
        mCourseCategoryAdapter = new CourseMainCategoryGridViewAdapter(this, mCourseCategories);
        mGVCourseCategory.setAdapter(mCourseCategoryAdapter);


        mRVCourseTop = (GridView) findViewById(R.id.id_gv_course_top);
        mRVCourseBasic = (GridView) findViewById(R.id.id_gv_course_basic);
        mRVCoursePro = (GridView) findViewById(R.id.id_gv_course_pro);

        mTopCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mTopCourse);
        mBasicCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mBasicCourse);
        mProCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mProCourse);

        mRVCourseTop.setAdapter(mTopCourseAdapter);
        mRVCourseBasic.setAdapter(mBasicCourseAdapter);
        mRVCoursePro.setAdapter(mProCourseAdapter);
    }


}
