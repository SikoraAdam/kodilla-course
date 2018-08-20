package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        Country poland = new Country();
        Country germany = new Country();
        Country russia = new Country();

        poland.peopleQuantity = new BigDecimal("123456789");
        germany.peopleQuantity = new BigDecimal("456146515");
        russia.peopleQuantity = new BigDecimal("7899874798");

        List<Country> countriesList = new ArrayList<>();
        List<List<Country>> continentsList = new ArrayList<>();

        countriesList.add(poland);
        countriesList.add(germany);
        countriesList.add(russia);
        continentsList.add(countriesList);

        //When
        BigDecimal totalPopulation = continentsList.stream()
                .flatMap(continent -> continent.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPopulation = new BigDecimal("8479478102");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
