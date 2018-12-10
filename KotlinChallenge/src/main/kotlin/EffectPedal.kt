
enum class EffectType{
    VOLUME, PITCH, BYPASS
}

class EffectPedal(val name: String, val type: EffectType, val latency: Double) {

}