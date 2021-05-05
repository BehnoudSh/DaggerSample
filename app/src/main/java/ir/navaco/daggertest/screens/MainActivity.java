package ir.navaco.daggertest.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ir.navaco.daggertest.R;
//import ir.navaco.daggertest.dagger.DaggerUserComponent;
import ir.navaco.daggertest.dagger.DaggerUserComponent;
import ir.navaco.daggertest.dagger.UserComponent;
import ir.navaco.daggertest.model.User;


public class MainActivity extends AppCompatActivity {


    @Inject
    User user;

    private static final String TAG = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        UserComponent userComponent = DaggerUserComponent.create();
//        userComponent.inject(this);
//        user.show();


        UserComponent userComponent = DaggerUserComponent.builder()
                .firstName("Behnoud")
                .lastName("Sherafati")
                .build();

        userComponent.inject(this);
        user.show();
        Log.e(TAG, "FirstName: " + user.getFirstName() + " Last Name: " + user.getLastName());

    }
}