package com.kodilla.exception.test;

import java.util.*;

public class FlightsSearch {

    public static void main(String args[]) {

        Flight flight1 = new Flight("WarsawAirport", "CracovAirport");
        Flight flight2 = new Flight("GdyniaAirport", "WarsawAirport");
        Flight flight3 = new Flight("CracovAirport", "GdyniaAirport");

        //FlightsSearch searchedFlight = new FlightsSearch();
        Map<Flight, Boolean> returnFlight = new LinkedHashMap<Flight, Boolean>();
        returnFlight.put(new Flight("WarsawAirport", "CracovAirport"), true);
        returnFlight.put(new Flight("GdyniaAirport", "WarsawAirport"), false);

        SearchingFlightClass searchingFlight = new SearchingFlightClass(returnFlight);

        searchingFlight.findFlight(new Flight("WarsawAirport", "CracovAirport"));
        searchingFlight.findFlight(new Flight("GdyniaAirport", "WarsawAirport"));
        searchingFlight.findFlight(new Flight("CracovAirport", "GdyniaAirport"));
        searchingFlight.findFlight(new Flight("WarsawAirport", "Kazachstan"));



        /*searchedFlight.findFlight(flight1);
        searchedFlight.findFlight(flight2);
        searchedFlight.findFlight(flight3);
        searchedFlight.findFlight(new Flight("WarsawAirport", "Kazachstan"));*/
    }





}
