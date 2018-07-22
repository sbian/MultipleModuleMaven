package com.hsbc;

import com.hsbc.CoreService;

public class APIService {
    public String apiService(){
        CoreService service = new CoreService();
        return service.getCoreService();
    }
}
