package OOPSConcepts.Learn_1

class Kot_1{
    var length : Int = 22
    var width : Int = 32
    var height : Int = 44

//    Getters
//    fun volume(): Int{                        //type 1
//        return length * width * height
//    }
//    --------------------
//    fun volume() = length * width * height    //type 2
//    ------------------
//    val volume : Int                          //type 3
//        get() {
//            length * width * height
//        }
//    --------------------
//    val volume : Int                            //type 4
//        get()  = length * width * height
//    -------------------

//    Setters
    var volume : Int
        get() = length * width * height
        set(value) { height = value + 30 }
}