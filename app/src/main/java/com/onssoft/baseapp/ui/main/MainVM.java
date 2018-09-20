package com.onssoft.baseapp.ui.main;

import com.onssoft.baseapp.data.DataManager;
import com.onssoft.baseapp.ui.base.BaseViewModel;
import com.onssoft.baseapp.utils.rx.SchedulerProvider;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
public class MainVM extends BaseViewModel {

    public MainVM(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
