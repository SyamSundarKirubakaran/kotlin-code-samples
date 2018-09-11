package OOPSConcepts.Learn_4

//Inheritence
open class Kot_4(var need1 : Int = 0){

    open var innerSample : Int = 1

    init {
        innerSample = need1
        println("${need1}")
    }

}

class derivedClass : Kot_4() {

    override var innerSample: Int
        get() = super.innerSample
        set(value) { super.innerSample = value }

}
