package com.example.backend_raja_tracker.service;

import com.example.backend_raja_tracker.api.FootballApi;
import com.example.backend_raja_tracker.config.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Response;

public class FootballApiService {
    private FootballApi footballApi;

    public FootballApiService() {
        footballApi = RetrofitConfig.getRetrofitInstance().create(FootballApi.class);
    }

    public String getLiveMatches() {
        try {
            Call<String> call = footballApi.getLiveMatches();
            Response<String> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Erreur lors de la récupération des matchs en direct";
    }
}