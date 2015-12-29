package com.andyiac.zdaggerdemo.internal.di.modules;

import android.app.Application;

import com.andyiac.zdaggerdemo.BuildConfig;
import com.andyiac.zdaggerdemo.ClientApplication;
import com.andyiac.zdaggerdemo.api.ApiService;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */

@Module
public class ApplicationModule {

    private final ClientApplication application;

    public ApplicationModule(ClientApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    @Provides
    @Singleton
    public RestAdapter provideRestAdapter(OkHttpClient okHttpClient) {

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setClient(new OkClient(okHttpClient))
                .setEndpoint("http://192.168.10.154");

        if (BuildConfig.DEBUG) {
            builder.setLogLevel(RestAdapter.LogLevel.FULL);
        }

        return builder.build();
    }


    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    public ApiService provideApiService(RestAdapter restAdapter) {
        return restAdapter.create(ApiService.class);
    }


}
