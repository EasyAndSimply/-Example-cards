package com.example.eppav.testcards.api;

import com.example.eppav.testcards.model.Comments;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CommentsAPI {

    @GET("{comments}/{n}")
    Call<List<Comments>> getComment(@Path("n") int comment);
}
