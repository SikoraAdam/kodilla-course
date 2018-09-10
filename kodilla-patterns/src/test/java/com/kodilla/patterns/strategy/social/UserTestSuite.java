package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User fbUser = new Millenials("Facebook User");
        User snUser = new YGeneration("Snapchat User");
        User twUser = new ZGeneration("Twitter User");

        //When
        String fbUserPosts = fbUser.sharePost();
        System.out.println("Facebook User posts on " + fbUserPosts);
        String snUserPosts = snUser.sharePost();
        System.out.println("Snapchat User posts on " + snUserPosts);
        String twUserPosts = twUser.sharePost();
        System.out.println("Twitter User posts on " + twUserPosts);

        //Then
        Assert.assertEquals("Facebook", fbUserPosts);
        Assert.assertEquals("Snapchat", snUserPosts);
        Assert.assertEquals("Twitter", twUserPosts);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User fbUser = new Millenials("Facebook User");

        //When
        String fbUserPosts = fbUser.sharePost();
        System.out.println("Facebook User posts on " + fbUserPosts);
        fbUser.setPublisher(new TwitterPublisher());
        fbUserPosts = fbUser.sharePost();
        System.out.println("Facebook User now posts on " + fbUserPosts);

        //Then
        Assert.assertEquals("Twitter", fbUserPosts);
    }
}
