fun main(args: Array<String>) {
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
    var bassPlayer : String = "Noel Redding"
    println("The band $bassPlayer on the four string bass")

    //Using expressions within concatanated strings.
    var dolarValue: Float = 3.20f
    println("100 Dolars is worth ${100 * dolarValue} in reais")


    //Using val creates an immutable value.
    val pi: Float = 3.14f; //Read only variable


}