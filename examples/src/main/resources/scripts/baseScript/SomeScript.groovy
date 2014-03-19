package scripts.baseScript

import com.blogspot.toomuchcoding.basescript.NewBaseScript
import groovy.transform.BaseScript

println "Hello"

@BaseScript NewBaseScript newBaseScript

assert newBaseScript == this
assert newBaseScript.hello() == hello()

return hello()