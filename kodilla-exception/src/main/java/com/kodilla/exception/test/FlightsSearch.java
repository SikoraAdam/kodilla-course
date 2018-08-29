package com.kodilla.exception.test;

import java.util.*;

public class FlightsSearch {

    public static void main(String args[]) {

        Flight flight1 = new Flight("WarsawAirport", "CracovAirport");
        Flight flight2 = new Flight("GdyniaAirport", "WarsawAirport");
        Flight flight3 = new Flight("CracovAirport", "GdyniaAirport");
        Flight flight4 = new Flight("WarsawAirport", "KazachstanAirport");

        Map<Flight, Boolean> knownFlights = new HashMap();
        knownFlights.put(flight1, true);
        knownFlights.put(flight2, false);

        SearchingFlightClass flightsSearched = new SearchingFlightClass(knownFlights);

        flightsSearched.findFlight(flight1);
        flightsSearched.findFlight(flight2);
        flightsSearched.findFlight(flight3);
        flightsSearched.findFlight(flight4);
    }
}
