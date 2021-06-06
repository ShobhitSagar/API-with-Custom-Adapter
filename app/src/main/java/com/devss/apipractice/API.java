package com.devss.apipractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    // Retrofit helps to turn the HTTP API to a JAVA Interface

    @GET("posts")                        // Annotations are required to specify the type of request
    Call<List<Post>> getPosts();         // Responsible for sending request and getting response
}
