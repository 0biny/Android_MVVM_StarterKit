package com.onssoft.baseapp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onssoft.baseapp.BR;
import com.onssoft.baseapp.R;
import com.onssoft.baseapp.databinding.ActivityMainBinding;
import com.onssoft.baseapp.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainVM> {

    @Inject MainVM viewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainVM getViewModel() {
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
