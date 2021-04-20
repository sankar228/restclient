package com.tmo.restclient;

import com.tmo.restclient.model.RestResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class RestclientApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(RestclientApplication.class, args);

            String url = "https://domain-name.com/query";
            GenericRestClient restClient = new GenericRestClient();
            var response = (ResponseEntity<RestResponse>) restClient.makeRequest(url, new RestResponse(), RestResponse.class);

            System.out.println("Response:" + response.getBody().getResults().get(2));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

}
