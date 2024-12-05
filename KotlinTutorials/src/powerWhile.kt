fun main(){
    println("Enter a number")
    var x = readln()?.toInt()

    println("Enter another number")
    var y = readln()?.toInt()
    var b = y
    var c = 1
    if(x != null && y != null){

        while(y>0){

            c = c * x
            y--

        }

        println("$x to the power $b is $c")
    }
}