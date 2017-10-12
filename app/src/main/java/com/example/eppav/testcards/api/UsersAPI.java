package com.example.eppav.testcards.api;

import com.example.eppav.testcards.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by EpPav on 11.10.2017.
 */

public interface UsersAPI {
    @GET("users/{n}")
    Call<List<Users>> getUsers(@Path("n")int users);
}
