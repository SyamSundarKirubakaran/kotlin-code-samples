package OOPSConcepts.Learn_6

//abstract classes and interfaces

//abstract class
abstract class AssignColor(){
    abstract val color: String
}

//Interface
interface fixBug{
    fun fix()
}

class Kot_6(val corrected : Boolean) : AssignColor(),fixBug {

    override lateinit var color: String

    init {
        if(corrected) color = "Green"
        else color = "Red"
    }

    override fun fix() {
        println("Error fixed - value : ${this.color}")
    }

}