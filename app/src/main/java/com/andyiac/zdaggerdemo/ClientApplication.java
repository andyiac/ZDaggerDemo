package com.andyiac.zdaggerdemo;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.andyiac.zdaggerdemo.internal.di.components.ApplicationComponent;
import com.andyiac.zdaggerdemo.internal.di.components.DaggerApplicationComponent;
import com.andyiac.zdaggerdemo.internal.di.modules.ApplicationModule;
import com.orhanobut.logger.Logger;


/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */
public class ClientApplication extends Application {

    private ApplicationComponent applicationComponent;

    public static ClientApplication get(@NonNull Context context) {
        return (ClientApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initAppComponent();
    }

    private void initAppComponent() {
        Logger.i("================");
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }


    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}
