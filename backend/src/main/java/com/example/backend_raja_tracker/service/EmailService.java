package com.example.backend_raja_tracker.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class EmailService {
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String DOMAIN_NAME = "YOUR_DOMAIN_NAME";

    public static void sendEmail(String to, String subject, String body) throws Exception {
        HttpResponse<String> request = Unirest.post("https://api.mailgun.net/v3/" + DOMAIN_NAME + "/messages")
            .basicAuth("api", API_KEY)
            .queryString("from", "Excited User <mailgun@" + DOMAIN_NAME + ">")
            .queryString("to", to)
            .queryString("subject", subject)
            .queryString("text", body)
            .asString();
    }
}