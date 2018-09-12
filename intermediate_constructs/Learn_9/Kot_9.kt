package intermediate_constructs.Learn_9

//Labeled Breaks
fun main(args : Array<String>){

    leave@ for(i in 0..100) {
        for (j in 0..100) {
            println("i: ${i}, j: ${j}")
            if (j > 50) break@leave
        }
    }

}