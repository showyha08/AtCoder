package abc360

fun main() {

    var n = readln().toInt()
    val aList = readln().split(" ").map { it.toInt() }
    val wList = readln().split(" ").map { it.toInt() }

    val aMap = mutableMapOf<Int, Int>()
    for (i in 0 until aList.size) {
        val w = aMap.get(aList[i])
        if (w == null) {
            aMap.put(aList[i], wList[i])
        } else {
            aMap.put(aList[i], Math.max(w, wList[i]))
        }
    }

    val total = aMap.map { it.value }.sum()
    val ans = wList.sum() - total

    println(ans)

}