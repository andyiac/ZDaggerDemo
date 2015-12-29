package com.andyiac.zdaggerdemo.api;

import com.andyiac.zdaggerdemo.data.Course;

import retrofit.http.GET;
import rx.Observable;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */
public interface ApiService {

    //课程
    @GET("/api/course_index")
    Observable<Course> getCourseIndex();

}
