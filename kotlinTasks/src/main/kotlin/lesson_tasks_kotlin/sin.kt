package lesson_tasks_kotlin


fun sin(x: Double, eps: Double) {
    var factorialVariable = 1
    var resFact = 10.0
    var res = 0.0
    var sign = 0



    while(resFact >= eps){
        res += sign(sign) * (powL(x , factorialVariable)/factorial(factorialVariable))
        resFact = powL(x , factorialVariable)/factorial(factorialVariable) - powL(x , (factorialVariable - 2))/factorial((factorialVariable-2))
        factorialVariable += 2
        sign++
    }

    println()
    println(res)
}

fun sign(factorialV: Int): Int {
    var resSing:Int
    if(factorialV % 2 == 0) resSing = 1
    else resSing = -1
    return(resSing)
}

fun powL(y:Double, n:Int): Double {
    var resPow:Double = 1.0
    for(i in 0..n){
        resPow *= y
    }
    return(resPow)
}

fun factorial(factorialVar:Int): Int {
    var resFactoring = 1
    for(i in 1..factorialVar){
        resFactoring*=i
    }
    return(resFactoring)
}