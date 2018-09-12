package kotlin_specific

//Lambdas


data class proLang(var name: String)

fun main(args : Array<String>){
    val programmingList = listOf(proLang("kotlin"),proLang("java-i"),proLang("cpp"))
    println(programmingList.filter { it.name.contains("i") }.joinToString(" * ") {it.name}) //lambdas within { }
}