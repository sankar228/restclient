package com.tmo.restclient;

import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class GenericRestClient<T, V> {

    public ResponseEntity<V> makeRequest(String url, T request, Class<V> responseType) {
        ResponseErrorHandler responseHandler = new ResponseErrorHandler() {

            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {

                if (response.getStatusCode() != HttpStatus.OK) {
                    System.out.println(response.getStatusText());
                }
                return response.getStatusCode() != HttpStatus.OK;
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                // TODO Auto-generated method stub

            }
        };


        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(responseHandler);

        HttpHeaders header = new HttpHeaders();
        HttpEntity<T> entity = new HttpEntity(request, header);

        ResponseEntity<V> response = restTemplate.exchange(url, HttpMethod.GET, entity, responseType);

        return response;
    }
}
