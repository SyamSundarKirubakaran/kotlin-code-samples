package OOPSConcepts.Learn_5

open class Book(var name : String = "null" , var author : String = "null"){

    var currentPage : Int
    var wordCount : Int

    init {
        currentPage = 0
        wordCount = 0
    }

    open fun readPage(){
        currentPage+=1
    }
}

class eBook : Book(){

    override fun readPage() {
        currentPage+=1
        wordCount+=250 //on an average a page has 250 words
    }

}