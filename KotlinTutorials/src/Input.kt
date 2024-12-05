fun main(){
    print("Enter your age: ")
    val age  = readLine()?.toInt()

    if(age != null ){

          var a = age.toInt()

        if(a > 18 )
        {
            println("You are old enough to vote")
        }
        else{
            println("You are not old enough to vote")
        }
    }
    else{
        println("You did not enter a number")
    }

}