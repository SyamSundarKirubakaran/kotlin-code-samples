package OOPSConcepts.Learn_1

fun main(args : Array<String>){
    initBuild()
}

fun initBuild(){
    val build = Kot_1() //similar to new in Java, invokes the constructor
    println("Length : ${build.length}, Width : ${build.width}, Height : ${build.height}") //getter are made implicitly by Kotlin
    build.volume = 46
    println("Height : ${build.height}")
    print(build.volume)
}