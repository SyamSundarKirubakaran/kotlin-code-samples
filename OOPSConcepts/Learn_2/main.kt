package OOPSConcepts.Learn_2

fun main(args : Array<String>){
    val instanceGot = Kot_2()
    println("Name : ${instanceGot.name}, Rating : ${instanceGot.rating}, Numeric Value : ${instanceGot.numericVal}")
    instanceGot.changeRating = "bad"
    instanceGot.performCheck()
    println("Name : ${instanceGot.name}, Rating : ${instanceGot.rating}, Numeric Value : ${instanceGot.numericVal}")
}