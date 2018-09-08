//Lambda expressions
val sample : (Int) -> Int = { sa -> sa * 10}

fun updateSample(sam : Int) = sam + 5

fun main(args : Array<String>){
    println(sample(20)) //200
    println(higherOrderFunctions(sample)) //30
    println(higherOrderFunctions(::updateSample)) //8
}

fun higherOrderFunctions(operations: (Int) -> Int): Int{
    return operations(3)
}