fun main(args : Array<String>){
    println("1:")
    println(whatShouldIDoToday(readLine()!!))
    println("2:")
    println(whatShouldIDoToday(readLine()!!,weather = readLine()!!))
    println("3:")
    println(whatShouldIDoToday(readLine()!!, weather = readLine()!! ,temperature = readLine()!!.toInt()))
}

fun whatShouldIDoToday(mood : String , weather : String = "sunny", temperature : Int = 24): String {
    return when(mood){
        "happy" -> if(weather.equals("cold")) "go out" else "stay home"
        "sad" -> if(weather.equals("sunny")) "stay home for sure" else "it's alright"
        else -> "you are disturbed"
    }
}