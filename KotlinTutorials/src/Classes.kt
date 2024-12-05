fun main(){
    val myRect = Rectangle(5.0, 2.0)

    println("Rectangle area is ${myRect.calculateArea()}")
    println("rectangle perimeter is ${myRect.permeter()}")
    println("it is a square ${myRect.isSquare()}")

    val myCircle = Circle(19.0)

    val myTriangle = Triangle(3.0, 4.0, 5.0)
}