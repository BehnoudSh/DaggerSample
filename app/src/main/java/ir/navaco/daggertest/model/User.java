package ir.navaco.daggertest.model;

import android.util.Log;

import javax.inject.Inject;

public class User {

    private static final String TAG = "User";

    @Inject
    public User() {

    }

    public void show() {
        Log.e(TAG, "Hello, I am user.");
    }

}
