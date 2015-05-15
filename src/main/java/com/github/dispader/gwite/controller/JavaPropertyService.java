package com.github.dispader.gwite.controller;

import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("javaProperty")
public class JavaPropertyService {
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TreeMap<String, String> get() {
        return new TreeMap(System.getProperties());
    }
    
}
