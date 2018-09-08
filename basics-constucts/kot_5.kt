//default arguments
fun main(args : Array<String>){
    haveFun(1)
    haveFun(2, name = "null")
    haveFun(3, value = "not null")
    println(fitMoreStuff(10.0, listOf(3,3,3)))
    println(fitMoreStuff(8.0, listOf(2,2,2), changes= false))
    println(fitMoreStuff(9.0, listOf(1,1,3), 3))
    println(fitMoreStuff(10.0, listOf(), 7, true) )
}

fun haveFun(number: Int, name : String = "Kotlin", value: String ="has every thing you need"){
    println("Number${number}, Name: ${name}, Value = ${value}")
}

fun fitMoreStuff(hold_size : Double , lengthOfEachEntity : List<Int> , content_size : Int = 2 , changes : Boolean = true) : Boolean{
    val whole_hold = hold_size * 0.8
    val iteratorOn = lengthOfEachEntity.iterator()
    var sum = 0
    while (iteratorOn.hasNext())
        sum += iteratorOn.next()
    sum += content_size
    if(changes) {
        // If there are changes then the contents should be 80 percent of the total context
        if(sum.toDouble() <= whole_hold)
            return true
    }else{
        // if not it can be take up all the space
        if(sum.toDouble() <= hold_size)
            return true
    }
    return false
}