package unit

import spock.lang.Specification
import com.github.dispader.gwite.controller.PropertyService

class PropertyServiceSpec extends Specification
{
    
    def 'the properties service returns a set of loaded properties'() {
        when:
            def service = new PropertyService()
            def properties = service.get()
        then:
            notThrown(Exception)
            properties != null
            properties['name'] == 'unit test property value'
    }
    
}
