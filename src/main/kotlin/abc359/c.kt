package abc359

fun main() {
    var (sx, sy) = readln().split(" ").map { it.toLong() }
    var (tx, ty) = readln().split(" ").map { it.toLong() }

    if ((sx + sy) % 2 == 1L) --sx
    if ((tx + ty) % 2 == 1L) --tx

    val xr = Math.abs(tx - sx)
    val yr = Math.abs(ty - sy)

    val yc = Math.abs(ty - sy)
    val xc = Math.max(0, (Math.abs(tx - sx)) - yc) / 2

    if (xr <= yr) {
        print(yc)
    } else {
        print(yc + xc)
    }
}