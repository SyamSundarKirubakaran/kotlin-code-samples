fun main(args: Array<String>) {
    var fortune: String
    println(getFortune()) // default args will be used
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int = 1): String {
    return when(birthday){
        1 -> "You will have a great day!"
        2 -> "Things will go well for you today."
        3 -> "Enjoy a wonderful day of success."
        4 -> "Be humble and all will turn out well."
        5 -> "Today is a good day for exercising restraint."
        6 -> "Take it easy and enjoy life!"
        7 -> "Treasure your friends because they are your greatest fortune."
        else -> "Not found"
    }
}

fun getBirthday(): Int {
    println("Enter your birth date:")
    return readLine()!!.toInt() % 7
}
