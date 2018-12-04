package com.redhat.example.simplerestapp;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloService {

    @GET
    public String sayHello(@QueryParam("name") String name) {
        if(name==null) {
            return "Hello, world!";
        }
        return "Hello, " + name;
    }
}
