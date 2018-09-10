package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class YGeneration extends User {
    public YGeneration(String user) {
        super(user);
        this.socialPublisher = new SnapchatPublisher();
    }
}
