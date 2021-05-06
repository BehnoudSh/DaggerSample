package ir.navaco.daggertest.network;

import java.util.List;

import ir.navaco.daggertest.model.Post;

public interface ApiInterface {

     @GET("/posts")
     Call<List<Post>> getPosts();
}
