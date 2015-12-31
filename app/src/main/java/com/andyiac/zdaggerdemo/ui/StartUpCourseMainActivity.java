package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseMainCategoryGridViewAdapter;
import com.andyiac.zdaggerdemo.adapter.CourseMainCourseItemGridViewAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseBanners;
import com.andyiac.zdaggerdemo.ui.misc.NetworkImageHolderView;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
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

    private ConvenientBanner mBanner;
    private GridView mGVCourseCategory;
    private GridView mGVCourseTop, mRVCourseBasic, mRVCoursePro;

    private List<String> bannerImages = new ArrayList<>();

    private List<Map<String, Object>> mCourseCategories = new ArrayList<>();
    private List<Course.CourseEntity> mTopCourseList = new ArrayList<>();
    private List<Course.CourseEntity> mBasicCourseList = new ArrayList<>();
    private List<Course.CourseEntity> mProCourseList = new ArrayList<>();

    private CourseMainCategoryGridViewAdapter mCourseCategoryAdapter;
    private CourseMainCourseItemGridViewAdapter mTopCourseAdapter;
    private CourseMainCourseItemGridViewAdapter mBasicCourseAdapter;
    private CourseMainCourseItemGridViewAdapter mProCourseAdapter;

    private ApiClient.ApiServiceInterface apiService;
    private CourseBanners mCourseBannerData;

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
        category2.put("name", "融资");
        Map<String, Object> category3 = new HashMap<>();
        category3.put("img", R.mipmap.course_3);
        category3.put("name", "法律");
        Map<String, Object> category4 = new HashMap<>();
        category4.put("img", R.mipmap.course_4);
        category4.put("name", "人力");
        Map<String, Object> category5 = new HashMap<>();
        category5.put("img", R.mipmap.course_4);
        category5.put("name", "产品");
        Map<String, Object> category6 = new HashMap<>();
        category6.put("img", R.mipmap.course_6);
        category6.put("name", "运营");
        Map<String, Object> category7 = new HashMap<>();
        category7.put("img", R.mipmap.course_8);
        category7.put("name", "财务");
        Map<String, Object> category8 = new HashMap<>();
        category8.put("img", R.mipmap.course_8);
        category8.put("name", "更多");

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

                        mCourseBannerData = courseBanners;
                        for (CourseBanners.DataEntity entity : courseBanners.getData()) {

                            Logger.e(entity.getPhoto());
                            bannerImages.add(entity.getPhoto());
                        }

                        setUpBanner(bannerImages);
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
                        mTopCourseList.addAll(course.getData().getTop().getCourse());
                        mTopCourseAdapter.notifyDataSetChanged();

                        mBasicCourseList.addAll(course.getData().getBasic().getCourse());
                        mBasicCourseAdapter.notifyDataSetChanged();

                        mProCourseList.addAll(course.getData().getPro().getCourse());
                        mProCourseAdapter.notifyDataSetChanged();

                    }
                });
    }


    private void initView() {
        mBanner = (ConvenientBanner) findViewById(R.id.id_course_main_banner);

        setUpBanner(null);

        mGVCourseCategory = (GridView) findViewById(R.id.id_gv_course_category);
        mCourseCategoryAdapter = new CourseMainCategoryGridViewAdapter(this, mCourseCategories);
        mGVCourseCategory.setAdapter(mCourseCategoryAdapter);


        mGVCourseTop = (GridView) findViewById(R.id.id_gv_course_top);
        mRVCourseBasic = (GridView) findViewById(R.id.id_gv_course_basic);
        mRVCoursePro = (GridView) findViewById(R.id.id_gv_course_pro);

        mTopCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mTopCourseList);
        mBasicCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mBasicCourseList);
        mProCourseAdapter = new CourseMainCourseItemGridViewAdapter(this, mProCourseList);

        mGVCourseTop.setAdapter(mTopCourseAdapter);
        mRVCourseBasic.setAdapter(mBasicCourseAdapter);
        mRVCoursePro.setAdapter(mProCourseAdapter);


        // set up on click event
        mGVCourseCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 7) {
                    // more category
                    CourseAllListActivity.startIntent(StartUpCourseMainActivity.this);
                } else {
                    CourseSingleTopicListActivity.startIntent(StartUpCourseMainActivity.this, position + 1);
                }
            }
        });

        mTopCourseAdapter.setOnCourseItemClickListener(new CourseMainCourseItemGridViewAdapter.OnCourseItemClickInterface() {
            @Override
            public void onClick(int course_id) {
                CourseDetailsActivity.startIntent(StartUpCourseMainActivity.this, course_id);
            }
        });

        mBasicCourseAdapter.setOnCourseItemClickListener(new CourseMainCourseItemGridViewAdapter.OnCourseItemClickInterface() {
            @Override
            public void onClick(int course_id) {
                CourseDetailsActivity.startIntent(StartUpCourseMainActivity.this, course_id);
            }
        });
        mProCourseAdapter.setOnCourseItemClickListener(new CourseMainCourseItemGridViewAdapter.OnCourseItemClickInterface() {
            @Override
            public void onClick(int course_id) {
                CourseDetailsActivity.startIntent(StartUpCourseMainActivity.this, course_id);
            }
        });

    }

    private void setUpBanner(List<String> images) {

        final NetworkImageHolderView holderView = new NetworkImageHolderView();

        mBanner.setPages(new CBViewHolderCreator() {
            @Override
            public Object createHolder() {
                return holderView;
            }
        }, images == null ? bannerImages : images);
        mBanner.setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);
        mBanner.setPageIndicator(new int[]{R.drawable.ic_page_indicator, R.drawable.ic_page_indicator_focused});
        if (images != null && images.size() > 1) mBanner.startTurning(5000);

        holderView.setOnImageClickListener(new NetworkImageHolderView.OnImageClickListener() {
            @Override
            public void onClick(int position) {
                Logger.e(mCourseBannerData.getData().get(position).getUid() + "");
                CourseDetailsActivity.startIntent(StartUpCourseMainActivity.this, mCourseBannerData.getData().get(position).getUid());
            }
        });

    }


}

