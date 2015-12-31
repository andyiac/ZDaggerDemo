package com.andyiac.zdaggerdemo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.api.ApiClient;
import com.andyiac.zdaggerdemo.data.CourseDetails;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.orhanobut.logger.Logger;

import rx.Observer;
import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * @author andyiac
 * @date 12/31/15
 * @web www.andyiac.com
 */
public class CourseDetailsActivity extends AppCompatActivity {

    private ApiClient.ApiServiceInterface apiService;
    private int currentCourseId;


    private TextView mTeacherName, mTeacherWork, mTeacherDesc;
    private ImageView mTeacherPhoto;

    private TextView mCourseContent, mCourseTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details_activity);
        apiService = ApiClient.getApiClient();

        Intent intent = getIntent();
        currentCourseId = intent.getIntExtra("course_id", -1);

        if (currentCourseId != -1) getCourseDetails(currentCourseId);

        initView();

    }

    private void initView() {
        mTeacherPhoto = (ImageView) findViewById(R.id.id_course_details_author_avatar);
        mTeacherName = (TextView) findViewById(R.id.id_course_details_author_name);
        mTeacherWork = (TextView) findViewById(R.id.id_course_details_author_work);
        mTeacherDesc = (TextView) findViewById(R.id.id_course_details_author_desc);

        mCourseTitle = (TextView) findViewById(R.id.id_course_details_title);
        mCourseContent = (TextView) findViewById(R.id.id_course_details_content);
    }

    public static void startIntent(Context context, int course_id) {
        Intent intent = new Intent();
        intent.setClass(context, CourseDetailsActivity.class);
        intent.putExtra("course_id", course_id);
        context.startActivity(intent);

    }


    private void getCourseDetails(final int course_id) {
        AppObservable.bindActivity(this, apiService.getCourseDetails(String.valueOf(course_id)))
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

                        updateView(courseDetails);
                    }
                });
    }

    private void updateView(CourseDetails courseDetails) {

        mTeacherName.setText(courseDetails.getData().getTeacher().getName());
        mTeacherWork.setText(courseDetails.getData().getTeacher().getWork());
        mTeacherDesc.setText(courseDetails.getData().getTeacher().getDesc());
        ImageLoader.getInstance().displayImage(courseDetails.getData().getTeacher().getPhoto(), mTeacherPhoto);

        mCourseTitle.setText(courseDetails.getData().getTitle());
        mCourseContent.setText(courseDetails.getData().getContent());

    }
}
