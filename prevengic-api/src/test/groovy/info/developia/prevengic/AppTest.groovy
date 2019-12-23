package info.developia.prevengic

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.main([] as String[])

        then:
        result == null
    }
}
