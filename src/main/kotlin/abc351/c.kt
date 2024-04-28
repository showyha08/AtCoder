package abc351

// 学び：配列内の途中要素削除だと時間がかかる、末尾の追加や削除は時間がかからないO(1)

fun main() {
    readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    val arr = ArrayDeque(listOf<Int>())
    for (i in a.indices) {
        arr.add(a[i])
        while (arr.size > 1 && arr[arr.lastIndex] == arr[arr.lastIndex-1]) {
            val t = arr.last() + 1
            arr.removeLast()
            arr.removeLast()
            arr.add(t)
        }
    }
    print(arr.size)
}

