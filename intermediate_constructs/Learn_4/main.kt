package intermediate_constructs.Learn_4

class check1(val color : String , val status : Boolean)

// check if it's null
fun check1?.checkNull(){
    this?.apply {
        println("Removing ${this}")
    }
}

fun main(args : Array<String>){
    val c : check1 ?= null
    c.checkNull()
}