package abc362

//    val ab = Math.sqrt(Math.pow(ax - bx, 2.0) + Math.pow(ay - by, 2.0))
//    val ac = Math.sqrt(Math.pow(ax - cx, 2.0) + Math.pow(ay - cy, 2.0))
//    val bc = Math.sqrt(Math.pow(bx - cx, 2.0) + Math.pow(by - cy, 2.0))
//    if (Math.pow(ab, 2.0) + Math.pow(ac, 2.0) == Math.pow(bc, 2.0)
//        || Math.pow(ab, 2.0) + Math.pow(bc, 2.0) == Math.pow(ac, 2.0)
//        || Math.pow(ac, 2.0) + Math.pow(bc, 2.0) == Math.pow(ab, 2.0)
//    ) {
//        println("Yes")
//        return
//    }


fun main() {
    val (ax, ay) = readln().split(" ").map { it.toDouble() }
    val (bx, by) = readln().split(" ").map { it.toDouble() }
    val (cx, cy) = readln().split(" ").map { it.toDouble() }
    val ab = Math.pow(ax - bx, 2.0) + Math.pow(ay - by, 2.0)
    val ac = Math.pow(ax - cx, 2.0) + Math.pow(ay - cy, 2.0)
    val bc = Math.pow(bx - cx, 2.0) + Math.pow(by - cy, 2.0)
    if (ab + ac == bc
        || ab + bc == ac
        || ac + bc == ab
    ) {
        println("Yes")
        return
    }

    println("No")
}
