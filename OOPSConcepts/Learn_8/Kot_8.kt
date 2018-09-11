package OOPSConcepts.Learn_8

//Data classes
fun main(args : Array<String>){

    val d1 = data(true)
    val d2 = data(false)
    val d3 = data(false)
    println("${d1} , ${d2}")

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = d1.copy()
    println("${d4}")

    val d5 = data1("Int",false)
    println(d5)

    val (hint : String, hintType : Boolean) = d5
    println("${hint} , ${hintType}")


}

data class data(val status : Boolean)

data class data1(val dataType : String, val construct : Boolean)