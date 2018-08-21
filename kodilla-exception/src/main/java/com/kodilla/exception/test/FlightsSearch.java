package com.kodilla.exception.test;

import java.util.*;

public class FlightsSearch {

    public static void findFilght (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportsAvailable = new HashMap<>();
        airportsAvailable.containsKey("Warsaw");
        airportsAvailable.containsKey("Cracov");

        if(airportsAvailable.containsKey(flight.getDepartureAirport()) == true)
            airportsAvailable.containsValue(true);

    }

    public static void main(String args[]) {

        Flight flight1 = new Flight("Warsaw", "Cracov");
        Flight flight2 = new Flight("Gdynia", "Cracov");

        try {
            findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Unknown airport.");
        }

        try {
            findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Unknown airport.");
        }

    }


}
