package com.example.eppav.testcards.api;

import com.example.eppav.testcards.model.Comments;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by EpPav on 11.10.2017.
 */

public interface PostsAPI {
    @GET("posts/{n}")
    Call<List<Comments>> getPosts(@Path("n")int n);
}
