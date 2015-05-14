package unit

import spock.lang.Specification
import com.github.dispader.gwite.controller.PackageService

class PackageServiceSpec extends Specification
{
    
    def 'the package service returns runtime packages'() {
        when:
            def service = new PackageService()
            def packages = service.get()
        then:
            notThrown(Exception)
            packages != null
    }
    
    def 'the package service returns some expected test runtime packages'() {
        when:
            def service = new PackageService()
            def packages = service.get()
        then:
            expectedPackage in packages
        where:
            expectedPackage << ['com.github.dispader.gwite.controller', 'groovy.lang', 'spock.lang']
    }
    
    def 'the package service does not return Jetty envrionment properties'() {
        when:
            def service = new PackageService()
            def packages = service.get()
        then:
            ! ( expectedPackage in packages )
        where:
            expectedPackage << ['javax.ws.rs', 'org.glassfish.jersey', 'javax.validation']
    }
    
}
