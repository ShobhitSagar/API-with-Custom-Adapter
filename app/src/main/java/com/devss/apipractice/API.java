package com.devss.apipractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("posts")
    Call<List<Post>> getPosts();
}
