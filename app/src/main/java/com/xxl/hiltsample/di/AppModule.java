package com.xxl.hiltsample.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * @author xxl.
 * @date 2024/11/6.
 */
@InstallIn(SingletonComponent.class)
@Module
public class AppModule {

    @Provides
    public String provideUserAgent() {
        return "ua";
    }

  /*  @Provides
    public String provideTest() {
        return "test";
    }*/
}