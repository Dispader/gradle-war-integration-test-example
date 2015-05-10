package com.github.dispader.gwite.controller

import javax.ws.rs.*

@Path('environmentVariable')
class EnvironmentVariableService {
    @Produces(['application/json']) @GET def get() { System.getenv() }
}
