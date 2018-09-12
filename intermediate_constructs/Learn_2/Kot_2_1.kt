package intermediate_constructs.Learn_2

fun main(args : Array<String>){

    val books = setOf("book1","book2","book3")
    val library = mapOf("book1" to "author1", "book2" to "author2", "book3" to "author3")

    println(books.any {it.contains("book1")})
    println(library.containsValue("author0"))

    val mutableMap = mutableMapOf<String,String>("book1" to "author1")
    val pair1 = Pair("book1","author7")
    val pair2 = Pair("book4","author4")
    mutableMap.getOrPut("book1") {"author100"} //if already present doesn't replace
    mutableMap.getOrPut("book4") {"author4"} //new entries are accepted
    println(mutableMap.toString()) //{book1=author1, book4=author4}
}