package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String user) {
        super(user);
        this.socialPublisher = new FacebookPublisher();
    }
}
