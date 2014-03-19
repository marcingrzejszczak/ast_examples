package scripts.ast

import com.blogspot.toomuchcoding.ast.script.WithLogging

@WithLogging
void doSth() {
    println "In the middle"
}

doSth()