package com.blogspot.toomuchcoding

import com.blogspot.toomuchcoding.equalshashcode.EqualsAndHashCodePlayer
import spock.lang.Specification

class EqualsAndHashCodeSpec extends Specification {
    
    def "should return true for equal player objects "() {
        given:
            EqualsAndHashCodePlayer player = new EqualsAndHashCodePlayer(name: "name", surname: "surname") 
            EqualsAndHashCodePlayer player2 = new EqualsAndHashCodePlayer(name: "name", surname: "surname")
        expect:
            player == player2 
    }
    
    def "should insert one entry in map for the same player"() {
        given:
            EqualsAndHashCodePlayer player = new EqualsAndHashCodePlayer(name: "name", surname: "surname")
            EqualsAndHashCodePlayer player2 = new EqualsAndHashCodePlayer(name: "name", surname: "surname")
            EqualsAndHashCodePlayer player3 = new EqualsAndHashCodePlayer(name: "differentName", surname: "differentSurname")
            def map = [(player): "one"]
            assert map.size() == 1
            println map
        when:
            map[player2] = "two"
        then:
            println map
            map.size() == 1
        when:
            map[player3] = "three"
        then:
            println map
            map.size() == 2

    }
}
