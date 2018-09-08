
fun main(args : Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.sortedBy { it.length }) //sort by length
    println(spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }) //starts with c and ends with e
    println(spices.subList(0,3).filter { it[0] == 'c' }) //starts with c in the first 3
}