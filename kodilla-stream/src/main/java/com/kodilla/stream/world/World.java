package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {

    List<Continent> theWorld = new ArrayList<>();

    public World(List<Continent> theWorld) {

        this.theWorld = theWorld;
    }

    public BigDecimal getPeopleQuantity() {
        return theWorld.stream()
                .flatMap(continent -> continent.theContinent.stream())
                .map(theCountry -> theCountry.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
