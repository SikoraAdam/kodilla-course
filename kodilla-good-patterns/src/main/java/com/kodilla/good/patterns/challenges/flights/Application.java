package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        System.out.println(flightSearch.getFlightsByDeparture("Warsaw"));
        System.out.println(flightSearch.getFlightsByDestination("Krakow"));
        System.out.println(flightSearch.getFlightsWithChange("Warsaw", "Krakow", "Gdansk"));
        System.out.println(flightSearch.getFlightsWithChange("Warsaw", "Barcelona", "Gdansk"));
    }
}
