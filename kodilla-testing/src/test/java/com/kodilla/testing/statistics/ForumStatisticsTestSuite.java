package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

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

    @Test
    public void testUsersQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        when(statsMock.usersNames()).thenReturn(givenForumStats.usersNames());

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

        when(statsMock.postsCount()).thenReturn(givenForumStats.postsCount());

        //When
        int givenPostsQuantity = givenForumStats.getPostsQuantity();

        //Then
        Assert.assertEquals(1000, givenPostsQuantity);
    }

    @Test
    public void testCommentsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        when(statsMock.commentsCount()).thenReturn(givenForumStats.commentsCount());

        //When
        int givenCommentsQuantity = givenForumStats.commentsCount();

        //Then
        Assert.assertEquals(100, givenCommentsQuantity);
    }

    @Test
    public void testAveragePostsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        when(statsMock.postsCount()).thenReturn(givenForumStats.postsCount());
        when(statsMock.usersNames()).thenReturn(givenForumStats.usersNames());

        givenForumStats.calculateAdvStatistics(statsMock);

        //When
        double givenAveragePostsQuantity = givenForumStats.getAveragePostsQuantity();

        //Then
        Assert.assertEquals(10.0, givenAveragePostsQuantity, 1.0);
    }

    @Test
    public void testAverageCommentsQuantity()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        when(statsMock.commentsCount()).thenReturn(givenForumStats.commentsCount());
        when(statsMock.usersNames()).thenReturn(givenForumStats.usersNames());

        givenForumStats.calculateAdvStatistics(statsMock);

        //When
        double testAverageCommentsQuantity = givenForumStats.getAverageCommentsQuantity();

        //Then
        Assert.assertEquals(1, testAverageCommentsQuantity, 1.0);
    }

    @Test
    public void testAverageCommentsQuantityPerPost()
    {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics givenForumStats = new ForumStatistics(statsMock);

        when(statsMock.commentsCount()).thenReturn(givenForumStats.commentsCount());
        when(statsMock.postsCount()).thenReturn(givenForumStats.postsCount());

        givenForumStats.calculateAdvStatistics(statsMock);

        //When
        double testAverageCommentsQuantityPerPost = givenForumStats.getAverageCommentsQuantityPerPost();

        //Then
        Assert.assertEquals(0.1, testAverageCommentsQuantityPerPost, 1.0);
    }
}
