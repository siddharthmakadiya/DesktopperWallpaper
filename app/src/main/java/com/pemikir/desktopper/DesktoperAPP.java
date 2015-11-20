package com.pemikir.desktopper;

import android.app.Application;

import com.pemikir.desktopper.Model.Constant;
import com.pemikir.desktopper.Rectrofit.iDesktoper;

import retrofit.RestAdapter;

/**
 * Created by iconflux-android on 10/31/2015.
 */
public class DesktoperAPP extends Application {

    iDesktoper git;

    @Override
    public void onCreate() {
        super.onCreate();
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(Constant.DesktopperURL).build();
        git = restAdapter.create(iDesktoper.class);
    }

    public iDesktoper getGit() {
        return git;
    }

}
