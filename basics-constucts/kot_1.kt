import java.util.*

fun main(args : Array<String>){
    println("Hello Kotlin")
    dayOfWeek()
}

fun dayOfWeek(){
    //days of the week starts with sunday
    val days = arrayOf("Sun","Mon","Tue","Wed","Thur","Fri","Sat")
    println("The day of the week is:${Calendar.getInstance().get(Calendar.DAY_OF_WEEK)}")
    val i = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(i){
        // i-1 is because the index of the array starts from 0 where as the Days in the weeks returned starts with 1
        i -> println(days.get(i-1))
    }
}