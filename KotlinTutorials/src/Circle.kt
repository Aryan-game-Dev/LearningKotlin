class Circle (
    var radius: Double ){

    val PI = 3.141592

   init {
       println("Initialising a circle instance with radius $radius")
       println("Circle area is ${calculateArea()}")
       println("Circle perimetre is ${perimeter()}")
   }
    fun calculateArea(): Double {
        return PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * PI * radius
    }
}