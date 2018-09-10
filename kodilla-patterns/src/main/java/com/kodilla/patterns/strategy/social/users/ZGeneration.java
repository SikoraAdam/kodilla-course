package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String user) {
        super(user);
        this.socialPublisher = new TwitterPublisher();
    }
}
