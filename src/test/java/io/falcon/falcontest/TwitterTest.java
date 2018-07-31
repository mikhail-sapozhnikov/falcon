package io.falcon.falcontest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TwitterTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        initDriver();
    }

    @Test
    public void createAndDeleteTweet() throws InterruptedException, ExecutionException, IOException {

        apiRequests.postTweet("This tweet should be deleted!",
                "2OqnerJUNXhFqXblN3XATXQdQ",
                "1WvkDaj6mTVQzIjMcGO5dz2AmT677z2IGR79cLx3SMyZeQaOuF",
                "1023134607141732353-ZXLp6nvGSYcEQANEbliJlFeP7G5Jav",
                "I2tt5rusxIlxbGKTqoz7NXk8ch3oi17i4kwIpHu9iasDz");

        openTwitterPage();

        loginPage.enterLogin("Mikhail23839210");
        loginPage.enterPassword("falcontest");
        loginPage.clickLoginBtn();
        mainPage.deleteTweet();

    }


    @AfterMethod
    public void tearDown() {
        quitDriver();
    }


}
