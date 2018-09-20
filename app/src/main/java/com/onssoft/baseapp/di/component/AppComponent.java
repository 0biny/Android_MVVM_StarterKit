package com.onssoft.baseapp.di.component;

import android.app.Application;

import com.onssoft.baseapp.MyApplication;
import com.onssoft.baseapp.di.builder.ActivityBuilder;
import com.onssoft.baseapp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(MyApplication app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
