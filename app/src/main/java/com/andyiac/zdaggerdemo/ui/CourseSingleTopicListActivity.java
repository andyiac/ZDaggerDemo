package com.andyiac.zdaggerdemo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.adapter.CourseSingleTopicListAdapter;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.AllCourses;
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
public class CourseSingleTopicListActivity extends AppCompatActivity {

    private ApiClient.ApiServiceInterface apiService;
    private RecyclerView mRecycleView;
    private CourseSingleTopicListAdapter mAdapter;
    private List<AllCourses.DataEntity> courses = new ArrayList<>();

    private int whichCategory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_single_topic_list_activity);
        apiService = ApiClient.getApiClient();

        Intent intent = getIntent();
        whichCategory = intent.getIntExtra("category", -1);

        initView();
        getAllCourses();
    }

    public static void startIntent(Context context, int courseCategory) {

        Intent intent = new Intent();
        intent.putExtra("category", courseCategory);
        intent.setClass(context, CourseSingleTopicListActivity.class);
        context.startActivity(intent);
    }

    private void initView() {
        mRecycleView = (RecyclerView) findViewById(R.id.id_rv_course_single_topic_list);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRecycleView.setLayoutManager(manager);
        mAdapter = new CourseSingleTopicListAdapter(this, courses);
        mRecycleView.setAdapter(mAdapter);

        mAdapter.setOnICourseItemClickListener(new CourseSingleTopicListAdapter.ICourseItemClickListener() {
            @Override
            public void onClick(int course_id) {
                CourseDetailsActivity.startIntent(CourseSingleTopicListActivity.this, course_id);
            }
        });


    }

    private void getAllCourses() {
        AppObservable.bindActivity(this, apiService.getAllCourses(1, 50, whichCategory))
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
                        courses.addAll(allCourses.getData());
                        mAdapter.notifyDataSetChanged();
                    }
                });
    }


}
