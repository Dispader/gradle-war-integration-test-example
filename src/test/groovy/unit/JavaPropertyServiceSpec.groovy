package unit

import spock.lang.Specification
import com.github.dispader.gwite.controller.JavaPropertyService

class JavaPropertyServiceSpec extends Specification
{
    
    def 'the Java property service class returns properties'() {
        when:
            def service = new JavaPropertyService()
            def javaProperties = service.get()
        then:
            notThrown(Exception)
            javaProperties != null
    }
    
    def 'the Java property service class returns some expected properties'() {
        when:
            def service = new JavaPropertyService()
            def javaProperties = service.get()
        then:
            javaProperties[expectedProperty] != null
        where:
            expectedProperty << ['java.runtime.name', 'java.vm.name', 'java.version']
    }
    
    def 'the Java property service class does not return fishy properties'() {
        when:
            def service = new JavaPropertyService()
            def javaProperties = service.get()
        then:
            javaProperties[expectedProperty] == null
        where:
            expectedProperty << ['java.fishy.property']
    }
    
}
