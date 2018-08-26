package com.kodilla.exception.test;

import java.util.*;

public class FlightsSearch {

    Map<Flight, Boolean> returnFlight = new HashMap<>();

    public Map<Flight, Boolean> selectedFlight() {
        return returnFlight;
    }

    public void findFlight(Flight flight) {

        System.out.println("Searching for: " + flight.getArrivalAirport());

        if(!selectedFlight().keySet().contains(flight.getArrivalAirport()) || !selectedFlight().keySet().contains(flight.getDepartureAirport()))
        {
            System.out.println("Airport found.");
        }
        else
        {
            System.out.println("Airport not found.");
            throw new RouteNotFoundException();
        }
    }

    public static void main(String args[]) {

        Flight flight1 = new Flight("WarsawAirport", "CracovAirport");
        Flight flight2 = new Flight("GdyniaAirport", "WarsawAirport");
        Flight flight3 = new Flight("CracovAirport", "GdyniaAirport");

        FlightsSearch searchedFlight = new FlightsSearch();

        searchedFlight.selectedFlight().put(flight1, true);
        searchedFlight.selectedFlight().put(flight2, false);

        searchedFlight.findFlight(flight1);
        searchedFlight.findFlight(flight2);
        searchedFlight.findFlight(flight3);
        searchedFlight.findFlight(new Flight("WarsawAirport", "Kazachstan"));

        System.out.println();


    }

}
