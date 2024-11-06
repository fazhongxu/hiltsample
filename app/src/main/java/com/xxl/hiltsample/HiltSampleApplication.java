package com.xxl.hiltsample;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;

/**
 * @author xxl.
 * @date 2024/11/6.
 */
@HiltAndroidApp
public class HiltSampleApplication extends Application {

    @Inject
    String mUserAgent;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("aaa", "onCreate: "+mUserAgent );
    }
}