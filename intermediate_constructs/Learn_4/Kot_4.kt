package intermediate_constructs.Learn_4

// Extension Functions - Add functions to an exsisting class without having access to it's source code
fun String.hasSpace() : Boolean { // = find { it == ' ' } != null
    val found = this.find { it == ' ' }
    return found!=null
}


open class check(val color :String, val status : Boolean)

fun check.isGreen() = color == "Green" // can access only variable in the constructor or to the public variables, private can't be accessed

fun check.isRed() = color == "Red"

class doubleCheck : check("Red",false)

fun check.print() = println("Checked")
fun doubleCheck.print() = println("Double Checked")

val check.isGreenVal : Boolean
    get() = color == "Green"


fun main(args : Array<String>){
    println("Syam Sundar K".hasSpace())
    val c = check("Green" ,true)
    val c1 = check("Red",false)
    println("Check Green : ${c.isGreen()} , ${c.isRed()}")
    println("Check Red : ${c1.isGreen()} , ${c1.isRed()}")

    val a1 = doubleCheck()
    a1.print() //Double Checked

    val a2 : check = a1
    a2.print() //Checked

    println("${c.isGreenVal} , ${c1.isGreenVal}") //true , false
}