class Player(val name : String, var age: Int = 1, var origin: String, var revenue : Int) {

    var guitar: Guitar = Guitar("Stratocaster", 1964)
    var guitarEffects  = ArrayList<EffectPedal>()
    fun showStatus() {

        if(age > 27){

        }else{

        }

    }

    override fun toString(): String {
        return """
            name: $name
            age: $age
            origin: $origin
            revenue: $revenue
            guitar: ${guitar.name}
            value: ${guitar.value}
            """
    }

    fun showActivePedals(){
        println("$name's Active Pedals: ")
        println(guitarEffects[0])
        println("==========================")
    }

}