package intermediate_constructs.Learn_7

import com.sun.org.omg.SendingContext.CodeBase

// Generic Functions
// At run time all the generics are erased and replaced with appropriate data types
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
    //Generic Method
    inline fun <reified R: performChecking> doesItCheck() = code is R
}

//Extension function
inline fun <reified R: performChecking> Codebase<*>.hastobeDone() = code is R

// Generic Functions are usually used when the arguments passed in are instance of classes that are generic
fun <T: performChecking> isCodeChecker(codebase: Codebase<T>){
    println("The value is ${codebase.code.needCheck}")
}

fun main(args : Array<String>){
    val codebaseInstance = Codebase(cppCheck())
    println(codebaseInstance.doesItCheck<cppCheck>()) //pass cppCheck for type parameter for R
    isCodeChecker(codebaseInstance)
    println(codebaseInstance.hastobeDone<javaCheck>())
    //true
    //The value is true
    //false
}