package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {

    List<List<Country>> continentsList = new ArrayList<>();

    public World(List<List<Country>> continentsList) {
        this.continentsList = continentsList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentsList.stream()
                .flatMap(continent -> continent.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
