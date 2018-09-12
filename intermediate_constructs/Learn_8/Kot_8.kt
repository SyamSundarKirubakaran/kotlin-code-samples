package intermediate_constructs.Learn_8

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

//Annotations
@ThisIsCode class Code{
    fun compileCode(){}
    fun runCode(){}

    @get:onGet
    val isReady : Boolean = true

    @set:onSet
    var toCode : Boolean = false

}

annotation class ThisIsCode

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class onGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class onSet

fun main(args : Array<String>){
    val classObj = Code :: class
    for (method in classObj.declaredMemberFunctions){
        println(method.name)
    }

    //returns all annotations
    for (annotations in classObj.annotations){
        println(annotations.annotationClass.simpleName)
    }

    //Find specific annotations
    val anno = classObj.findAnnotation<ThisIsCode>()

    anno?.apply {
        println("Found @ThisIsCode")
    }
}