package integration

import groovyx.net.http.RESTClient;
import spock.lang.Specification

import com.github.dispader.gwite.controller.PackageService

class PackageServiceSpec extends Specification
{
    
    def 'the package service returns expected runtime packages'() {
        when: 'we visit the REST service'
           RESTClient client = (new RESTClient('http://localhost:8080/gradle-war-integration-test-example/rest/'))
           def response = client.get( path : 'package' )
        then: 'the service returns'
            notThrown(Exception)
            response.status         == 200
            response.contentType    == "application/json"
            expectedPackage in response.data
        where:
            expectedPackage << [ 'com.github.dispader.gwite.controller',
                                 'javax.ws.rs',
                                 'org.glassfish.jersey',
                                 'com.fasterxml.jackson.core' ]
    }
    
    def 'the package service does not return unexpected runtime packages'() {
        when: 'we visit the REST service'
           RESTClient client = (new RESTClient('http://localhost:8080/gradle-war-integration-test-example/rest/'))
           def response = client.get( path : 'package' )
        then: 'the service returns'
            notThrown(Exception)
            response.status         == 200
            response.contentType    == "application/json"
            ! ( unexpectedPackage in response.data )
        where:
            unexpectedPackage << [ 'spock.lang' ]
    }
    
}
