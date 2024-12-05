fun main() {
val index = findIndex()
    println("the index is $index")
}

fun userInputList(): MutableList<Int>
{

    println("Enter the size of the list")

    var list = mutableListOf<Int>()
    val listsize = readln()?.toInt()

    if (listsize != null) {

        println("Enter the numbers")

        for (i in 1..listsize) {


            var num = readln()?.toInt()
            if (num != null) {
                list.add(num)
            }


        }

    }
    return list
}

fun findIndex(): Int
{
    var index = 0
    var list = userInputList()
    println("Enter the number u want to find index for")
    var num = readln()?.toInt()
    if (num != null) {

        for (i in 0..<list.size) {
            if (list.elementAt(i) == num) {
                index = i
            }
        }
    }
return index
}


