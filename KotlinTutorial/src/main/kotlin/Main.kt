fun main(args: Array<String>) {

    //instantiating an object example
    val guitarPlayer = Player("Jimmy")
    guitarPlayer.showStatus();

    println( guitarPlayer.guitar.name.toUpperCase()  )
    println( guitarPlayer.guitar.year   )

    val newGuitar = Guitar("Ibanez", 2005)
    


    val guitarPlayer2 = Player("Tom")
    guitarPlayer2.level = 6
    guitarPlayer2.guitar = newGuitar
    println(guitarPlayer2.guitar.name.toUpperCase())
    guitarPlayer2.showStatus()


    var drummer = Player("David Coppperfield", 4, 8)
    drummer.showStatus()

    var vocal = Player("Axel", 2, 5, 1000)
    vocal.showStatus()

}

fun variableTypes() {

    println("Hello World")

    val player: String = "Jimmy Hendrix" // Imediatte assignment
    val age: Int = 27
    var wage: Float = 20.60f
    val year = 1993 // Int type is inferred


    println("The best player in the world was " + player)
    println("He died at the ag of " + age)
    println("I was born in " + year)

    //Concatenate strings - there is sense using + to concatenate strings
    // instead use $var
    val bassPlayer: String = "Noel Redding"
    println("The band $bassPlayer on the four string bass")

    //Using expressions within concatanated strings.
    val dolarValue: Float = 3.20f
    println("100 Dolars is worth ${100 * dolarValue} in reais")


    //Using val creates an immutable value.
    val pi: Float = 3.14f; //Read only variable

}

fun conditionals() {
    val lives = 3;

    if (lives < 1) {
        println("Game Over!");
    } else {
        println("you are still alive!")
    }

    //You can also assing the result of logic operation

    val kingLives = 3
    var isGameOver = (kingLives < 1)
    if (isGameOver) {
        println("Game Over!");
    } else {
        println("you are still alive!")
    }

    println("How many strings a guitar has?")
    val numberOfStrings = readLine()!!.toInt()
    println("Your answer was $numberOfStrings")

    //lifted ifs using if statements in a more kotlin like way

    val message: String
    message = if (numberOfStrings < 6) {
        "The guitar has more strings than that"
    } else if (numberOfStrings == 6) {
        "you're right sir"
    } else {
        "The guitar dosent have that many"
    }
//    val message: String
//    message = if (numberOfStrings < 6) {
//        "The guitar has more strings than that"
//    } else if (numberOfStrings == 6) {
//        "you're right sir"
//    } else {
//        "The guitar dosent have that many"
//    }

    println(message)
}