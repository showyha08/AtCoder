package abc351

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    repeat(n) {
        for (i in 0 until a.size -1) {
            if (a[i] == a[i + 1]) {
                val t = a[i] + 1
                a.removeAt(i)
                a.removeAt(i)
                a.add(i, t)
                break
            }
        }
        if( a.size == 1 ){
            print(1)
            return
        }
        if( a[0]!=a[1] ){
            print(a.size)
            return
        }
    }
    print(a.size)
}

