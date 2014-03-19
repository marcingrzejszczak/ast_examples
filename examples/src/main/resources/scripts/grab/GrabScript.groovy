package scripts.grab

import org.apache.commons.lang.StringUtils

ARG = this.args[0] as String
println "Passed argument [$ARG]"
println "Grabbing apache commons library from maven central repo"
@Grapes(
    @Grab(group='commons-lang', module='commons-lang', version='[2.6,)')
)
isBlank = { String input -> StringUtils.isBlank(input)}

println "Is string blank? [$isBlank(ARG)]"