package info.developia.prevengic

import spock.lang.Specification

class LibraryTest extends Specification {

    def "someLibraryMethod returns true"() {
        setup:
        def lib = new PersistenceService()

        when:
        def result = lib.getSqlSession()

        then:
        result != null
    }

}
