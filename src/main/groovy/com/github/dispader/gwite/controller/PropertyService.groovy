package com.github.dispader.gwite.controller

import javax.ws.rs.*

@Path('property')
class PropertyService {
    
    @Produces(['application/json']) @GET def get() {
        Properties properties = new Properties()
        properties.load(this.class.getClassLoader().getResourceAsStream('application.properties'))
        properties
    }
    
}
