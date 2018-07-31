package io.falcon.api;

import com.jayway.restassured.authentication.OAuthSignature;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static com.jayway.restassured.RestAssured.given;

public class ApiRequests {


    public void postTweet(String tweet, String consumerKey, String consumerSecret, String token, String tokenSecret) throws InterruptedException, ExecutionException, IOException {


        given()
                .auth()
                .oauth(consumerKey, consumerSecret, token,
                        tokenSecret, OAuthSignature.HEADER)
                .contentType("application/json")
                .queryParam("status", tweet)
                .when()
                .post("/update.json")
                .then()
                .statusCode(200);
    }


}
