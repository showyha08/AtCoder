package abc338

fun main() {
    val s = readln().groupBy { it }.toSortedMap()
    print(s.maxBy { it.value.size }.key)
}