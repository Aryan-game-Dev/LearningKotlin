fun main(){
    val sum = alternatingSum(1,278,3,10,5,6,15)
    println("the alternative sum is $sum")
}
fun alternatingSum(vararg numbers: Int): Int {

    var sum = 0
    for(i in numbers.indices){
        if(i%2 == 0){
            sum += numbers[i]
        }
        else{
            sum -= numbers[i]
        }
    }
    return sum

}