package integration

import spock.lang.Specification
import com.github.dispader.gwite.controller.PropertyService
import groovyx.net.http.RESTClient

class PropertyServiceSpec extends Specification
{
    
    def 'the properties service class returns a set of loaded properties'() {
        when:
            def service = new PropertyService()
            def properties = service.get()
        then:
            notThrown(Exception)
            properties != null
            properties['name'] == 'integration test property value'
    }
    
    def 'the properties service returns expected properties'() {
        when: 'we visit the REST service'
           RESTClient client = (new RESTClient('http://localhost:8080/gradle-war-integration-test-example/rest/'))
           def response = client.get( path : 'property' )
        then: 'the service returns'
            notThrown(Exception)
            response.status         == 200
            response.contentType    == "application/json"
            response.data.name == 'integration test property value'
    }
    
}
