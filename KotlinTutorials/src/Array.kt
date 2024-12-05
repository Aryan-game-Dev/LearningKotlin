fun main(){
    val array = arrayOf(1,2,3,4,5)

    var c = array.size
    var sum=0
    while (c>0)
    {
       sum += array[c-1]
       c--
    }
    println("sum of all array element is $sum")
}