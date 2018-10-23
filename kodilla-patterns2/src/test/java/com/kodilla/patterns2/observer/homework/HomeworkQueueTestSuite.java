package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        JavaDeveloperModuleEleven moduleEleven = new JavaDeveloperModuleEleven();
        JavaDeveloperModuleTen moduleTen = new JavaDeveloperModuleTen();
        User johnSmith = new User("John Smith");
        User ivoneEscobar = new User("Ivone Escobar");
        User jessiePinkman = new User("Jessie Pinkman");
        moduleTen.registerObserver(johnSmith);
        moduleTen.registerObserver(jessiePinkman);
        moduleEleven.registerObserver(ivoneEscobar);
        moduleEleven.registerObserver(jessiePinkman);
        //When
        moduleTen.addHomework("<<Module 10.1>>");
        moduleTen.addHomework("<<Module 10.2>>");
        moduleEleven.addHomework("<<Module 11.1>>");
        moduleEleven.addHomework("<<Module 11.2>>");
        moduleEleven.addHomework("<<Module 11.3>>");
        //Then
        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }

    @Test
    public void removeObserver() {
        //Given
        JavaDeveloperModuleTen moduleTen = new JavaDeveloperModuleTen();
        User johnSmith = new User("John Smith");
        User jessiePinkman = new User("Jessie Pinkman");
        moduleTen.registerObserver(johnSmith);
        moduleTen.registerObserver(jessiePinkman);
        //When
        moduleTen.removeObserver(johnSmith);

        //Then
        assertEquals(1, moduleTen.getObservers().size());
    }

    @Test
    public void testUpdateForTwoObservers() {
        //Given
        JavaDeveloperModuleEleven moduleEleven = new JavaDeveloperModuleEleven();
        JavaDeveloperModuleTen moduleTen = new JavaDeveloperModuleTen();
        User jessiePinkman = new User("Jessie Pinkman");
        moduleTen.registerObserver(jessiePinkman);
        moduleEleven.registerObserver(jessiePinkman);
        //When
        moduleTen.addHomework("<<Module 10.1>>");
        moduleTen.addHomework("<<Module 10.2>>");
        moduleEleven.addHomework("<<Module 11.1>>");
        moduleEleven.addHomework("<<Module 11.2>>");
        //Then
        assertEquals(4, jessiePinkman.getUpdateCount());
    }
}
