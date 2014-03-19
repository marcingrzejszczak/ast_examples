package com.blogspot.toomuchcoding.mixin

@Category(Athlete)
class TennisAbility {
    String backhand() {
        return "My name is [${name}]. I can use my backhand." 
    }
}
