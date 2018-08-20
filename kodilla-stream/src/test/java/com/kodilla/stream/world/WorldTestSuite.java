package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        List<Country> theContinentEurope = new ArrayList<>();
        List<Continent> theWorld = new ArrayList<>();

        Country poland = new Country(new BigDecimal("123456789"));
        Country germany = new Country(new BigDecimal("456146515"));
        Country russia = new Country(new BigDecimal("7899874798"));

        Continent Europe = new Continent(theContinentEurope);

        theContinentEurope.add(poland);
        theContinentEurope.add(germany);
        theContinentEurope.add(russia);
        theWorld.add(Europe);

        //When
        BigDecimal totalPopulation = theWorld.stream()
                .flatMap(continent -> continent.theContinent.stream())
                .map(theCountry -> theCountry.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPopulation = new BigDecimal("8479478102");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
