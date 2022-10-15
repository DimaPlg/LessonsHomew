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
    else println("0")
}

fun horizontalVerticalCheck(kinX: Int, kinY: Int, figureOpponentX:Int, figureOpponentY:Int): Int {
    var res =0
    if(kinX == figureOpponentX)res = 1
    if(kinY == figureOpponentY)res = 1
    else res=0
    return(res)
}

fun diagonalCheck(kinX: Int, kinY: Int, figureOpponentX:Int, figureOpponentY:Int): Int {
    var res =0
    var kX = kinX
    var kY = kinY
    var fX = figureOpponentX
    var fY = figureOpponentY
    while(fY !=0){
        fX--
        fY--
    }
    while(fX !=9 || fY !=9){
        if(kX == fX && kY == fY){
            res++
            break
        }
        fX++
        fY++
    }

    fX = figureOpponentX
    fY = figureOpponentY

    while(fY !=0){
        fX++
        fY--
    }

    while(fX !=0 || fY !=9){
        if(kX == fX && kY == fY){
            res++
            break
        }
        fX--
        fY++
    }

    return(res)
}