package com.kodilla.exception.test;

import java.util.*;

public class FlightsSearch {

    public static void main(String args[]) {

        Flight flight1 = new Flight("WarsawAirport", "CracovAirport");
        Flight flight2 = new Flight("GdyniaAirport", "WarsawAirport");

    }

    public void findFlight(Flight flight) {

        Map<String, Boolean> airportsAvaiable = new HashMap<>();
        airportsAvaiable.put("WarsawAirport", true);
        airportsAvaiable.put("CracovAirport", false);

        try {
            for (String airport : airportsAvaiable.keySet()) {
                if (airportsAvaiable.containsKey(flight.getArrivalAirport()) && airportsAvaiable.containsKey(flight.getDepartureAirport()))
                    System.out.println("Flight available.");
                else
                    System.out.println("Flight not available.");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
