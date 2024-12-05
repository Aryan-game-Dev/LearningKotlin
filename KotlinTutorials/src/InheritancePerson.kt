open class InheritancePerson(
    var name: String,
) {
    init {
        println("Hello,this is superclass")
    }

    fun changesName(newName: String){
        name = newName
    }
}