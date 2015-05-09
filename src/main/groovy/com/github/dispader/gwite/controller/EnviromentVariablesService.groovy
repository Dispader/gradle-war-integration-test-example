package com.github.dispader.gwite.controller

import javax.ws.rs.*

@Path('environmentVariables')
class EnvironmentVariablesService {
    @Produces(['application/json']) @GET def get() { System.getenv() }
}
