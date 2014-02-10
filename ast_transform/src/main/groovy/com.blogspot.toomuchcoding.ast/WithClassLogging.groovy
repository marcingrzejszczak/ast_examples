package com.blogspot.toomuchcoding.ast

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass(["com.blogspot.toomuchcoding.ast.WithAroundASTTransformationForClass"])
public @interface WithClassLogging {

}