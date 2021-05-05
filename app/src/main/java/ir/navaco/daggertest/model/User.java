package ir.navaco.daggertest.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class User {

    private static final String TAG = "User";
    private Address address;
    private String firstName, lastName;

//    @Inject
//    public User() {
//
//    }

//    @Inject
//    public User(Address address) {
//        this.address = address;
//    }


    @Inject
    public User(Address address, @Named("firstName") String firstName, @Named("lastName") String lastName) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show() {
        Log.e(TAG, "Hello, I am user.");
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

}
