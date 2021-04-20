package com.tmo.restclient.model;

import lombok.Data;

import java.util.List;

@Data
public class RestResponse<V> {
    String status;
    String message;
    List<V> results;
}
