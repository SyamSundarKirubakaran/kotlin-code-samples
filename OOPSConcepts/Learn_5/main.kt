package OOPSConcepts.Learn_5

fun main(args : Array<String>){
    val instance = eBook()
    println("Before reading page : ${instance.currentPage} (Page) , ${instance.wordCount} (wordcount)")
    instance.readPage()
    println("Before reading page : ${instance.currentPage} (Page) , ${instance.wordCount} (wordcount)")
}