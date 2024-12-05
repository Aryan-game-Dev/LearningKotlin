class InheritanceMale(

    val age:Int ,
    val gender:String ,
    val hobby:String
) :InheritancePerson(name = "Male"){

    init {
        println("Hello,this is subclass")
        println("My name is $name")
        println("I am $age years old")
        println("I am $gender")
        println("I like to $hobby")

    }
}