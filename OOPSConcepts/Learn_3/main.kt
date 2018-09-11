package OOPSConcepts.Learn_3

fun main(args : Array<String>){
    val listOfItems = listOf("salt","sugar","hot dog","ham","jam")
    val spiceLevel = listOf("mild","low","high","mild","low")
    for(i in 0..listOfItems.size-1){
        var s = Kot_3(listOfItems[i],spiciness = spiceLevel[i])
        println("Name : ${s.name}, Spiciness : ${s.spiciness}, Int representation : ${s.heat}")
    }
}