package com.example.backend_raja_tracker.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FootballService {
    private static final String BASE_URL = "https://api-football-v1.p.rapidapi.com/v3/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    }
}