package com.kodilla.exception.test;

import java.util.*;

public class SearchingFlightClass {

    Map<Flight, Boolean> knownFlights;

    public SearchingFlightClass(Map<Flight, Boolean> knownFlights) {
        this.knownFlights = knownFlights;
    }

    public Map<Flight, Boolean> getKnownFlights() {
        return knownFlights;
    }

    public void findFlight(Flight flight) {

        System.out.println("Searching for flight from "
                + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());

        if (!getKnownFlights().containsKey(flight))
        {
            throw new RouteNotFoundException("Flight not found.");
        }

        System.out.println(getKnownFlights().get(flight) ? "Flight available." : "Flight not available.");
    }
}


