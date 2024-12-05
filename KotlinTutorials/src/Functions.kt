fun main(){

    println("Enter a number to find its sum from 1 to that digit")
    val num = readln()?.toInt()

    if (num!= null)
    {
        sum(    num)
    }

}

fun sum(nNum:Int){
var total = 0
    for (i in 1..nNum){
         total += i
    }
    println("Sum is $total")
}