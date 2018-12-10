fun main(args: Array<String>) {

    val hendrix = Player("Jimmy Hendrix",27, "Washington", 100)
    hendrix.showStatus()
    val pedal1 = EffectPedal("Dunlop", EffectType.CRYBABY, volume =  8.50)
    hendrix.guitarEffects.add(pedal1)



}

