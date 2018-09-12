package intermediate_constructs.Learn_3

const val maxBorrow = 5

class Kot_3{

    companion object Constants{
        const val BASE_URL = "Harry_Potter"
    }

    fun canBorrow(numHave : Int) : Boolean {
        if(numHave < maxBorrow)
            return true
        else
            return false
    }

    fun printUrl() : String{
        println("${Constants.BASE_URL}.html")
        return "${Constants.BASE_URL}.html"
    }
}