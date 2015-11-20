package com.pemikir.desktopper.Utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;


public class SessionManagerSharedPref {
    // Sharedpref file name
    private static final String PREF_NAME = "Desktopper";
    private static final String IS_LOGIN = "IsLoggedIn";
    private static final String SearchLocation = "Location";
    private static final String PWD = "pwd";
    private static final String UserName = "UserName";
    private static final String LoginName = "LoginName";
    private static final String State = "LoginName";
    private static final String SateliteSetting = "Satelitesetting";
    // Shared Preferences
    SharedPreferences pref;
    // Editor for Shared preferences
    Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;


    public SessionManagerSharedPref(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public String getLocation() {
        return pref.getString(SearchLocation, null);
    }

    public void setLocation(Location location) {
        editor.putString(SearchLocation, String.valueOf(location));
        editor.commit();
    }

    public String getLoginName() {
        return pref.getString(LoginName, null);
    }


    public String getPwd() {
        return pref.getString(PWD, null);
    }

    public String getUserName() {
        return pref.getString(UserName, null);
    }

    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }


    public void checkLogin() {
        if (!this.isLoggedIn()) {
            // user is not logged in redirect him to Login Activity

        }
    }

    //Clear session details
    public void logoutUser() {
        //clear data from shared pref
        editor.clear();
        editor.commit();
        //After logout rediredt user to ....
    }

    public String getState() {
        return pref.getString(State, null);
    }

    public void setState(String state) {
        editor.putString(State, state);
        editor.commit();
    }

    public void setSatellite(int state) {
        editor.putInt(SateliteSetting, state);
        editor.commit();
    }


}
