class Player(val name : String, var age: Int = 1, var origin: String, var revenue : Int) {

    var guitar: Guitar = Guitar("Stratocaster", 1964)
    fun showStatus() {
        println("""
            name: $name
            age: $age
            origin: $origin
            revenue: $revenue
            guitar: ${guitar.name}
            value: ${guitar.value}
            """)
    }
}