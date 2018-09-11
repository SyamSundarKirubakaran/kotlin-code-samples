package OOPSConcepts.Learn_7

//Interface Deligation
fun main(args : Array<String>){
    delegate()
}

fun delegate() {
    val instance = check() //check(greenColor, true)
    println("Current color : ${instance.currentColor}")
    instance.performAction()
}

interface action{
    fun performAction()
}

interface color{
    val currentColor : String
}

class check(color1 : color = redColor , actionStatus : Boolean  = false):
        action by actionDone(actionStatus),
        color by color1


object greenColor : color{
    override val currentColor: String
        get() = "Green"
}

object redColor : color{
    override val currentColor: String
        get() = "Red"
}

class actionDone(val correction : Boolean) : action{
    override fun performAction() {
       println("Correction done : ${correction}")
    }
}