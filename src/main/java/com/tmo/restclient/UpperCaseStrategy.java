package com.tmo.restclient;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class UpperCaseStrategy extends PropertyNamingStrategy.PropertyNamingStrategyBase {
    public UpperCaseStrategy() {
    }

    public String translate(String input) {
        return input.toUpperCase();
    }
}