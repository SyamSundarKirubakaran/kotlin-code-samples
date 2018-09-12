package kotlin_specific

// Higher order functions
data class proLang1(val name: String)

fun main(args: Array<String>){
    val lang = proLang1("kotlin")

//    with(lang){
//        println(this.name.capitalize())
//    }

    caps(lang.name){
        println(capitalize())
        println(toUpperCase())
    }

    println(lang.run { name }) //returns the result of executing the lambda
    println(lang.apply { name }) //returns the object that is the result of execting the lambda

    val lang1 = proLang(name = "java").apply { name = "Java" } // returns the object after the lambda has been applied
    println(lang1.name)

    println(lang1.let { it.name.capitalize() }
            .let { it + " is great" }
            .let { it.length })
}

// Inline Functions - Lambdas are objects .i.e., functions are sub expressions of an object and for every time of it's execution
// new objects are created this leads to CPU overhead and therefore inlines.!
// Inlines replace the block calls of the lambdas with the statements inside them to reduce CPU overhead (cost of calling the function is now void)
// Inlines are good for function bodies with less LOC and not for huge functions
inline fun caps(name:String,block: String.() -> Unit){ //String.() is the class that we would wish to work on & it's the receiver function
    name.block()
}
