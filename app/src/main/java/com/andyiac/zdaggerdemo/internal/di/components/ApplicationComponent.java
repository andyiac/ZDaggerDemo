package com.andyiac.zdaggerdemo.internal.di.components;


import com.andyiac.zdaggerdemo.ClientApplication;
import com.andyiac.zdaggerdemo.internal.di.modules.ApplicationModule;
import com.andyiac.zdaggerdemo.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 * A component whose lifetime is the life of the application.
 */
@Singleton  // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(ClientApplication application);
}
