package ir.navaco.daggertest.model;

import android.util.Log;

import javax.inject.Inject;

public class User {

    private static final String TAG = "User";
    private Address address;

//    @Inject
//    public User() {
//
//    }

    @Inject
    public User(Address address) {
        this.address = address;
    }

    public void show() {
        Log.e(TAG, "Hello, I am user.");
    }

}
