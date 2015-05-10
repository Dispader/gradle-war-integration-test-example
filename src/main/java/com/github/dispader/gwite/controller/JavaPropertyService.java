package com.github.dispader.gwite.controller;

import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("javaProperty")
public class JavaPropertyService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Properties get() {
        return System.getProperties();
    }
    
}