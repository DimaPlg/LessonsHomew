package lesson_tasks_kotlin

fun roman(number: Int) {
    //var number = 8345
    var res:Int
    val numbers = Array(13, {0})

    numbers[0] = number / 1000
    for(i in 1 .. numbers[0]){
        print("M")
    }
    res = number - (numbers[0] * 1000)
    numbers[1] = res / 900
    for(i in 1 .. numbers[1]){
        print("CM")
    }
    res -= numbers[1] * 900
    numbers[2] = res / 500
    for(i in 1 .. numbers[2]){
        print("D")
    }
    res -= numbers[2] * 500
    numbers[3] = res / 400
    for(i in 1 .. numbers[3]){
        print("CD")
    }
    res -= numbers[3] * 400
    numbers[4] = res / 100
    for(i in 1 .. numbers[4]){
        print("C")
    }
    res -= numbers[4] * 100
    numbers[5] = res / 90
    for(i in 1 .. numbers[5]){
        print("XC")
    }
    res -= numbers[5] * 90
    numbers[6] = res / 50
    for(i in 1 .. numbers[6]){
        print("L")
    }
    res -= numbers[6] * 50
    numbers[7] = res / 40
    for(i in 1 .. numbers[7]){
        print("XL")
    }
    res -= numbers[7] * 40
    numbers[8] = res / 10
    for(i in 1 .. numbers[8]){
        print("X")
    }
    res -= numbers[8] * 10
    numbers[9] = res / 9
    for(i in 1 .. numbers[9]){
        print("IX")
    }
    res -= numbers[9] * 9
    numbers[10] = res / 5
    for(i in 1 .. numbers[10]){
        print("V")
    }
    res -= numbers[10] * 5
    numbers[11] = res / 4
    for(i in 1 .. numbers[11]){
        print("IV")
    }
    res -= numbers[11] * 4
    numbers[12] = res
    for(i in 1 .. numbers[12]){
        print("I")
    }
}

