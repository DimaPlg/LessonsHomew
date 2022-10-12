package lesson_tasks_kotlin

fun minDivisor(n: Int) {
    //var n = 6
    for(i in 2..n){
        if(n % i == 0){
            println("Minimum divisor $i" )
            break
        }
    }

}