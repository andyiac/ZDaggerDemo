package com.andyiac.zdaggerdemo.api;

import com.andyiac.zdaggerdemo.data.AllCourses;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseDetails;
import com.andyiac.zdaggerdemo.data.CourseType;
import com.andyiac.zdaggerdemo.data.CourseLikeCount;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.http.Field;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by andyiac
 * Date 15/12/30
 */
public class ApiClient {


    static final int CONNECT_TIMEOUT_MILLIS = 15 * 1000; // 15s
    static final int READ_TIMEOUT_MILLIS = 20 * 1000; // 20s
    private static final String BASE_URL = "http://192.168.10.154";
    private static ApiServiceInterface apiServiceInterface;

    /**
     * 用于Stethoscope调试的httpClient
     */
    private static OkClient getOkClient() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        client.setReadTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        //client.networkInterceptors().add(new StethoInterceptor());
        return new OkClient(client);
    }

    public static ApiServiceInterface getApiClient() {
        if (apiServiceInterface == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setClient(getOkClient())
                    .setEndpoint(BASE_URL)
                    .build();

            apiServiceInterface = restAdapter.create(ApiServiceInterface.class);
        }

        return apiServiceInterface;
    }

    public interface ApiServiceInterface {
        //课程
        @GET("/api/course_index")
        Observable<Course> getCourseIndex();

        @GET("/api/course_types")
        Observable<CourseType> getCourseTypes();

        @GET("/api/courses")
        Observable<AllCourses> getAllCourses();

        @GET("/api/course/{course_id}")
        Observable<CourseDetails> getCourseDetails(@Path("course_id") String course_id);

        //课堂评论和like统计
        @POST("/api/course_count")
        Observable<CourseLikeCount> getCourseLikeCount(@Field("course_id") String course_id);

    }
}
