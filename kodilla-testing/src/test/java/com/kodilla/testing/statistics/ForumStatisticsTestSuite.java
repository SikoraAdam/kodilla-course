package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import static org.mockito.Mockito.mock;

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

    @Test
    public void testUsersQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        int givenUsersQuantity = givenForumStats.getUsersQuantity();

        //Then
        Assert.assertEquals(100, givenUsersQuantity);
    }

    @Test
    public void testPostsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        int givenPostsQuantity = givenForumStats.getPostsQuantity();

        //Then
        Assert.assertEquals(100, givenPostsQuantity);
    }

    @Test
    public void testCommentsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        int givenCommentsQuantity = givenForumStats.getCommentsQuantity();

        //Then
        Assert.assertEquals(100, givenCommentsQuantity);
    }

    @Test
    public void testAveragePostsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        double givenAveragePostsQuantity = givenForumStats.getAveragePostsQuantity();

        //Then
        Assert.assertEquals(0, givenAveragePostsQuantity);
    }

    @Test
    public void testAverageCommentsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        double testAverageCommentsQuantity = givenForumStats.getAverageCommentsQuantity();

        //Then
        Assert.assertEquals(0, testAverageCommentsQuantity);
    }

    @Test
    public void testAverageCommentsQuantityPerPost()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        //When
        double testAverageCommentsQuantityPerPost = givenForumStats.getAverageCommentsQuantityPerPost();

        //Then
        Assert.assertEquals(0, testAverageCommentsQuantityPerPost);
    }
}
