package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlightClass {

    Map<Flight, Boolean> returnFlight = new HashMap<>();

    public SearchingFlightClass(Map<Flight, Boolean> returnFlight) {
        this.returnFlight = returnFlight;
    }

    public Map<Flight, Boolean> getReturnFlight() {
        return returnFlight;
    }

    public void findFlight(Flight flight) {


        System.out.println("Searching for flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        boolean airportExist = false;

        for (Map.Entry<Flight, Boolean> entry : getReturnFlight().entrySet()) {

            if (entry.getKey().getDepartureAirport() == flight.getDepartureAirport()
                    && entry.getKey().getArrivalAirport() == flight.getArrivalAirport()) {
                System.out.println(entry.getValue() ? "Flight available." : "Flight not available.");
                airportExist = true;
                break; }
            else if (entry.getKey().getDepartureAirport() == flight.getDepartureAirport())
            {
                airportExist = true;
            }
            else if (entry.getKey().getDepartureAirport() == flight.getArrivalAirport())
            {
                airportExist = true;
            }
            else if (entry.getKey().getArrivalAirport() == flight.getDepartureAirport())
            {
                airportExist = true;
            }
            else if (entry.getKey().getArrivalAirport() == flight.getArrivalAirport())
            {
                airportExist = true;
            }
            else
            {
                airportExist = false;
            }
        }

        System.out.println(airportExist?"Airport/s found.":"Airport/s not found.");


        //returnFlight.containsKey(flight);

            /*System.out.println(entry.getKey().getDepartureAirport() + "/" + entry.getValue());
            System.out.println(entry.getKey().getArrivalAirport() + "/" + entry.getValue());
            System.out.println(flight.getDepartureAirport());
            System.out.println(flight.getArrivalAirport());
            System.out.println("---------");*/


        /*System.out.println("DOES EXIST?");

        if(returnFlight.keySet().contains(flight.getArrivalAirport()) || returnFlight.keySet().contains(flight.getDepartureAirport()))
        {
            System.out.println("Airport found.");
        }
        else
        {
            System.out.println("Airport not found.");
            //throw new RouteNotFoundException();
        }

        System.out.println("---------");
        System.out.println("---------");*/

    }
}


