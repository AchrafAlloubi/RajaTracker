package com.example.backend_raja_tracker.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FootballApi {
    @Headers({
        "x-rapidapi-host: api-football-v1.p.rapidapi.com",
        "x-rapidapi-key: YOUR_RAPIDAPI_KEY"
    })
    @GET("fixtures/live")
    Call<String> getLiveMatches();
}