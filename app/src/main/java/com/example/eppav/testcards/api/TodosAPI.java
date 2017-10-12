package com.example.eppav.testcards.api;

import com.example.eppav.testcards.model.Todos;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodosAPI {
    @GET("todos/{n}")
    Call<List<Todos>> getTodos(@Path("n")int todos);
}
