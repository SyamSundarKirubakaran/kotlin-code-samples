package kotlin_specific

// SAM - Single Abstract Method
// They are nothing but interfaces with a single method
interface Runnable{
    fun run()
}

interface Callable<T>{
    fun call(): T
}

fun main(args: Array<String>){

    // This is how the override method can be accessed but in Kotlin lambdas can be used in place of SAM
    val runnable = object: Runnable{
        override fun run() {
            println("Inside Runnable")
        }
    }

    // Result of SAM through Lambdas
    Runnable {
        println("Inside Runnable Lambda")
    }

}