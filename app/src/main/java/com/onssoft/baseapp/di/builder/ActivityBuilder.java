package com.onssoft.baseapp.di.builder;

import com.onssoft.baseapp.ui.main.MainActivity;
import com.onssoft.baseapp.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainActivity();

    /*
    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();
    @ContributesAndroidInjector(modules = {
            MainModule.class,
            MainPageFragmentProvider.class,
            PiczoneListFragmentProvider.class,
            MoreFragmentProvider.class
    })
    abstract MainActivity bindMainActivity();
    @ContributesAndroidInjector(modules = {
            DetailActivityModule.class,
            CommentListFragmentProvider.class
    })
    abstract DetailActivity bindDetailActivity();
    @ContributesAndroidInjector(modules = SectionActivityModule.class)
    abstract SectionActivity bindSectionActivity();
    @ContributesAndroidInjector(modules = SplashModule.class)
    abstract SplashActivity bindSplashActivity();
    @ContributesAndroidInjector(modules = MapActivityModule.class)
    abstract MapActivity bindMapActivity();
    @ContributesAndroidInjector(modules = CameraActivityModule.class)
    abstract CameraActivity bindCameraActivity();
    @ContributesAndroidInjector(modules = SignUpActivityModule.class)
    abstract SignUpActivity bindSignUpActivity();
    */

    /*
    @ContributesAndroidInjector(modules = {
            MainModule.class,
            FeedFragmentProvider.class,
            MoreFragmentProvider.class,
            PointFragmentProvider.class,
            AddEventDialogProvider.class
    })
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = SplashModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = WriteActivityModule.class)
    abstract WriteActivity bindWriteActivity();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = CommentActivityModule.class)
    abstract CommentActivity bindCommentActivity();

    @ContributesAndroidInjector(modules = UserInfoActivityModule.class)
    abstract UserInfoActivity bindUserInfoActivity();

    @ContributesAndroidInjector(modules = DetailActivityModule.class)
    abstract DetailActivity bindDetailActivity();
    */
}
