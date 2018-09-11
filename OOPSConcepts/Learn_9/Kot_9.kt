package OOPSConcepts.Learn_9

//Objects similar to classes yet only one instance can be created
object Kot_9{
    val data : String = "null"
    fun manipulate(){
        //perform manipulation
    }
}

//Enumeration
enum class Color(val rgb : Int){
    RED(0),
    GREEN(1),
    BLUE(2)
}

//Sealed classes - can be accessed only within that file
sealed class programming

class kolin : programming()
class java : programming()

fun performMatch(pro : programming) : String{
    return when(pro){
        is kolin -> "Kotlin"
        is java -> "Java"
    }
}