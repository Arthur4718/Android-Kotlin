class Player(val name : String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    //Class example
    var guitar: Guitar = Guitar("Stratocaster", 1964)

    fun showStatus() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            """)
    }
}