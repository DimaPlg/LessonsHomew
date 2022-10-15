package lesson_tasks_kotlin

fun rookOrBishopThreatens(
    kingX: Int, kingY: Int,
    rookX: Int, rookY: Int,
    bishopX: Int, bishopY: Int
) {
    var resultRook = 0
    var resultBishop = 0
    resultRook = horizontalVerticalCheck(kingX, kingY, rookX, rookY) + diagonalCheck(kingX, kingY, rookX, rookY)
    resultBishop = horizontalVerticalCheck(kingX, kingY, bishopX, bishopY)

    if(resultRook == 1) println("1")
    if(resultBishop == 1) println("2")
    if(resultRook + resultBishop == 2) println("3")
    if(resultRook == 0 && resultBishop ==0) println("0")
}

fun horizontalVerticalCheck(kinX: Int, kinY: Int, figureOpponentX: Int, figureOpponentY: Int): Int {
    var res = 0
    if(kinX == figureOpponentX)res++
    if(kinY == figureOpponentY)res++
    else res=0
    return(res)
}

fun diagonalCheck(kinX: Int, kinY: Int, figureOpponentX: Int, figureOpponentY: Int): Int {
    var fX = figureOpponentX
    var fY = figureOpponentY
    var kX = kinX
    var kY = kinY
    var res = 0


    while(fY >1 && fX >1){
        fX--
        fY--
    }
    while(fX < 9 && fY < 9){
        if(kX == fX && kY == fY){
            res++
            break
        }
        fX++
        fY++
    }

    fX = figureOpponentX
    fY = figureOpponentY

    while(fY > 1 && fX < 8){
        fX++
        fY--
    }

    while(fX >0 && fY <9){
        if(kX == fX && kY == fY){
            res = 1
            break
        }
        fX--
        fY++
    }

    return(res)
}