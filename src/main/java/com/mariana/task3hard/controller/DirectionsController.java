package com.mariana.task3hard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DirectionsController {

    private final RestTemplate restTemplate;

    public DirectionsController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/directions")
    public String getDirectionsToHealthcareFacility(
            @RequestParam("currentLocation") String currentLocation,
            @RequestParam("healthcareFacility") String healthcareFacility) {

        // Make a request to Google Maps API to fetch directions
        String googleMapsApiUrl = "https://maps.googleapis.com/maps/api/directions/json?" +
                "origin=" + currentLocation + "&destination=" + healthcareFacility + "&key=YOUR_API_KEY";
        String directions = restTemplate.getForObject(googleMapsApiUrl, String.class);
        return directions;
    }
}
