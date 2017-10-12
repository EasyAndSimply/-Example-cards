package com.example.eppav.testcards.api;

import com.example.eppav.testcards.model.Photos;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PhotosAPI {

    @GET("photos/n")
    Call<List<Photos>> getPhoros(@Path("n")int photos);
}
