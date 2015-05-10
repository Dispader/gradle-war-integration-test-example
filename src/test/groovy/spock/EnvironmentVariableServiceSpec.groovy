package spock

import spock.lang.Specification
import com.github.dispader.gwite.controller.EnvironmentVariableService

class EnvironmentVariableServiceSpec extends Specification
{
    
    def 'the envrionment service can return a full environment map'() {
        when:
            def service = new EnvironmentVariableService()
            def environment = service.get()
        then:
            notThrown(Exception)
            environment != null
    }
    
    def 'the envrionment service returns some expected values'() {
        when:
            def service = new EnvironmentVariableService()
            def environment = service.get()
        then:
            environment[expecteEnvironmentVariable] != null
        where:
            expecteEnvironmentVariable << ['HOME', 'JAVA_HOME']
    }
    
    def 'the envrionment service does not return fishy values'() {
        when:
            def service = new EnvironmentVariableService()
            def environment = service.get()
        then:
            environment[expecteEnvironmentVariable] == null
        where:
            expecteEnvironmentVariable << ['FISHY_ENV_VARIABLE']
    }
    
}
