class Rectangle (
    var height: Double,
    var length: Double){

    init {
        println("Initializing a rectangle with height $height and length $length")
    }

    fun permeter(): Double {
        return 2*(height + length)
    }

    fun calculateArea(): Double {
        return height * length
    }

    fun isSquare() = length == height
}
