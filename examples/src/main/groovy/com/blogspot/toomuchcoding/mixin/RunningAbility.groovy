package com.blogspot.toomuchcoding.mixin

@Category(Athlete)
class RunningAbility {
    String run() {
        return "My name is [${name}]. I can run." 
    }
}
