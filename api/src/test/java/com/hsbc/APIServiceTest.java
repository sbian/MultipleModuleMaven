package com.hsbc;

import org.junit.Test;

import static org.junit.Assert.*;

public class APIServiceTest {
    @Test
    public void apiService() {
        APIService apiService = new APIService();
        assertEquals("Welcome to Core Services!", apiService.apiService());
    }
}