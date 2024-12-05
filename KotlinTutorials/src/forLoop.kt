fun main() {
    var b = 0
    var c = 0

    println("Enter 5 numbers")

    for(i in 1..5)
    {

        var a = readLine()?.toInt()
        if(a != null){
            b += a
            c++
        }

    }
    println("the avg of all number is ${b/c}")
}