package com.andyiac.zdaggerdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.andyiac.zdaggerdemo.api.ApiClient;

import java.util.Observable;

import rx.android.app.AppObservable;

/**
 * @author andyiac
 * @date 1/4/16
 * @web www.andyiac.com
 */
public class CommentCourseDetailsActivity extends AppCompatActivity {

    private ApiClient.ApiServiceInterface apiService;
    private Button btnPublish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apiService = ApiClient.getApiClient();
        initView();
    }

    private void initView() {
        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                apiService.addCourseComment(id,content,,token);
//                AppObservable.bindActivity(this,apiService.)


            }
        });
    }


}
