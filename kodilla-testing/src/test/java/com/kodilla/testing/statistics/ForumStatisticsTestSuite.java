package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test (expected = AssertionError.class )
    public void testWhenPostsQuantityIs0()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(200);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(0, givenForumStats.getPostsQuantity());
        Assert.assertEquals(200, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(0, givenForumStats.getAveragePostsQuantity(),0.0);
        Assert.assertEquals(2, givenForumStats.getAverageCommentsQuantity(),0.0);
        Assert.assertEquals(0, givenForumStats.getAverageCommentsQuantityPerPost(),0.0);
    }

    @Test
    public void testWhenPostsQuantityIs1000() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(200);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(1000, givenForumStats.getPostsQuantity());
        Assert.assertEquals(200, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(10, givenForumStats.getAveragePostsQuantity(), 0.0);
        Assert.assertEquals(2, givenForumStats.getAverageCommentsQuantity(), 0.0);
        Assert.assertEquals(0.2, givenForumStats.getAverageCommentsQuantityPerPost(), 0.0);
    }

    @Test
    public void testWhenCommentsQuantityIs0()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.commentsCount()).thenReturn(0);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(100, givenForumStats.getPostsQuantity());
        Assert.assertEquals(0, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(1, givenForumStats.getAveragePostsQuantity(),0.0);
        Assert.assertEquals(0, givenForumStats.getAverageCommentsQuantity(),0.0);
        Assert.assertEquals(0, givenForumStats.getAverageCommentsQuantityPerPost(),0.0);
    }

    @Test
    public void testWhenCommentsQuantityIsSmallerThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(10000);
        when(statsMock.commentsCount()).thenReturn(50);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(10000, givenForumStats.getPostsQuantity());
        Assert.assertEquals(50, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(100, givenForumStats.getAveragePostsQuantity(), 0.0);
        Assert.assertEquals(0.5, givenForumStats.getAverageCommentsQuantity(), 0.0);
        Assert.assertEquals(0.005, givenForumStats.getAverageCommentsQuantityPerPost(), 0.0);
    }

    @Test
    public void testWhenCommentsQuantityIsBiggerThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(50);
        when(statsMock.commentsCount()).thenReturn(10000);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(50, givenForumStats.getPostsQuantity());
        Assert.assertEquals(10000, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(0.5, givenForumStats.getAveragePostsQuantity(), 0.0);
        Assert.assertEquals(100, givenForumStats.getAverageCommentsQuantity(), 0.0);
        Assert.assertEquals(200, givenForumStats.getAverageCommentsQuantityPerPost(), 0.0);
    }

    @Test (expected = AssertionError.class )
    public void testWhenUsersQuantityIs0()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.commentsCount()).thenReturn(200);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(0, givenForumStats.getUsersQuantity());
        Assert.assertEquals(100, givenForumStats.getPostsQuantity());
        Assert.assertEquals(200, givenForumStats.getCommentsQuantity());Assert.assertEquals(0, givenForumStats.getAveragePostsQuantity(),0.0);
        Assert.assertEquals(0, givenForumStats.getAverageCommentsQuantity(),0.0);
        Assert.assertEquals(2, givenForumStats.getAverageCommentsQuantityPerPost(),0.0);
    }

    @Test
    public void testWhenUsersQuantityIs100()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics();

        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String word = "a" + i;
            users.add(word);
        }

        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.commentsCount()).thenReturn(200);

        //When
        givenForumStats.calculateAdvStatistics(statsMock);

        //Then
        Assert.assertEquals(100, givenForumStats.getUsersQuantity());
        Assert.assertEquals(100, givenForumStats.getPostsQuantity());
        Assert.assertEquals(200, givenForumStats.getCommentsQuantity());
        Assert.assertEquals(2, givenForumStats.getAverageCommentsQuantity(),0.0);
        Assert.assertEquals(1, givenForumStats.getAveragePostsQuantity(),0.0);
        Assert.assertEquals(2, givenForumStats.getAverageCommentsQuantityPerPost(),0.0);
    }
}
