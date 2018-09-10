package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class User {
    final private String user;
    protected SocialPublisher socialPublisher;

    public User(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }


}
