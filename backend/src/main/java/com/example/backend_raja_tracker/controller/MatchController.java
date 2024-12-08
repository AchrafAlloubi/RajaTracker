package com.example.backend_raja_tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @GetMapping("/live")
    public String getLiveMatches() {
        // Appeler le service FootballService pour obtenir les matchs en direct
        return "Liste des matchs en direct";
    }
}