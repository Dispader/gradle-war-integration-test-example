package com.github.dispader.gwite.controller

import javax.ws.rs.*

@Path('package')
class PackagesService {
    
    @Produces(['application/json']) @GET def get() {
        def runtimePackages = ClassLoader.getClassLoader(this.class).getPackages().collect() { it.name }
        def parentPackages = ClassLoader.getClassLoader(this.class).parent.getPackages().collect() { it.name }
        runtimePackages - parentPackages
    }
    
}
