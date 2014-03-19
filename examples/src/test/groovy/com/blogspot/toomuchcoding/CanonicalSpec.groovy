package com.blogspot.toomuchcoding

import com.blogspot.toomuchcoding.canonical.CanonicalPlayer
import spock.lang.Specification

class CanonicalSpec extends Specification {
    
    def "should return equal objects by instantiation using map arguments and created constructor"() {
        given:
            def player = new CanonicalPlayer(name: "name", surname: "surname", positions: ["forward", "defence"], age: 10, skills: ["offence": "good", "defence": "bad"])
        when:            
            def canonicalPlayer = new CanonicalPlayer("name", "surname", ["forward", "defence"], 10, ["offence": "good", "defence": "bad"])
        then:
            player == canonicalPlayer
            !player.is(canonicalPlayer)
    }

    def "should have an overridden toString method"() {
        given:
            def player = new CanonicalPlayer(name: "name", surname: "surname", positions: ["forward", "defence"], age: 10, skills: ["offence": "good", "defence": "bad"])
        when:
            String toString = player.toString()
        then:
            !toString.contains(Integer.toHexString(player.hashCode()))
            println toString
    }

    def "should have an overridden hashcode method"() {
        given:
            def player = new CanonicalPlayer(name: "name", surname: "surname", positions: ["forward", "defence"], age: 10, skills: ["offence": "good", "defence": "bad"])
        when:
            def canonicalPlayer = new CanonicalPlayer("name", "surname", ["forward", "defence"], 10, ["offence": "good", "defence": "bad"])
        then:
            player.hashCode() == canonicalPlayer.hashCode()
    }

}
