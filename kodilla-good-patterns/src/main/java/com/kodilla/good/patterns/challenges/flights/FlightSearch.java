package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightsList flightsList = new FlightsList();

    public List<Flight> getFlightsByDeparture(String departureAirport) {
        return flightsList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsByDestination(String arrivalAirport) {
        return flightsList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsWithChange(String departureAirport, String middleAirport, String arrivalAirport) {

        List<Flight> toMiddleAirport = flightsList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(middleAirport))
                .collect(Collectors.toList());
        List<Flight> fromMiddleAirport = flightsList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(middleAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        if (toMiddleAirport.isEmpty() || fromMiddleAirport.isEmpty())
        {
            throw new IncorrectDataException("Incorrect data.");
        }
        else {
            List<Flight> changes = new ArrayList<>();
            changes.addAll(toMiddleAirport);
            changes.addAll(fromMiddleAirport);

            return changes;
        }
    }
}


