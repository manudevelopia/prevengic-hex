package info.developia.prevengic.model

import spock.lang.Specification

class ChemicalProfileTest extends Specification {

    def "ChemicalProfile test"() {
        given:
        Double vlaEc = 0.1D
        Double vlaEd = 0.2D

        when:
        ChemicalProfile profile = new ChemicalProfile(vlaEc: 0.1D, vlaEd: 0.2D)

        then:
        with(profile) {
            vlaEc == 0.1D
            vlaEd == 0.2D
        }
    }
}
