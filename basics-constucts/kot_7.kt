fun main(args : Array<String>){
    println(findIdeal(20))
}

fun isHot(temp : Int) = if(temp >= 20) true else false

fun isCold(temp : Int) = if(temp <= 10) true else false

fun findIdeal(temp : Int) : Boolean{
    return when {
        isCold(temp) -> true
        isHot(temp) -> true
        else -> false
    }
}