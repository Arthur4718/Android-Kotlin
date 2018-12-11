
enum class EffectType{
    CRYBABY, REVERB, DISTORTION
}

class EffectPedal(val name: String, val type: EffectType, val volume: Double) {

    override fun toString(): String {
        return "$name is Active at the vol $volume"
    }

}