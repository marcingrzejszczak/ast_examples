package com.blogspot.toomuchcoding.ast

import spock.lang.Specification

class ClassWithAstSpec extends Specification {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream()

    def setup() {
        System.out = new PrintStream(outContent)
    }

    def "should print content of the method in the class together with the logic from AST transform"() {
        given:
            ClassWithAst objectUnderTest = new ClassWithAst()
        when:
            objectUnderTest.doSth()
        then:
            "Starting doSth\r\n" +
            "In the middle\r\n" +
            "Ending doSth\r\n" == outContent.toString()
    }

    def cleanup() {
        System.out = null
    }
}
