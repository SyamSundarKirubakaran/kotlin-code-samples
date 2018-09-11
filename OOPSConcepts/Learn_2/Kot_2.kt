package OOPSConcepts.Learn_2

class Kot_2{
    var name : String = "RE"
    var rating : String = "good"
    var numericVal : Int = 0

    var changeRating : String
        get() = rating
        set(value) { rating = value
            performCheck()
        }

    fun performCheck() = when(rating){
        "good" -> { numericVal = 10 }
        "mid" -> { numericVal = 5 }
        "bad" -> { numericVal = 2 }
        else -> { numericVal = 10 }
    }
}