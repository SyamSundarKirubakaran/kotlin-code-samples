import java.util.*
import kotlin.math.roundToInt

fun main(args : Array<String>){
    println("Random Number ${(Math.random()*10).roundToInt()}")
    println("Random Number ${Random().nextInt(7)}")
    print("Enter your birthday: ")
    // bang bang can return null
    val day = readLine()!!.toInt() % 7
    val yourFortune = getFortunateCookies(day)
    println("The fortune of your day is ${yourFortune}")
}

fun getFortunateCookies(index : Int) : String {
    val values = arrayListOf<String>("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    return values.get(index)
}