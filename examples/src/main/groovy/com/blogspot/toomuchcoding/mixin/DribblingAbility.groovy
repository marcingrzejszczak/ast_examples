package com.blogspot.toomuchcoding.mixin

@Category(Athlete)
class DribblingAbility {
    String dribble() {
        return "My name is [${name}]. I can dribble." 
    }
}
