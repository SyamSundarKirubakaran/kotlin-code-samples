package intermediate_constructs.Learn_1

//Pairs
fun main(args : Array<String>){
    val samplePair = 1 to 2 to 3 to "Hi"
    println(samplePair) //(((1, 2), 3), Hi)
    println(samplePair.first) //((1, 2), 3)
    println(samplePair.first.second) // 3

    val samplePair1 = (1 to 2) to (3 to 4)
    println(samplePair1) //((1, 2), (3, 4))
    println(samplePair1.second.first) //3

    val samplePair2 = Pair(1, 2)
    val (val1 , val2) = samplePair2 //destructuring
    println("${val1} , ${val2}")

    val sampleList = samplePair2.toList() //change it to a list
    println(sampleList)

    println(performOperation()) //(Kotlin, Craze)

    val sampleTriplet = Triple(1,2,3)
    val sampleTriplet1 = Triple(1,2,Triple(3,4,5))
    println("${sampleTriplet.first} , ${sampleTriplet1.third.second}") //1 , 4

    val book = "Harry Potter" to "J K Rowling" to 2008
    println("Here is ${book.first.first} written by ${book.first.second} on ${book.second}")
}

fun performOperation(): Pair<String,String>{
    return "Kotlin" to "Craze"
}