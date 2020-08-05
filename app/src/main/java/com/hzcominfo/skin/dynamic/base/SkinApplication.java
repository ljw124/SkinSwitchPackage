package com.hzcominfo.skin.dynamic.base;

import android.app.Application;

import com.hzcominfo.skin.library.SkinManager;

public class SkinApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);
    }
}
