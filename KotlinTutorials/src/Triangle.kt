import kotlin.math.sqrt

class Triangle
    (var sideA: Double,
     var sideB: Double,
     var sideC: Double){

        init {
            println("Initializing a triangle of sides $sideA, $sideB, $sideC")

            println("Area of Triangle is ${area()}")

            println("Perimeter of Triangle is ${perimeter()}")


        }
    fun perimeter() = sideA + sideB + sideC

    fun area() : Double{

        val p = perimeter()
        val a = sqrt((p/2)*((p/2)-sideA)*((p/2)-sideB)*((p/2)-sideC))

        return a
    }
}