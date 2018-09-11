package OOPSConcepts.Learn_3

//Constructors
class Kot_3(var name : String = "Nothing", var spiciness : String = "mild"){

    var heat : Int
    var needed : Int

    init {
        when(spiciness){
            "less" -> {heat = 1}
            "mild" -> {heat = 2}
            "high" -> {heat =3}
            else -> {heat=0}
        }
        needed = 0
    }

    constructor( valueOfNeeded : Int) : this(){
        needed = valueOfNeeded
    }

}