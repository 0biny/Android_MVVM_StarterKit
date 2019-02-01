package com.nextus.baseapp.ui.main;

import com.nextus.baseapp.data.DataManager;
import com.nextus.baseapp.ui.base.BaseViewModel;
import com.nextus.baseapp.utils.rx.SchedulerProvider;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
public class MainVM extends BaseViewModel<MainNav> {

    public MainVM(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onShowToastMsg() {
        getNavigator().showToastMsg("Test Toast!!");
    }

}
