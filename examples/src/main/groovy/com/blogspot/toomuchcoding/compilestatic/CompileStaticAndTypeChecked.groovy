package com.blogspot.toomuchcoding.compilestatic

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

class CompileStaticAndTypeChecked {
    DynamicPlayer player

    CompileStaticAndTypeChecked() {
        player = new DynamicPlayer()
    }

    /**
     * There is no method bar yet the code compiles - try to add @TypeChecked or @CompileStatic and the code won't compile
     */
    //@TypeChecked
    def groovy() {
        return player.bar
    }

    @TypeChecked
    def typeChecked() {
        return player.unknownType
    }

    @CompileStatic
    def staticCompiled() {
        return player.unknownType
    }
}
