package abc371

fun main() {
    val (ab, ac, bc) = readln().split(" ")

    val isAB = ab == "<"
    val isAC = ac == "<"
    val isBC = bc == "<"

    val isABC = isAB && isAC && isBC
    val isACB = isAB && isAC && !isBC
    val isBAC = !isAB && isAC && isBC
    val isBCA = !isAB && !isAC && isBC
    val isCAB = isAB && !isAC && !isBC
    val isCBA = !isAB && !isAC && !isBC

    if (isBAC || isCAB) {
        println("A")
    } else if (isABC || isCBA) {
        println("B")
    } else {
        println("C")
    }

}