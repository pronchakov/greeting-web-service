package edu.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

// Bottom-up-service

@WebService
public class GreetingService {

    @WebMethod
    @WebResult(name = "greetingResult")
    public String greeting(@WebParam(name = "name") String name) {

        return "Hello " + name;
    }

}
