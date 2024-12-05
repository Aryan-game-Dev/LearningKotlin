fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    println("product of $list is ${list.product()}")
}
 fun List<Int>.product(): Int {
     var result = 1
     for (i in this) {
         result *= i
     }
     return result
 }


