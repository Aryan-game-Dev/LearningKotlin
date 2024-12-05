fun main(){
      println("Enter n>1")
    var n = readln()?.toInt()


    var list = mutableListOf<Int>()
    list.add(0)
    list.add(1)
    if (n!=null) {

        for (i in 1..n-2) {

           list.add(list.elementAt(i-1)+list.elementAt(i) )

        }
        println(list)
    }
}