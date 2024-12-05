fun main(){
    println("Enter 5 numbers")
    var list = mutableListOf<Int>()
    for(i in 0..4){
        var num = readLine()!!.toInt()
        list.add(num)
    }
    println("Reversed list")
    for (i in list.reversed() ){
        println(i)
    }
}