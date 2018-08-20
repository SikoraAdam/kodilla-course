package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.*;

public class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        ForumUser newUser1 = new ForumUser(123, "Anna Kruk", 'F', LocalDate.of(1990, Month.MAY, 15), 3);
        ForumUser newUser2 = new ForumUser(124, "Jan Kruk", 'M', LocalDate.of(1997, Month.MAY, 15), 3);
        ForumUser newUser3 = new ForumUser(125, "Ela Kruk", 'F', LocalDate.of(2001, Month.MAY, 15), 3);
        ForumUser newUser4 = new ForumUser(126, "Krystian Kruk", 'M', LocalDate.of(2009, Month.MAY, 15), 3);
        ForumUser newUser5 = new ForumUser(127, "Justyna Kruk", 'F', LocalDate.of(2011, Month.MAY, 15), 3);

        theUsersList.add(newUser1);
        theUsersList.add(newUser2);
        theUsersList.add(newUser3);
        theUsersList.add(newUser4);
        theUsersList.add(newUser5);
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}
