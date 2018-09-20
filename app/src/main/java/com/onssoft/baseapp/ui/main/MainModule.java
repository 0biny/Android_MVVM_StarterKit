package com.onssoft.baseapp.ui.main;

import com.onssoft.baseapp.data.DataManager;
import com.onssoft.baseapp.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
@Module
public class MainModule {

    @Provides
    MainVM provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new MainVM(dataManager, schedulerProvider);
    }
}
