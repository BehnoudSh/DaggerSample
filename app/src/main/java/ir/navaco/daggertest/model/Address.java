package ir.navaco.daggertest.model;

import android.util.Log;

import javax.inject.Inject;

public class Address {

    private static final String TAG = "Address";

    @Inject
    public Address() {
        Log.e(TAG, "Address class instantiated.");
    }


}
