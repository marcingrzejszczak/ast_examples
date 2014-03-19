package com.blogspot.toomuchcoding.ast.script

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(["com.blogspot.toomuchcoding.ast.script.WithAroundASTTransformation"])
public @interface WithLogging {

}
