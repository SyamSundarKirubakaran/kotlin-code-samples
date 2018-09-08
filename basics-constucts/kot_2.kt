fun main(args : Array<String>){
    //return type of the print statement in kotlin is always units
    println(println("This is the argument which is been passed : ${args[0]+" "+args[1]}"))
    println("${if(args[2].toInt()> 12) "Afternoon" else "morning"}")

    val age = 20
    //direct usage of contri=ol statements
    println("You are ${if(age>18) "eligible" else "Not eligible"} to vote")

}