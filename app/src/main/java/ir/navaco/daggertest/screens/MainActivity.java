package ir.navaco.daggertest.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import ir.navaco.daggertest.R;
//import ir.navaco.daggertest.dagger.DaggerUserComponent;
//import ir.navaco.daggertest.dagger.DaggerUserComponent;
import ir.navaco.daggertest.dagger.UserComponent;
import ir.navaco.daggertest.model.Post;
import ir.navaco.daggertest.model.User;
import ir.navaco.daggertest.network.ApiInterface;


public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Inject
    ApiInterface apiService;

    private static final String TAG = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        UserComponent userComponent = DaggerUserComponent.create();
//        userComponent.inject(this);
//        user.show();

//        UserComponent userComponent = DaggerUserComponent.builder()
//                .firstName("Behnoud")
//                .lastName("Sherafati")
//                .build();
//
//        userComponent.inject(this);
//        user.show();
//        Log.e(TAG, "FirstName: " + user.getFirstName() + " Last Name: " + user.getLastName());


        Call<List<Post>> call = apiService.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.isSuccessful()) {
                    //To get the first Post element from the response.
                    Post post = response.body().get(0);
                    Log.e(TAG, "Title: " + post.getTitle());
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });


    }
}