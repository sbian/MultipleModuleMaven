package com.hsbc;
import static org.junit.Assert.assertEquals;

public class CoreServiceTest {

    @org.junit.Test
    public void getCoreServiceTest(){
        CoreService coreService = new CoreService();
        assertEquals("Welcome to Core Services!", coreService.getCoreService());
    }
}