fun main() {

    println("Enter a country")
    val country = readln()

    when (country) {
        "India" -> println("namaste")
        "USA", "England" -> println("hello")

        else -> println("no country")

    }
}
