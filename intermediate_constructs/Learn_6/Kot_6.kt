package intermediate_constructs.Learn_6

// Generic Classes with In and Out
// In - used when generics are only used as arguments - into an object
// Out - used when generics are ontly used as return types - out of an object
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

class Codebase<out T : performChecking>(val code : T){

    fun performedChecking(cleanCode: cleanCode<T>){
        if (code.needCheck){
            cleanCode.clean(code)
        }
        println("The result of checking is ${!code.needCheck}")
    }

}

interface cleanCode<in T: performChecking>{
    fun clean(p : T)
}

class codebaseCleaner : cleanCode<javaCheck>{
    override fun clean(p : javaCheck) {
        p.alreadyChecked()
    }

}

fun addLanguage(codebase: Codebase<performChecking>) = println("Checking Performed.!")

fun main(args : Array<String>){
    val cleaner = codebaseCleaner()
    val addLangInstance = Codebase(javaCheck())
    addLanguage(addLangInstance) //throws a compiler error if "out" is not provided in Codebase Class - because : to ensure type safety
    addLangInstance.performedChecking(cleaner)
}
