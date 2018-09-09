package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightsList {
    private List<Flight> flights = new ArrayList<>();

    public FlightsList() {

        flights.add(new Flight("Warsaw","Krakow"));
        flights.add(new Flight("Warsaw","Gdansk"));
        flights.add(new Flight("Warsaw",  "Wroclaw"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Krakow",  "Gdansk"));
        flights.add(new Flight("Krakow",  "Wroclaw"));
        flights.add(new Flight("Gdansk",  "Warsaw"));
        flights.add(new Flight("Gdansk",  "Wroclaw"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Wroclaw", "Warsaw"));

    }

    public List<Flight> getFlights() {
        return flights;
    }
}
