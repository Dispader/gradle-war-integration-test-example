package com.github.dispader.gwite.controller;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("env")
public class Service {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getEnv() {
        return System.getenv();
    }
    
}
