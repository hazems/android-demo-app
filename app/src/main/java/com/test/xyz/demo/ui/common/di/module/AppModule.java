package com.test.xyz.demo.ui.common.di.module;

import android.app.Application;
import android.content.res.Resources;

import com.test.xyz.demo.ui.common.di.DaggerApplication;
import com.test.xyz.demo.ui.common.util.Logger;
import com.test.xyz.demo.ui.common.util.LoggerProxy;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    DaggerApplication app;

    public AppModule(DaggerApplication application) {
        app = application;
    }

    @Provides
    @Singleton
    protected Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    protected Resources provideResources() {
        return app.getResources();
    }

    @Provides
    @Singleton
    protected Logger provideLogger() {
        return new LoggerProxy();
    }
}
