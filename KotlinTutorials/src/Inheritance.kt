fun main(){

    val male = InheritanceMale(25,"m","cricket")
     male.changesName("Ronald")
    println(male.name)


    val female = InheritanceFemale(25,"f","football")
    female.changesName("Kim")
    println(female.name)
}