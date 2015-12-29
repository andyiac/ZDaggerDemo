package com.andyiac.zdaggerdemo;

import android.app.Application;
import android.content.Context;



/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */
public class ClientApplication extends Application {


    public static ClientApplication getInstance(Context context) {
        return (ClientApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }





}
