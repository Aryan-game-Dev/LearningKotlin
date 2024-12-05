fun main(){
    println("Enter a number")
    var x = readln()?.toInt()
    println("down count of $x is ")

    if(x != null) {
        while (x >= 0) {
            println(x)
            x--
        }
    }
}
