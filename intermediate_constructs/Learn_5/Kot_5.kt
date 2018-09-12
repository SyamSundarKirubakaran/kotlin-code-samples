package intermediate_constructs.Learn_5

// Generic Classes
open class performChecking(var needCheck : Boolean)

class javaCheck : performChecking(true){
    fun alreadyChecked(){
        needCheck = false
    }
}

class kotlinCheck : performChecking(false)

class cppCheck : performChecking(true){

    fun compilationCheck(){
        needCheck = false
    }

}

class Codebase<T : performChecking>(val code : T){

    fun performedChecking(){
        check(!code.needCheck) { "Error" } // If the condition inside check is satisfied go on to the next statement else throw an exception with the given error message
        println("The result of checking is ${!code.needCheck}")
    }

}

fun main(args : Array<String>) {
    val codebaseInstance = Codebase(javaCheck())
    codebaseInstance.code.alreadyChecked() //if this line is commented it throughs an illegal state exception
    codebaseInstance.performedChecking() // The result of checking is true

    // String can also be passed at this point but this shouldn't happen
    // This is a problem
//    val codebaseInstance1 = Codebase("String") // To avoid this use the top of the hierarchy instead of Any as generic Constraint
//    println(codebaseInstance1.code)

    // null also works this is a bang bang problem in deed
    // This is because T by default stands for nullable any-type  i.e., <T : Any?> to be not null change it to <T : Any> this will cause a compiler error when you try to pass null reference
//    val codebaseInstance2 = Codebase(null)

}