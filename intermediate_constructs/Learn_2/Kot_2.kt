package intermediate_constructs.Learn_2

fun main(args : Array<String>){

    // Lists

    val initialList = listOf("s1","s2","s3","s4")
    println(initialList.reversed())

    val reversedList = reverseList(initialList)
    println(reversedList)

    val initList = mutableListOf("a1","a2","a3","a4")
    initList.add("a5")
    initList.remove("a2")
    println(initList.toString())
    println(initList.contains("a3"))
    println(initList.subList(0,3))

    println(listOf(1,2,3,4,5).sum())
    println(listOf("ssss","ss","wwww").sumBy { it.length })

    //Maps

    val initMap = mapOf("green" to "correct","red" to "incorrect") //Key Value pairs
    println(initMap.get("green"))
    println(initMap["green"])

    println(initMap.getOrDefault("yellow","Not found"))
    initMap.getOrElse("voilet") { println("${3+5}") }

    val mutableMap = mutableMapOf("green" to "correct","red" to "incorrect")
    mutableMap.put("yellow","May be correct")
    mutableMap.put("orange","suggested some changes")
    println(mutableMap.toString())
    mutableMap.remove("red")
    println(mutableMap.toString())

}

fun reverseList(gotList: List<String>) : List<String>{
    val resultantList = mutableListOf<String>()
//    for (i in gotList.size-1 downTo 0)
//        resultantList.add(gotList[i])

    val i : ListIterator<String> = gotList.listIterator(gotList.size)
    while (i.hasPrevious())
        resultantList.add(i.previous())

    return resultantList
}