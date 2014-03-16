package com.blogspot.toomuchcoding

import spock.lang.Specification

class GrabSpec extends Specification {

    def "should grab dependencies and check that string's not blank"() {
        given: "A script in resources folder (/scripts/grab/GrabScript.groovy)"
        when: "I execute it from the command line"
        then: "it should work :P"
    }

}
